package com.inanutshellglobal.alwahabjetpack.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.repository.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StudentViewModel @Inject constructor(private val repository : StudentRepository) : ViewModel() {

    val students: StateFlow<List<Student>>
        get() = repository.students

    fun getStudents(parentID: String){
        viewModelScope.launch {
            repository.getStudents(parentID)
        }
    }

    init {
    }
}