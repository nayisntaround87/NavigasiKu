package com.example.navigasiku.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tampildata(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(first = stringResource(R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(first = stringResource(R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = stringResource(R.string.alamat), second = "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil),color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )

