package com.technofevers.myapplication.modules.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var context = LocalContext.current


    Scaffold(
        modifier = Modifier
            .fillMaxSize(1f)
    ) {
        LoginContentScreen(it)
    }

}

@Composable
fun LoginContentScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
}
