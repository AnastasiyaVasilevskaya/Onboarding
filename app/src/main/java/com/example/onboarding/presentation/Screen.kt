package com.example.onboarding.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.onboarding.R
import com.example.onboarding.domain.ScreenContentModel
import com.example.onboarding.ui.theme.BackgroundBlue
import com.example.onboarding.ui.theme.BackgroundPurple
import com.example.onboarding.ui.theme.BackgroundRed
import com.example.onboarding.ui.theme.BackgroundYellow


@Composable
fun OnboardingScreen1(navController: NavHostController) {
    val data = ScreenContentModel(
        backgroundColor = BackgroundYellow,
        nextScreen = "screen2",
        firstTitle = "Your first car without \n" + "a driver's license",
        isTitleBold = false,
        secondTitle = "Goes to meet people who just got their license",
        picId = R.drawable.car1,
        dotsId = R.drawable.navigation1,
        arrowId = R.drawable.loader1
    )
    OnboardingScreen(data, navController)
}

@Composable
fun OnboardingScreen2(navController: NavHostController) {
    val data = ScreenContentModel(
        backgroundColor = BackgroundPurple,
        nextScreen = "screen3",
        firstTitle = "Always there: more than \n" + "1000 cars in Tbilisi",
        isTitleBold = true,
        secondTitle = "Our company is a leader by the \n" + "number of cars in the fleet",
        picId = R.drawable.car2,
        dotsId = R.drawable.navigation2,
        arrowId = R.drawable.loader2
    )
    OnboardingScreen(data, navController)
}

@Composable
fun OnboardingScreen3(navController: NavHostController) {
    val data = ScreenContentModel(
        backgroundColor = BackgroundRed,
        nextScreen = "screen4",
        firstTitle = "Do not pay for parking, \n" + "maintenance and gasoline",
        isTitleBold = true,
        secondTitle = "We will pay for you, all expenses \n" + "related to the car",
        picId = R.drawable.car3,
        dotsId = R.drawable.navigation3,
        arrowId = R.drawable.loader3
    )
    OnboardingScreen(data, navController)
}

@Composable
fun OnboardingScreen4(navController: NavHostController) {
    val data = ScreenContentModel(
        backgroundColor = BackgroundBlue,
        nextScreen = "screen5",
        firstTitle = "29 car models: from Skoda \n" + "Octavia to Porsche 911",
        isTitleBold = true,
        secondTitle = "Choose between regular car models \n" + "or exclusive ones",
        picId = R.drawable.car4,
        dotsId = R.drawable.navigation4,
        arrowId = R.drawable.loader4
    )
    OnboardingScreen(data, navController)
}

@Composable
fun OnboardingScreen5() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(BackgroundBlue),
        contentAlignment = Alignment.Center,
    ) {
        Text("You are a clever person!", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}
