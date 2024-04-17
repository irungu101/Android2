package com.naomi.android101.ui.theme.screens.profile



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ProfileScreen() {
    Column {


        Box(modifier = Modifier.fillMaxSize())
        {
            Card {

            }
            
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Go to Gallery Screen")
            }

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}
