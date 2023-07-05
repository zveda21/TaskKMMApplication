package com.example.kmmfirstapplication.android.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.kmmfirstapplication.android.presentation.components.MovieApp
import com.example.kmmfirstapplication.android.MyApplicationTheme

/**
 * Created by Zveda Hayrapetyan on 7/5/23.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MovieApp()
                }
            }
        }
    }
}
