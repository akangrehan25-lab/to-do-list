package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.myapplication.model.PriorityLevel
import com.example.myapplication.model.TaskItem
import com.example.myapplication.ui.screens.DashboardScreen
import com.example.myapplication.ui.screens.WelcomeScreen
import com.example.myapplication.ui.theme.TaskAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskAppTheme {
                MainAppScreen()
            }
        }
    }
}

@Composable
fun MainAppScreen() {
    var currentScreen by remember { mutableStateOf("welcome") }

    val taskList = remember {
        mutableStateListOf(
            TaskItem(
                id = "1",
                title = "Kerjakan tugas Android",
                category = "Kuliah",
                date = "25 Okt 2026",
                priority = PriorityLevel.TINGGI,
                isCompleted = true
            ),
            TaskItem(
                id = "2",
                title = "Rapat tim proyek",
                category = "Kerja",
                date = "26 Okt 2026",
                priority = PriorityLevel.SEDANG,
                isCompleted = false
            ),
            TaskItem(
                id = "3",
                title = "Belanja kebutuhan bulanan",
                category = "Pribadi",
                date = "27 Okt 2026",
                priority = PriorityLevel.RENDAH,
                isCompleted = false
            ),
            TaskItem(
                id = "4",
                title = "Kirim laporan mingguan",
                category = "Kuliah",
                date = "22 Okt 2026",
                priority = PriorityLevel.RENDAH,
                isCompleted = true
            )
        )
    }

    when (currentScreen) {
        "welcome" -> {
            WelcomeScreen(
                onNavigateToDashboard = { currentScreen = "dashboard" }
            )
        }
        "dashboard" -> {
            DashboardScreen(
                tasks = taskList,
                onToggleTask = { taskId ->
                    val index = taskList.indexOfFirst { it.id == taskId }
                    if (index != -1) {
                        val item = taskList[index]
                        taskList[index] = item.copy(isCompleted = !item.isCompleted)
                    }
                },
                onAddTask = { newTask ->
                    taskList.add(0, newTask)
                }
            )
        }
    }
}
