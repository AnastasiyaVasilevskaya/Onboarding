package com.example.onboarding

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onboarding.presentation.OnboardingScreen1
import com.example.onboarding.presentation.OnboardingScreen2
import com.example.onboarding.presentation.OnboardingScreen3
import com.example.onboarding.presentation.OnboardingScreen4
import com.example.onboarding.presentation.OnboardingScreen5

@Composable
fun OnboardingNav(navController: NavHostController = rememberNavController()) {

    NavHost(navController, startDestination = "screen1") {
        listOf("screen1", "screen2", "screen3", "screen4", "screen5").forEach { screen ->
            composable(
                route = screen,
                enterTransition = {
                    slideInHorizontally(
                        initialOffsetX = { it },
                        animationSpec = tween(durationMillis = 1000)
                    )
                },
                exitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { -it },
                        animationSpec = tween(durationMillis = 1000)
                    )
                }
            ) {
                when (screen) {
                    "screen1" -> OnboardingScreen1(navController)
                    "screen2" -> OnboardingScreen2(navController)
                    "screen3" -> OnboardingScreen3(navController)
                    "screen4" -> OnboardingScreen4(navController)
                    "screen5" -> OnboardingScreen5()
                    else -> throw IllegalArgumentException("Unknown screen route: $screen")
                }
            }
        }
    }
}
