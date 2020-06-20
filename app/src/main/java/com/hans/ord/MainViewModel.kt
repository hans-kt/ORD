package com.hans.ord

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hans.ord.common.Event
import com.hans.ord.common.toEvent

class MainViewModel: ViewModel() {

    private val _doSearch = MutableLiveData<Event<Unit>>()
    val doSearch: LiveData<Event<Unit>> get() = _doSearch

    private val _showSelectGradeBottomSheet = MutableLiveData<Event<String>>()
    val showSelectGradeBottomSheet: LiveData<Event<String>> get() = _showSelectGradeBottomSheet

    fun onClickSearch() {
        _doSearch.value = Unit.toEvent()
    }

    fun onClickSelectGrade(grade: String) {
        _showSelectGradeBottomSheet.value = grade.toEvent()
    }
}