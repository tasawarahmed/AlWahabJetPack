package com.inanutshellglobal.alwahabjetpack.api

import com.inanutshellglobal.alwahabjetpack.Composables.Announcement
import com.inanutshellglobal.alwahabjetpack.models.Diary
import com.inanutshellglobal.alwahabjetpack.models.Fee
import com.inanutshellglobal.alwahabjetpack.models.Result
import com.inanutshellglobal.alwahabjetpack.models.Student
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import java.util.Date

interface SchoolAPI {

    @GET("students")
    suspend fun getStudents(@Header("parentID") pID: String) : Response<List<Student>>

    @GET("results")
    suspend fun getResult(@Header("StuID") sID: String) : Response<List<Result>>

    @GET("diary")
    suspend fun getDiary(@Header("classID") cID: String, @Header("date") date: Date) : Response<List<Diary>>

    @GET("paidFee")
    suspend fun getPaidFee(@Header("stuID") sID: String) : Response<List<Fee>>

    @GET("unPaidFee")
    suspend fun getUnPaidFee(@Header("stuID") sID: String) : Response<List<Fee>>

    @GET("announcements")
    suspend fun getAnnouncements() : Response<List<Announcement>>
}