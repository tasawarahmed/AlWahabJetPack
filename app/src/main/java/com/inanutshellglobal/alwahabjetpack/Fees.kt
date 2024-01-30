package com.inanutshellglobal.alwahabjetpack


data class Fee(val id: Int, val feeMonth: String, val feeYear: String, val feeType: String, val feeAmount: Int, val dueDate: String, val isPaid: Boolean)

val fees = listOf(
    Fee(1, "January", "2023", "Tuition Fee", 1000, "10-Jan-2023", true),
    Fee(2, "February", "2023", "Tuition Fee", 1000, "10-Feb-2023", false),
    Fee(3, "March", "2023", "Annual Charges", 1000, "10-Mar-2023", false),
    Fee(4, "April", "2023", "Tuition Fee", 1000, "10-Apr-2023", false),
    Fee(5, "May", "2023", "Tuition Fee", 1000, "10-May-2023", false),
    Fee(6, "June", "2023", "Test Session Fee", 1000, "10-Jun-2023", true),
    Fee(7, "July", "2023", "Tuition Fee", 1000, "10-Jul-2023", false),
    Fee(8, "August", "2023", "Tuition Fee", 1000, "10-Aug-2023", true),
    Fee(9, "September", "2023", "Tuition Fee", 1000, "10-Sep-2023", true),
    Fee(10, "October", "2023", "Tuition Fee", 1000, "10-Oct-2023", true)
)