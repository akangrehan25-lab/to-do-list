package com.example.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.model.PriorityLevel
import com.example.myapplication.model.TaskItem
import com.example.myapplication.ui.theme.AppDarkText
import com.example.myapplication.ui.theme.AppPrimaryGreen

@Composable
fun AddTaskDialog(
    onDismissRequest: () -> Unit,
    onTaskAdded: (TaskItem) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("Kuliah") }
    var priority by remember { mutableStateOf(PriorityLevel.SEDANG) }
    var dateText by remember { mutableStateOf("28 Okt 2026") }

    val categories = listOf("Kuliah", "Kerja", "Pribadi")

    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            Button(
                onClick = {
                    if (title.isNotBlank()) {
                        onTaskAdded(
                            TaskItem(
                                title = title,
                                category = category,
                                date = dateText,
                                priority = priority,
                                isCompleted = false
                            )
                        )
                        onDismissRequest()
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = AppPrimaryGreen),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Simpan", color = Color.White)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismissRequest) {
                Text("Batal", color = AppDarkText)
            }
        },
        title = {
            Text(
                text = "Tambah Tugas Baru",
                fontWeight = FontWeight.Bold,
                color = AppDarkText,
                fontSize = 18.sp
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Nama Tugas") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                // Category Selection
                Text("Kategori:", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    categories.forEach { cat ->
                        val isSelected = cat == category
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(if (isSelected) AppPrimaryGreen else Color(0xFFEFEFEF))
                                .clickable { category = cat }
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = cat,
                                color = if (isSelected) Color.White else AppDarkText,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                // Priority Selection
                Text("Prioritas:", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    PriorityLevel.entries.forEach { prio ->
                        val isSelected = prio == priority
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(if (isSelected) prio.backgroundColor else Color(0xFFEFEFEF))
                                .clickable { priority = prio }
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = prio.label,
                                color = if (isSelected) prio.textColor else AppDarkText,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                // Date input
                OutlinedTextField(
                    value = dateText,
                    onValueChange = { dateText = it },
                    label = { Text("Tanggal") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        containerColor = Color.White,
        shape = RoundedCornerShape(20.dp)
    )
}
