package com.inanutshellglobal.alwahabjetpack

data class Result(val subject: String, val totalMarks: Int, var obtainedMarks: Int, val grade: String)

val results = listOf(
    Result("English",100, 80, "A+"),
    Result("Urdu",100, 90, "A+"),
    Result("Maths",100, 70, "A"),
    Result("Science",100, 60, "A"),
    Result("S. St.",100, 50, "B"),
    Result("Islamiat",100, 40, "C"),
    Result("Computer",100, 30, "D"),
    Result("Quran",100, 20, "E")
)