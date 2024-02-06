package com.example.state

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                Modifier.fillMaxSize()
            ){
                val color = remember { // it remember the starting color and skip when fun is called again
                    mutableStateOf(Color.Yellow)  // initial state is defined as Yellow
                }
                ColorBox(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()
                   ){
                    color.value = it
                }
                Box(modifier = Modifier
                    .background(color.value)
                    .weight(1f)
                    .fillMaxSize()
                    )
            }

        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
){
//    val color1 = remember { // it remember the starting color and skip when fun is called again
//        mutableStateOf(Color.Yellow)  // initial state is defined as Yellow
//    }
    Box (modifier = modifier // from ColorBox
        .background(Color.Green) // passing state value
        .clickable {
//               color1.value =  Color(       // re-assigning the colors when clicked by redrawing the ColorBox
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//                    1f
//               )
            updateColor(
                Color(       // re-assigning the colors when clicked by redrawing the ColorBox
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
                )
            )
        }
    )
}