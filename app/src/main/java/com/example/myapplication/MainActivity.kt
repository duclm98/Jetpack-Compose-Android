package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.myapplication.R.*
import com.example.myapplication.R.drawable.image1
import com.example.myapplication.ui.MyApplicationTheme
import com.example.myapplication.ui.typography
import com.example.myapplication.DefaultPreview as DefaultPreview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Composable
fun MyFunction() {
    val image = imageResource(id = R.drawable.header)
    Column(modifier = Modifier.padding(20.dp)) {
        val imageModifier = Modifier
                .preferredHeightIn(maxHeight = 200.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp))
        Image(image, modifier = imageModifier,
                contentScale = ContentScale.Crop)

        Spacer(modifier = Modifier
                .preferredHeightIn(minHeight = 30.dp))

        Text("Lê Minh Đức",
                style = typography.h1,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis)
        Text("MSSV: 1612112",
                style= typography.h2)
        Text("Số điện thoại: 0378654897"
                , style= typography.body1)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        MyFunction()
    }
}