package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeApp()
        }
    }
}

@Composable
fun HelloComposeApp() {
    MaterialTheme {
        var name by remember { mutableStateOf("Студент") }
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding()) {
                Text(text = "Привіт, $name!", style = MaterialTheme.typography.headlineMedium)
                Button(onClick = { name = "Світ" }) { Text("Натисни") }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeApp()
}