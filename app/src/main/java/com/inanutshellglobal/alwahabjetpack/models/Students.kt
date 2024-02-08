package com.inanutshellglobal.alwahabjetpack.models

data class Student(val id: Int, val name: String, val currentClass: String)

val students = listOf(
    Student(1, "Amina", "Class 8"),
    Student(2, "Tariq", "Class 7"),
    Student(3, "Momin", "Class 6"),
    Student(4, "Momina", "Class 5"),
    Student(5, "Khadija", "Class 4"),
    Student(6, "Fehmida", "Class 3"),
    Student(7, "Romana", "Class 2")
)
