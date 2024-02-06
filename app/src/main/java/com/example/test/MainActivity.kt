package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiffColor()
    }
}

@Composable
fun DiffColor() {
    Column(
        modifier = Modifier

            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .padding(70.dp)
            .background(Color.Yellow)
            .border(15.dp, Color.Green)
            .padding(15.dp)
            .border(15.dp, Color.Blue)
            .padding(15.dp)
            .border(15.dp, Color.Red),
//                    .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Ragul", modifier = Modifier
                .offset(0.dp, 10.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Parajuli", modifier = Modifier
                .offset(20.dp, 0.dp)
        )
    }
}
}
// Not written code to show in Design