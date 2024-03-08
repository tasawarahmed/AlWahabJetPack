package com.inanutshellglobal.alwahabjetpack.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inanutshellglobal.alwahabjetpack.models.Result
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.repository.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(private val repository : StudentRepository) : ViewModel() {

    val results: StateFlow<List<Result>>
        get() = repository.result

    init {
        viewModelScope.launch {
            repository.getResult("abc")
        }
    }
}