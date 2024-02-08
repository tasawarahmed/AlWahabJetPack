package com.inanutshellglobal.alwahabjetpack.Composables

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Announcement(val startDate: Date?, val endDate: Date?, val message: String)

val announcements = listOf(
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-January-2024"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("28-February-2024"), "Annual Exams are going to start from 1st of February 2024. Please collect your datesheet from school office."),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-December-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-January-2024"), "How is Mother"),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-November-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-December-2023"), "How is Father"),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-October-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("30-November-2023"), "How is Brother"),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-September-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("30-October-2023"), "How is Sister"),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-August-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("30-September-2023"), "How is Uncle"),
    Announcement(SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("31-July-2023"), SimpleDateFormat("dd-MMMM-yyyy", Locale.US).parse("30-August-2023"), "How is Aunty"),
)