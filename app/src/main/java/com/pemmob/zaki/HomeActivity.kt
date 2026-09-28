package com.pemmob.zaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemmob.zaki.ui.screen.DaftarProdukScreen
import com.pemmob.zaki.ui.screen.DetailProductScreen
import com.pemmob.zaki.ui.screen.HubungiKamiScreen
import com.pemmob.zaki.ui.theme.Praktikum1Theme
import com.pemmob.zaki.ui.viewmodel.ProductViewModel

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum1Theme {
                val navController = rememberNavController()
                val productViewModel: ProductViewModel = viewModel()

                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    // 1. Layar Daftar Produk
                    composable(route = "daftar_produk") {
                        DaftarProdukScreen(
                            navController = navController,
                            viewModel = productViewModel
                        )
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
                            navController = navController,
                            viewModel = productViewModel
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