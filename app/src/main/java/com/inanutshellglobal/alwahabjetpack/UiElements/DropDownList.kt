package com.inanutshellglobal.alwahabjetpack.UiElements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.foundation.clickable
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.*
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import com.inanutshellglobal.alwahabjetpack.models.Exam
import com.inanutshellglobal.alwahabjetpack.models.addExam
import com.inanutshellglobal.alwahabjetpack.R

@Composable
fun RoundedDropdownMenu(
    exams: List<Exam>,
    onExamSelected: (Int) -> Unit
) {
    addExam()
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(0) }

    Box(modifier = Modifier.padding(15.dp)) {
        Text(
            text = exams[selectedIndex].examName,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable { expanded = true }
                .background(
                    color = colorResource(id = R.color.fee_card).copy(alpha = 0.6f),
                    RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.fee_card), RoundedCornerShape(8.dp))
        ) {
            exams.forEachIndexed { index, exam ->
                DropdownMenuItem(text = {
                    Text(
                        text = exam.examName,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }, onClick = {
                    selectedIndex = index
                    expanded = false
                    onExamSelected(exam.id)
                })
            }

        Icon(
            imageVector = Icons.Default.ArrowDropDown,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 16.dp)
                .align(Alignment.Start)
        )
        }
    }
}