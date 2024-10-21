package kr.ac.kumoh.ce.s20240000.s24w08compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.ce.s20240000.s24w08compose.ui.theme.S24W08ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S24W08ComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        MyLinearLayout(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun MyLinearLayout(modifier: Modifier = Modifier) {
//    Column(modifier = modifier) {
        Text(text = "안녕하세요",
            modifier = Modifier.background(Color.Yellow)
                .padding(8.dp)
        )
        Text(text = "국립금오공과대학교",
            modifier = Modifier.background(Color.Cyan)
                .padding(8.dp)
        )
        Text(text = "스마트 앱 프로그래밍",
            modifier = Modifier.background(Color.Magenta)
                .padding(8.dp)
        )
//    }
}
