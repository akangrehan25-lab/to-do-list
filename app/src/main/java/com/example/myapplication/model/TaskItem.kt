package com.example.myapplication.model

import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.theme.PriorityHighBg
import com.example.myapplication.ui.theme.PriorityHighText
import com.example.myapplication.ui.theme.PriorityLowBg
import com.example.myapplication.ui.theme.PriorityLowText
import com.example.myapplication.ui.theme.PriorityMediumBg
import com.example.myapplication.ui.theme.PriorityMediumText
import java.util.UUID

enum class PriorityLevel(
    val label: String,
    val textColor: Color,
    val backgroundColor: Color
) {
    TINGGI("Tinggi", PriorityHighText, PriorityHighBg),
    SEDANG("Sedang", PriorityMediumText, PriorityMediumBg),
    RENDAH("Rendah", PriorityLowText, PriorityLowBg)
}

data class TaskItem(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val category: String,
    val date: String,
    val priority: PriorityLevel,
    val isCompleted: Boolean = false
)

enum class FilterType(val label: String) {
    SEMUA("Semua"),
    BELUM("Belum"),
    SELESAI("Selesai")
}
