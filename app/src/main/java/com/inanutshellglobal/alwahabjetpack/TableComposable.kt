package com.inanutshellglobal.alwahabjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.ui.res.colorResource

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(BorderStroke(2.dp, color = colorResource(id = R.color.fee_card)))
            .weight(weight)
            .padding(8.dp),
        color = colorResource(id = R.color.white)
    )
}

@Composable
fun TableScreen() {

    // Each cell of a column must have the same weight.
    val column1Weight = .3f // 30%
    val column2Weight = .7f // 70%

    // The LazyColumn will be our table. Notice the use of the weights below
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        // Here is the header
        item {
            Row(Modifier.background(color = colorResource(id = R.color.fee_card))) {
                TableCell(text = "Subjects", weight = column1Weight)
                TableCell(text = "Assignments", weight = column2Weight)
            }
        }
        // Here are all the lines of your table.
        items(diaries) {
            val (subject, task) = it
            Row(Modifier.fillMaxWidth().background(color = colorResource(id = R.color.fee_card).copy(alpha = 0.3f))) {
                TableCell(text = subject, weight = column1Weight)
                TableCell(text = task, weight = column2Weight)
            }
        }
    }
}