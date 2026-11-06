package com.example.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppBlobGreen
import com.example.myapplication.ui.theme.AppDarkText
import com.example.myapplication.ui.theme.AppPrimaryGreen

@Composable
fun IllustrationGraphic(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(260.dp),
        contentAlignment = Alignment.Center
    ) {
        // Background Soft Green Blob Circle
        Box(
            modifier = Modifier
                .size(220.dp)
                .offset(y = 10.dp)
                .clip(CircleShape)
                .background(AppBlobGreen)
        )

        // Decorative Dots
        Box(
            modifier = Modifier
                .offset(x = (-110).dp, y = (-70).dp)
                .size(10.dp)
                .clip(CircleShape)
                .background(AppPrimaryGreen)
        )
        Box(
            modifier = Modifier
                .offset(x = 120.dp, y = (-30).dp)
                .size(10.dp)
                .clip(CircleShape)
                .background(AppPrimaryGreen)
        )
        Box(
            modifier = Modifier
                .offset(x = (-125).dp, y = 30.dp)
                .size(14.dp)
                .clip(CircleShape)
                .background(AppBlobGreen)
        )

        // Top Left Floating Card
        Box(
            modifier = Modifier
                .offset(x = (-70).dp, y = (-55).dp)
                .shadow(6.dp, RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = AppPrimaryGreen,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Box(
                        modifier = Modifier
                            .width(55.dp)
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(Color(0xFFD3E4DB))
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = AppPrimaryGreen,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Box(
                        modifier = Modifier
                            .width(55.dp)
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(Color(0xFFE6F0EA))
                    )
                }
            }
        }

        // Top Right Floating Card
        Box(
            modifier = Modifier
                .offset(x = 75.dp, y = (-65).dp)
                .shadow(6.dp, RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(horizontal = 10.dp, vertical = 8.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(AppPrimaryGreen),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(13.dp)
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Box(
                        modifier = Modifier
                            .width(36.dp)
                            .height(5.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color(0xFFD3E4DB))
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(
                        modifier = Modifier
                            .width(22.dp)
                            .height(5.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color(0xFFE6F0EA))
                    )
                }
            }
        }

        // Central Character (Person body, head, tablet)
        Box(
            modifier = Modifier
                .offset(x = 40.dp, y = 20.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                // Head
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF1B2E3C))
                )
                // Neck
                Box(
                    modifier = Modifier
                        .width(12.dp)
                        .height(14.dp)
                        .background(Color(0xFFFADCB8))
                )
                // Body (Green shirt)
                Box(
                    modifier = Modifier
                        .width(72.dp)
                        .height(80.dp)
                        .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                        .background(AppPrimaryGreen)
                )
            }

            // Person holding tablet
            Box(
                modifier = Modifier
                    .offset(x = (-35).dp, y = 35.dp)
                    .shadow(4.dp, RoundedCornerShape(8.dp))
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .border(2.dp, AppDarkText, RoundedCornerShape(8.dp))
                    .padding(6.dp)
                    .width(36.dp)
                    .height(58.dp)
            ) {
                Column {
                    repeat(3) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(vertical = 3.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                tint = AppPrimaryGreen,
                                modifier = Modifier.size(10.dp)
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(3.dp)
                                    .clip(RoundedCornerShape(1.dp))
                                    .background(Color(0xFFD3E4DB))
                            )
                        }
                    }
                }
            }
        }

        // Laptop on desk
        Box(
            modifier = Modifier
                .offset(x = (-60).dp, y = 45.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                // Laptop Screen
                Box(
                    modifier = Modifier
                        .width(115.dp)
                        .height(75.dp)
                        .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                        .background(Color.White)
                        .border(4.dp, AppDarkText, RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                        .padding(8.dp)
                ) {
                    Column {
                        repeat(3) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(vertical = 3.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = null,
                                    tint = AppPrimaryGreen,
                                    modifier = Modifier.size(12.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(4.dp)
                                        .clip(RoundedCornerShape(2.dp))
                                        .background(Color(0xFFD3E4DB))
                                )
                            }
                        }
                    }
                }
                // Laptop Keyboard base
                Box(
                    modifier = Modifier
                        .width(135.dp)
                        .height(6.dp)
                        .clip(RoundedCornerShape(bottomStart = 4.dp, bottomEnd = 4.dp))
                        .background(AppDarkText)
                )
            }
        }

        // Plant on desk
        Box(
            modifier = Modifier
                .offset(x = 105.dp, y = 55.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                // Leaf shapes
                Box(
                    modifier = Modifier
                        .size(18.dp)
                        .clip(RoundedCornerShape(topStart = 12.dp, bottomEnd = 12.dp))
                        .background(Color(0xFF8DB6A0))
                )
                Spacer(modifier = Modifier.height(2.dp))
                // Pot
                Box(
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                        .clip(RoundedCornerShape(bottomStart = 4.dp, bottomEnd = 4.dp))
                        .background(Color(0xFFD9A07A))
                )
            }
        }

        // Desk Surface Line (Dark green horizontal bar)
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .offset(y = (-30).dp)
                .fillMaxWidth(0.9f)
                .height(14.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(AppDarkText)
        )
    }
}
