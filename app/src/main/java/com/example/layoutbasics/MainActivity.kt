package com.example.layoutbasics

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutbasics.ui.theme.LayoutBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserList()
        }
    }
}
data class User(
    val id: Int
)
val users = listOf(
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1),
    User(1)
)
// For List of UserCard
@Composable
fun UserList(){
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())){
//        for (i in 1..20){
//            UserCard()
//        }
//    }

    // Use LazyColumn for efficient scrolling of large lists
    LazyColumn(){
        items(users){   user ->
            UserCard()
        }
    }
}

// Composable function to display an individual user card
@Composable
fun UserCard(){
    Card {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
                //for multi-Color in padding
                .border(width = 5.dp, color = Color.Blue, shape = RectangleShape)
                .padding(5.dp)
                .border(width = 5.dp, color = Color.Green, shape = RectangleShape)
                .padding(5.dp)
                .border(width = 5.dp, color = Color.Black, shape = RectangleShape)
                .padding(12.dp)
        ) {
            // Display an image with circular clipping
            Image(
                painter = painterResource(id = R.drawable.myimage),
                contentDescription = "My Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            // Column for text and button
            Column(modifier = Modifier.padding(15.dp)) {
                Text(text = "Ragul Parajuli")
                val context = LocalContext.current
                Button(onClick = {
                    // activity after clicking button
                    Toast.makeText(
                        context,
                        "Viewed Profile",
                        Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Text(text = "View Profile")
                }
            }
        }
    }
}
// Preview function to visualize the composable in Android Studio
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Surface(
        Modifier.fillMaxSize()
    ) {
        UserList()
    }
}