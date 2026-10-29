package com.demo.android.proyect03

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 4.4 Home: muestra la lista de productos del negocio
@Composable
fun HomeScreen(onProductoClick: (Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Un Finde Tranqui",
            fontSize = 28.sp,
            modifier = Modifier.padding(vertical = 12.dp)
        )
        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            items(ProductoRepository.productos) { producto ->
                ProductoCard(
                    producto = producto,
                    onClick = { onProductoClick(producto.id) }
                )
            }
        }
    }
}

// Tarjeta de cada producto en el Home
@Composable
fun ProductoCard(producto: Producto, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Image(
            painter = painterResource(id = producto.imagen),
            contentDescription = producto.nombre,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(producto.nombre, fontSize = 20.sp)
            Text(producto.categoria, fontSize = 13.sp)
            Spacer(Modifier.height(8.dp))
            Text("S/ %.2f".format(producto.precio), fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(onProductoClick = {})
}