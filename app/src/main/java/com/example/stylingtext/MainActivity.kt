package com.example.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.bungeespice_regular, FontWeight.Bold)
        )
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0x9D6B2C76))
                    .padding(10.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 35.sp,
                                color = Color.LightGray
                            )
                        ) {
                            append("J")
                        }
                        append("etpack ")
                        withStyle(
                            style = SpanStyle(
                                fontSize = 35.sp,
                                color = Color.LightGray
                            )
                        ) {
                            append("C")
                        }
                        append("ompose")
                    },
                    color = Color(0xFF032AFE),
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

