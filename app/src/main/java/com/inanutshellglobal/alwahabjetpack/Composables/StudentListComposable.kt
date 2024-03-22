package com.inanutshellglobal.alwahabjetpack.Composables

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inanutshellglobal.alwahabjetpack.models.students
import com.inanutshellglobal.alwahabjetpack.R
import com.inanutshellglobal.alwahabjetpack.StudentDetailsActivity
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.viewmodels.StudentViewModel

@Composable
fun StudentList() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.list_background_image),
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
                .fillMaxHeight(0.10f),
            contentAlignment = Alignment.TopStart
        ) {
            Column {
                Text(
                    text = "Hello! Welcome to Al Wahab School",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .background(
                            color = colorResource(
                                id = R.color.blue_button
                            )
                        )
                        .fillMaxWidth(1f)
                        .padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
                Text(
                    text = "Please Select Your Student...",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .background(
                            color = colorResource(
                                id = R.color.blue_button
                            )
                        )
                        .fillMaxWidth(1f)
                        .padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }
        val studentViewModel : StudentViewModel = viewModel()
        studentViewModel.getStudents("abc")
        val myStudents: State<List<Student>> = studentViewModel.students.collectAsState()

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(myStudents.value) { student ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            context.startActivity(
                                Intent(
                                    context,
                                    StudentDetailsActivity::class.java
                                )
                            )
                        },
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.blue_button),
                        contentColor = colorResource(
                            id = R.color.white
                        )
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 15.dp
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.student_image),
                            contentDescription = "Student Image",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(80.dp))
                        )
                        Column(
                            modifier = Modifier.padding(start = 16.dp)
                        ) {
                            Text(
                                text = "ID: ${student.id}",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Name: ${student.name}",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Class: ${student.currentClass}"
                            )
                        }
                    }
                }
            }
        }
    }
}

