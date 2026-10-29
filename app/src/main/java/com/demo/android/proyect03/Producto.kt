package com.demo.android.proyect03

import androidx.annotation.DrawableRes

// 4.4 Modelo de datos del producto
data class Producto(
    val id: Int,
    val nombre: String,
    val categoria: String,
    val precio: Double,
    val descripcion: String,
    @DrawableRes val imagen: Int
)