package com.naomi.android101.ui.theme.screens.gallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.naomi.android101.R



@Composable
fun Backgroundimage(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.pexel), contentDescription = "background image",
            contentScale = ContentScale.FillBounds
        )

        Text(text = "Background image")
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BackgroundimagePreview(){
    Backgroundimage()
}
