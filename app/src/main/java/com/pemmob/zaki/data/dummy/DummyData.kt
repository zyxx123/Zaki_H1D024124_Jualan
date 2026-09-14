package com.pemmob.zaki.data.dummy

import com.pemmob.zaki.data.model.Category
import com.pemmob.zaki.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Keripik Singkong", description = "Keripik singkong gurih", price = 15000.0, stock = 20, img = "keripiksingkong"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Tempe mendoan hangat", price = 20000.0, stock = 15, img = "mendoan"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale pisang manis", price = 25000.0, stock = 10, img = "salepisang"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Gethuk Goreng", description = "Gethuk goreng khas", price = 30000.0, stock = 40, img = "gethukgoreng"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Bayam Goreng", description = "Keripik bayam renyah", price = 18000.0, stock = 25, img = "bayamgoreng"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Kupat Tahu", description = "Porsi komplit", price = 15000.0, stock = 30, img = "kupattahu"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Tahu Gejrot", description = "Khas pedas manis", price = 12000.0, stock = 50, img = "tahugejrot"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Kentang Goreng", description = "Camilan gurih", price = 10000.0, stock = 20, img = "kentanggoreng"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Mie Goreng", description = "Mie lezat", price = 13000.0, stock = 35, img = "miegoreng"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Pecel", description = "Bumbu kacang", price = 14000.0, stock = 12, img = "pecel"),

        // Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Ketupat", description = "Anyaman janur", price = 5000.0, stock = 50, img = "ketupat"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Pisang Goreng", description = "Olahan renyah", price = 10000.0, stock = 15, img = "pisanggoreng"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Singkong Goreng", description = "Singkong merekah", price = 10000.0, stock = 25, img = "singkonggoreng"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Tahu Goreng", description = "Tahu renyah", price = 8000.0, stock = 40, img = "tahugoreng")
    )
}