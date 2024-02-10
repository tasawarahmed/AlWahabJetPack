package com.inanutshellglobal.alwahabjetpack.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.inanutshellglobal.alwahabjetpack.models.fees
import com.inanutshellglobal.alwahabjetpack.R

@Composable
fun StudentFee() {
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
                .fillMaxHeight(0.10f),
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
                Text(
                    text = "Fee Details",
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

        val paidFees = fees.filter { it.isPaid }
        val unpaidFees = fees.filter {!(it.isPaid)}

        Text(
            text = "Unpaid Fee Details:",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(fees) { fee ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.fee_card),
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
                        Column(
                            modifier = Modifier.padding(start = 16.dp)
                        ) {
                            Text(
                                text = "${fee.feeMonth} ${fee.feeYear}: ${fee.feeType}",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Total Amount: ${fee.feeAmount}",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Due Date: ${fee.dueDate}"
                            )
                        }

                    }
                }
            }
        }
    }
}
