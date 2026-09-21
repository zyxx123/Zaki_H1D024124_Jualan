package com.pemmob.zaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemmob.zaki.ui.screen.DaftarProdukScreen
import com.pemmob.zaki.ui.screen.DetailProductScreen
import com.pemmob.zaki.ui.screen.HubungiKamiScreen
import com.pemmob.zaki.ui.theme.Praktikum1Theme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum1Theme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    // 1. Layar Daftar Produk
                    composable(route = "daftar_produk") {
                        DaftarProdukScreen(navController = navController)
                    }

                    // 2. Layar Detail Produk (dengan passing data productId)
                    composable(
                        route = "detail/{productId}",
                        arguments = listOf(
                            navArgument(name = "productId") {
                                type = NavType.IntType
                            }
                        )
                    ) { backStackEntry ->
                        val productId = backStackEntry.arguments?.getInt("productId") ?: 0
                        DetailProductScreen(
                            productId = productId,
                            navController = navController
                        )
                    }

                    // 3. Layar Hubungi Kami
                    composable(route = "hubungi_kami") {
                        HubungiKamiScreen(navController = navController)
                    }
                }
            }
        }
    }
}