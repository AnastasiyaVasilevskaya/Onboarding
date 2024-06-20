package com.example.onboarding.domain

import android.widget.ImageView
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

data class ScreenContentModel (
    val backgroundColor: Color,
    val nextScreen: String,
    val firstTitle: String,
    val isTitleBold: Boolean,
    val secondTitle: String,
    val picId: Int,
    val dotsId: Int,
    val arrowId: Int
)