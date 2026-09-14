package com.pemmob.zaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pemmob.zaki.ui.screen.DaftarProdukScreen
import com.pemmob.zaki.ui.theme.Praktikum1Theme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum1Theme {
                DaftarProdukScreen()
            }
        }
    }
}