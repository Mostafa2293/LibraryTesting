package com.example.librarytesting

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.librarytesting.ui.theme.LibraryTestingTheme

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        runGradleTask("DownloadTokens")

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryTestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

fun runGradleTask(taskName: String) {
    Log.d("TAG", "runGradleTask: before")
    Runtime.getRuntime().exec("chmod +x gradlew $taskName")
    Log.d("TAG", "runGradleTask: after")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryTestingTheme {
        Greeting("Android")
    }
}