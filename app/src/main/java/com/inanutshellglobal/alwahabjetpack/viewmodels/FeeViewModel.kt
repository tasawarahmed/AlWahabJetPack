package com.inanutshellglobal.alwahabjetpack.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inanutshellglobal.alwahabjetpack.models.Fee
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.repository.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeeViewModel @Inject constructor(private val repository : StudentRepository) : ViewModel() {

    val unpaidFee: StateFlow<List<Fee>>
        get() = repository.unpaidFee

    val paidFee: StateFlow<List<Fee>>
        get() = repository.paidFee

    init {
        viewModelScope.launch {
            repository.getPaidFee("12")
            repository.getUnPaidFee("12")
        }
    }
}