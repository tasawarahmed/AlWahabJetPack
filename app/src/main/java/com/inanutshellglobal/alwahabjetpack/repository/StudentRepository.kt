package com.inanutshellglobal.alwahabjetpack.repository

import com.inanutshellglobal.alwahabjetpack.Composables.Announcement
import com.inanutshellglobal.alwahabjetpack.api.SchoolAPI
import com.inanutshellglobal.alwahabjetpack.models.Diary
import com.inanutshellglobal.alwahabjetpack.models.Fee
import com.inanutshellglobal.alwahabjetpack.models.Result
import com.inanutshellglobal.alwahabjetpack.models.Student
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Date
import javax.inject.Inject

class StudentRepository @Inject constructor(private val schoolAPI: SchoolAPI) {

    //Private state flow objects
    private val _students = MutableStateFlow<List<Student>>(emptyList())
    private val _announcements = MutableStateFlow<List<Announcement>>(emptyList())
    private val _paidFee = MutableStateFlow<List<Fee>>(emptyList())
    private val _unpaidFee = MutableStateFlow<List<Fee>>(emptyList())
    private val _result = MutableStateFlow<List<Result>>(emptyList())
    private val _diary = MutableStateFlow<List<Diary>>(emptyList())

    //Public state flow objects
    val students : StateFlow<List<Student>>
        get() = _students
    val announcements : StateFlow<List<Announcement>>
        get() = _announcements
    val paidFee : StateFlow<List<Fee>>
        get() = _paidFee
    val unpaidFee : StateFlow<List<Fee>>
        get() = _unpaidFee
    val result : StateFlow<List<Result>>
        get() = _result
    val diary : StateFlow<List<Diary>>
        get() = _diary

    suspend fun getStudents(parentID: String){
        val response = schoolAPI.getStudents(parentID)
        if(response.isSuccessful && response.body() != null) {
            _students.emit(response.body()!!)
        }
    }
    suspend fun getAnnouncements(){
        val response = schoolAPI.getAnnouncements()
        if(response.isSuccessful && response.body() != null) {
            _announcements.emit(response.body()!!)
        }
    }

    suspend fun getPaidFee(stuID: String){
        val response = schoolAPI.getPaidFee(stuID)
        if(response.isSuccessful && response.body() != null) {
            _paidFee.emit(response.body()!!)
        }
    }
    suspend fun getUnPaidFee(stuID: String){
        val response = schoolAPI.getUnPaidFee(stuID)
        if(response.isSuccessful && response.body() != null) {
            _unpaidFee.emit(response.body()!!)
        }
    }

    suspend fun getResult(stuID: String){
        val response = schoolAPI.getResult(stuID)
        if(response.isSuccessful && response.body() != null) {
            _result.emit(response.body()!!)
        }
    }

    suspend fun getDiary(classID: String, date: Date){
        val response = schoolAPI.getDiary(classID, date)
        if(response.isSuccessful && response.body() != null) {
            _diary.emit(response.body()!!)
        }
    }
}