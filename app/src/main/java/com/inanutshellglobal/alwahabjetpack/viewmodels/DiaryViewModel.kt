package com.inanutshellglobal.alwahabjetpack.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inanutshellglobal.alwahabjetpack.models.Diary
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.repository.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class DiaryViewModel @Inject constructor(private val repository : StudentRepository) : ViewModel() {

    val diary: StateFlow<List<Diary>>
        get() = repository.diary

    init {
        val dateString = "12-08-2023"
        val formatter = SimpleDateFormat("dd-MM-yyyy")
        val date: Date = formatter.parse(dateString)

        viewModelScope.launch {
            repository.getDiary("12", date)
        }
    }
}