package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
                modifier = modifier
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = message,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )
            Text(
                text = from,
                fontSize = 24.sp,
                modifier = modifier
            )
        }

    }
}
