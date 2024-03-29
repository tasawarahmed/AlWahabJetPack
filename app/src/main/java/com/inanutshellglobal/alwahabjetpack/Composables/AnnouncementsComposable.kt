package com.inanutshellglobal.alwahabjetpack.Composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.unit.sp
import com.inanutshellglobal.alwahabjetpack.R
import java.text.DateFormat
import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inanutshellglobal.alwahabjetpack.viewmodels.AnnouncementsViewModel
import java.util.Stack

@Composable
fun AnnouncementList(announcements: List<Announcement>) {
    val sortedAnnouncements = announcements.sortedByDescending { it.endDate }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.white_background3),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Add your other composables here
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Important Announcements",
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            //fontSize = 20.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium
        )

        val announcementsViewModel : AnnouncementsViewModel = viewModel()
        val myAnnouncements: State<List<Announcement>> = announcementsViewModel.announcements.collectAsState()

        LazyColumn {
            items(myAnnouncements.value) { announcement ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.white)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Row {
                            Text(
                                text = "Dated:",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = androidx.compose.ui.graphics.Color.Black
                            )
                            Text(
                                color = androidx.compose.ui.graphics.Color.Black,
                                text = " ${
                                    DateFormat.getDateInstance(DateFormat.MEDIUM)
                                        .format(announcement.startDate)
                                }",
                                fontSize = 12.sp
                            )
                        }
                        Row {
                            Text(text = "Due Date:",
                                fontSize = 12.sp,
                                color = androidx.compose.ui.graphics.Color.Black,
                                fontWeight = FontWeight.Bold,
                                //style = TextStyle(color = colorResource(id = R.color.blue_button))
                            )
                            Text(text = " ${
                                DateFormat.getDateInstance(DateFormat.MEDIUM)
                                    .format(announcement.endDate)
                            }",
                                color = androidx.compose.ui.graphics.Color.Black,
                                fontSize = 12.sp
                            )
                        }
                        Text(
                            text = announcement.message,
                            fontSize = 14.sp,
                            color = androidx.compose.ui.graphics.Color.Black
                        )
                    }
                }
            }
        }
    }
}