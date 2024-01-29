package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme  {
                BirthdayCard(
                        "Happy Birthday Jan",
                        "From Fiona",
                        painterResource(R.drawable.kitten)
                )
            }
        }
    }
}


@Composable
fun BirthdayCard(
        message: String,
        from: String,
        picture: Painter,
        modifier: Modifier = Modifier
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = picture,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()) {
            Text(
                text = message,
                fontSize = 36.sp,
                modifier = Modifier.padding(
                    start = 16.dp, top=16.dp)
            )
            Text(
                text = from,
                fontSize = 24.sp,
                modifier = Modifier.padding(
                    start = 250.dp, bottom = 16.dp)
            )
        }


    }
}
