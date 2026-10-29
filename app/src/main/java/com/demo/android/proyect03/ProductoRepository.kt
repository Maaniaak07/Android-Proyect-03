package com.demo.android.proyect03

// 4.4 Productos de Un Finde Tranqui (mínimo 5)
object ProductoRepository {

    val productos = listOf(
        Producto(
            id = 1,
            nombre = "Jägermeister 40 ml",
            categoria = "Licor de hierbas",
            precio = 19.90,
            descripcion = "Botellita de Jägermeister de 40 ml, ideal para un shot bien helado. Licor alemán de hierbas, perfecto para empezar el finde.",
            imagen = R.drawable.jager40ml
        ),
        Producto(
            id = 2,
            nombre = "Jägermeister 700 ml",
            categoria = "Licor de hierbas",
            precio = 79.90,
            descripcion = "Licor alemán elaborado con 56 hierbas y especias. Se disfruta solo y muy frío, o en Jägerbomb con energizante.",
            imagen = R.drawable.jager700ml
        ),
        Producto(
            id = 3,
            nombre = "Jägermeister 1 L",
            categoria = "Licor de hierbas",
            precio = 109.90,
            descripcion = "Presentación de 1 litro para compartir en reuniones. El clásico sabor herbal de Jägermeister, ideal para la previa.",
            imagen = R.drawable.jager1000ml
        ),
        Producto(
            id = 4,
            nombre = "Jägermeister 1.75 L",
            categoria = "Licor de hierbas",
            precio = 175.00,
            descripcion = "La presentación más grande de Jägermeister. Perfecta para fiestas y grupos grandes; sírvelo bien helado.",
            imagen = R.drawable.jager1750ml
        ),
        Producto(
            id = 5,
            nombre = "Kick The Rules Fresa 700 ml",
            categoria = "Crema de tequila",
            precio = 75.00,
            descripcion = "Crema de fresa con tequila, dulce y cremosa. Se toma bien fría, sola o con hielo.",
            imagen = R.drawable.kicktherulesstrawberry
        ),
        Producto(
            id = 6,
            nombre = "Kick The Rules Mango 700 ml",
            categoria = "Crema de tequila",
            precio = 75.00,
            descripcion = "Crema de mango con tequila, tropical y suave. Ideal para compartir en la previa.",
            imagen = R.drawable.kicktherulesmango
        ),
        Producto(
            id = 7,
            nombre = "Kick The Rules Piña 700 ml",
            categoria = "Crema de tequila",
            precio = 75.00,
            descripcion = "Crema de piña con tequila, refrescante y cremosa. Sírvela bien helada para un finde tranqui.",
            imagen = R.drawable.kicktherulespineapple
        )
    )

    fun obtenerPorId(id: Int): Producto? = productos.find { it.id == id }
}