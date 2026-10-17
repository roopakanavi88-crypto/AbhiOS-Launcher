package com.abhi.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.abhi.launcher.data.AppRepository
import com.abhi.launcher.model.AppInfo
import com.abhi.launcher.ui.HomeScreen
import com.abhi.launcher.ui.theme.AbhiOSTheme

class MainActivity : ComponentActivity() {

    private lateinit var appRepository: AppRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appRepository = AppRepository(this)

        // Intercept back button to retain default launcher behavior
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Keep launcher active on home
            }
        })

        setContent {
            AbhiOSTheme {
                var apps by remember { mutableStateOf<List<AppInfo>>(emptyList()) }

                LaunchedEffect(Unit) {
                    apps = appRepository.getInstalledApps()
                }

                HomeScreen(
                    repository = appRepository,
                    allApps = apps
                )
            }
        }
    }
}
