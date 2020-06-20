package com.hans.ord

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hans.ord.character.UnitGrade
import com.hans.ord.extension.gone
import com.hans.ord.extension.invisible
import com.hans.ord.extension.visible
import kotlinx.android.synthetic.main.bottom_sheet_unit_grade.*
import kotlinx.android.synthetic.main.bottom_sheet_unit_grade_item.view.*

class UnitGradeBottomSheet(
    private val selectedPosition: Int? = null
) : BottomSheetDialogFragment() {

    var itemClickListener: (UnitGrade) -> Unit = { }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_unit_grade, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        grade_recycler_view.adapter = GradeAdapter().apply {
            selectedPosition = this@UnitGradeBottomSheet.selectedPosition
            itemClickListener = {
                this@UnitGradeBottomSheet.itemClickListener.invoke(it)
                dismissAllowingStateLoss()
            }
        }
    }

    private class GradeAdapter : RecyclerView.Adapter<GradeViewHolder>() {

        var selectedPosition: Int? = null
        var itemClickListener: (UnitGrade) -> Unit = { }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GradeViewHolder {
            return GradeViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.bottom_sheet_unit_grade_item, parent, false).apply {
                    setOnClickListener {
                        itemClickListener.invoke(tag as UnitGrade)
                    }
                })
        }

        override fun getItemCount(): Int {
            return UnitGrade.values().size
        }

        override fun onBindViewHolder(holder: GradeViewHolder, position: Int) {
            holder.bind(UnitGrade.values()[position], selectedPosition == position)
        }
    }

    private class GradeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(unitGrade: UnitGrade, selected: Boolean) {
            itemView.tag = unitGrade
            itemView.grade_title.text = unitGrade.grade
            itemView.grade_image.run {
                this.setImageDrawable(GradientDrawable().apply {
                    setColor(Color.parseColor("#000000"))
                    gradientRadius = 150F
                    this.cornerRadius = 150F
                })
                if(selected) {
                    visible()
                } else {
                    invisible()
                }
            }
        }
    }
}