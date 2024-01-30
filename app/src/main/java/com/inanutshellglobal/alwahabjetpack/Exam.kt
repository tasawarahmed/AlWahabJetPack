package com.inanutshellglobal.alwahabjetpack

import kotlin.collections.mutableListOf

data class Exam(val id: Int, val examName: String)

val exams = mutableListOf(
    Exam(1, "Monthly Tests January 2023"),
    Exam(2, "Monthly Tests February 2023"),
    Exam(3, "Monthly Tests March 2023"),
    Exam(4, "Term Tests April 2023"),
    Exam(5, "Monthly Tests May 2023"),
    Exam(6, "Monthly Tests June 2023"),
    Exam(7, "Term Tests July 2023"),
    Exam(8, "Monthly Tests August 2023")
)

fun addExam(){
    if (exams[0].examName != "Please Select an Exam"){
        exams.add(0, Exam(0, "Please Select an Exam"))
    }
}