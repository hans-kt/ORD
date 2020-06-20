package com.hans.ord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.RecyclerView
import com.hans.ord.character.*
import com.hans.ord.common.toast
import com.hans.ord.databinding.ActivityMainBinding
import com.hans.ord.extension.observe
import kotlinx.android.synthetic.main.search_result_item.view.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val GRADE_BOTTOM_SHEET_TAG = "grade bottom sheet tag"
        private const val NO_GRADE = "등급선택"
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            viewModel = this@MainActivity.viewModel
            lifecycleOwner = this@MainActivity
            grade = NO_GRADE
        }.also {
            binding = it
        }
        initView()
        initViewModel()
    }

    private fun initView() {
        binding.searchResult.adapter = SearchResultAdapter()
    }

    private fun initViewModel() {
        viewModel.showSelectGradeBottomSheet.observe(this) {
            if (it.hasBeenHandled.not()) {
                var position: Int? = null
                val currentGrade = it.getContentIfNotHandled()
                UnitGrade.values().forEachIndexed { index, grade ->
                    if (grade.grade == currentGrade) {
                        position = index
                    }
                }
                UnitGradeBottomSheet(position).apply {
                    itemClickListener = { grade ->
                        if(binding.grade != grade.grade) {
                            (binding.searchResult.adapter as SearchResultAdapter).list = emptyList()
                            binding.grade = grade.grade
                        }
                    }
                    show(
                        supportFragmentManager,
                        GRADE_BOTTOM_SHEET_TAG
                    )
                }
            }
        }
        viewModel.doSearch.observe(this) {
            val gradeText: String = binding.gradeTxt.text.toString()
            val keyword: String = binding.searchKeyword.text.toString()
            val list = mutableListOf<UnitInterface>()

            when (gradeText) {
                UnitGrade.COMMON.grade -> {
                    Common.values().forEach { common ->
                        addUnit(common, keyword, list)
                    }
                }
                UnitGrade.UNCOMMON.grade -> {
                    UnCommon.values().forEach { uncommon ->
                        addUnit(uncommon, keyword, list)
                    }
                }
                UnitGrade.RARE.grade -> {
                    Rare.values().forEach { rare ->
                        addUnit(rare, keyword, list)
                    }
                }
            }
            (binding.searchResult.adapter as SearchResultAdapter).run {
                this.list = list
                notifyDataSetChanged()
            }
        }
    }

    private fun addUnit(unit: UnitInterface, keyword: String, list: MutableList<UnitInterface>) {
        if(unit.getUnitName().contains(keyword)) list.add(unit)
    }


    private class SearchResultAdapter : RecyclerView.Adapter<SearchResultViewHolder>() {
        var list = listOf<UnitInterface>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultViewHolder {
            return SearchResultViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.search_result_item, parent, false)
            )
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: SearchResultViewHolder, position: Int) {
            holder.bind(list[position])
        }
    }

    private class SearchResultViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(unit: UnitInterface) {
            itemView.search_result_unit_name.text = unit.getUnitName()
            itemView.setOnClickListener {
                toast(it.context, "${unit.getCombination()}\n${unit.getCommonUnitCount()}")
            }
        }
    }
}