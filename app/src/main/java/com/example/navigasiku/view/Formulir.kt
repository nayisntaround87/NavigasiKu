package com.example.navigasiku.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun FormIsian(
    jenisK : List<String> = listOf("Laki-laki", "Pertemuan"),
    OnSubmitBtnClick : ()-> Unit
){
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.home),
                color = Color.White)},
                colors = TopAppBarDefaults.
            topAppBarColors(containerColor = colorResource(R.color.teal_700))
            ){}

}