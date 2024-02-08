package com.inanutshellglobal.alwahabjetpack.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.inanutshellglobal.alwahabjetpack.models.exams
import com.inanutshellglobal.alwahabjetpack.models.results
import com.inanutshellglobal.alwahabjetpack.R
import com.inanutshellglobal.alwahabjetpack.UiElements.TableCell
import com.inanutshellglobal.alwahabjetpack.UiElements.RoundedDropdownMenu

@Composable
fun StudentResult() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.details_background_image),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Add your other composables here
    }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.05f),
            contentAlignment = Alignment.TopStart
        ) {
            Column {
                Text(
                    text = "Student: ...",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .background(
                            color = colorResource(
                                id = R.color.fee_card
                            ).copy(alpha = 0.6f)
                        )
                        .fillMaxWidth(1f)
                        .padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
        var selectedExamId = 0
        Text(
            text = "Please Select Your Exam:",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(5.dp)
        )
        RoundedDropdownMenu(exams = exams, onExamSelected = { selectedId -> selectedExamId = selectedId })
        //ExamDropdownList(exams = exams, onExamSelected = { selectedId -> selectedExamId = selectedId })

        Text(
            text = "Your Result for Selected Exam: $selectedExamId",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(5.dp)
        )
        ResultTableScreen()
    }
}


@Composable
fun ResultTableScreen() {
    // Each cell of a column must have the same weight.
    val column1Weight = .30f // 30%
    val column2Weight = .25f // 25%
    val column3Weight = .25f // 20%
    val column4Weight = .2f // 20%

    // The LazyColumn will be our table. Notice the use of the weights below
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        // Here is the header
        item {
            Row(Modifier.background(color = colorResource(id = R.color.fee_card))) {
                TableCell(text = "Subjects", weight = column1Weight)
                TableCell(text = "Total", weight = column2Weight)
                TableCell(text = "Marks", weight = column3Weight)
                TableCell(text = "Grade", weight = column4Weight)
            }
        }
        // Here are all the lines of your table.
        items(results) {
            val (subject, totalMarks, obtainedMarks, grade) = it
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.fee_card).copy(alpha = 0.6f))) {
                TableCell(text = subject, weight = column1Weight)
                TableCell(text = totalMarks.toString(), weight = column2Weight)
                TableCell(text = obtainedMarks.toString(), weight = column3Weight)
                TableCell(text = grade, weight = column4Weight)
            }
        }
        // Here is the footer
        item {
            Row(Modifier.background(color = colorResource(id = R.color.fee_card))) {
                TableCell(text = "Total", weight = column1Weight)
                TableCell(text = "800", weight = column2Weight)
                TableCell(text = "600", weight = column3Weight)
                TableCell(text = "B", weight = column4Weight)
            }
        }
    }
}

