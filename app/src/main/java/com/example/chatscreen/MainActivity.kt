package com.example.chatscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import co.yml.ychat.domain.model.ChatMessage
import com.example.chatscreen.base.RoleEnum
import com.example.chatscreen.model.ChatDefaults
import com.example.chatscreen.ui.theme.ChatScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChatScreen(
                        apiKey = "YOUR_OPENAI_API_KEY",
                        chatDefaults = ChatDefaults(
                            isDarkModeEnabled = true,
                            preSeededMessages = arrayListOf(ChatMessage("system","You are a workout fitness coach.")),
                            isLogErrorEnabled = true
                        )
                    )
                }
            }
        }
    }
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
    ChatScreenTheme {
        Greeting("Android")
    }
}