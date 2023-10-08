package com.riveong.compose

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.riveong.compose.ui.theme.ComposeTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    GreetingText(message = "Happy Birthday Gabriel!", from = "From Bocchi")


                }
            }
        }
    }
}


@Composable

fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bocchi_glasses)
    Image(
        painter = image,
        contentDescription = null
    )


}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column {

        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            modifier = Modifier
                .padding(20.dp)
                .align(alignment = Alignment.End)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        GreetingImage(message = "Happy Birthday Gabriel!", from = "From Bocchi")
    }
}