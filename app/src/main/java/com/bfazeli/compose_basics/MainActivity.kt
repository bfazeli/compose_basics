package com.bfazeli.compose_basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NewsStory()
            }
        }
    }
}

@Composable
fun NewsStory() {
    Text(text = "Hello World!")
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}
