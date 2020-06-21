package com.hans.ord

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hans.ord.character.UnitGrade
import com.hans.ord.common.Event
import com.hans.ord.common.toEvent

class MainViewModel: ViewModel() {

    private val _doSearch = MutableLiveData<Event<Unit>>()
    val doSearch: LiveData<Event<Unit>> get() = _doSearch

    private val _showSelectGradeBottomSheet = MutableLiveData<Event<UnitGrade>>()
    val showSelectGradeBottomSheet: LiveData<Event<UnitGrade>> get() = _showSelectGradeBottomSheet

    fun onClickSearch() {
        _doSearch.value = Unit.toEvent()
    }

    fun onClickSelectGrade(grade: UnitGrade) {
        _showSelectGradeBottomSheet.value = grade.toEvent()
    }
}