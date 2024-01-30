package com.inanutshellglobal.alwahabjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ExamDropdownList(
    exams: List<Exam>,
    onExamSelected: (Int) -> Unit
) {
    addExam()
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(0) }

    Box (modifier = Modifier.padding(15.dp)) {
        Text(
            text = exams[selectedIndex].examName,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable { expanded = true }
                .background(color = colorResource(id = R.color.fee_card).copy(alpha = 0.5f))
                .padding(16.dp)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.fee_card))
        ) {
            exams.forEachIndexed { index, exam ->
                DropdownMenuItem(text = { Text(text = exam.examName, color = Color.White, fontWeight = FontWeight.Bold) }, onClick = {
                    selectedIndex = index
                    expanded = false
                    onExamSelected(exam.id)
                })
            }
        }
    }
}