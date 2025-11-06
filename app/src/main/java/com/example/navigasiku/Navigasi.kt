package com.example.navigasiku

import android.widget.MediaController
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

enum class Navigasi{
    Formulir,

    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),

    modifier: Modifier
){
    Scaffold {isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(isiRuang)
        ){
            composable(route = Navigasi.Formulir.name) {
                FormIsian(
                    //pilihanJk= JenisK.map {id -> konteks.resource.getString(id)},
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData (
                    onBackBtnClick = { cancelAndBackToFormulir(navController) }

            }
    }
}