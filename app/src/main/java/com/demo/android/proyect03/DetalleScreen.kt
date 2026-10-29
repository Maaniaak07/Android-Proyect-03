package com.demo.android.proyect03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 4.5 Detalle del producto seleccionado
@Composable
fun DetalleScreen(productoId: Int, onVolver: () -> Unit) {
    val producto = ProductoRepository.obtenerPorId(productoId) ?: return

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = producto.imagen),
            contentDescription = producto.nombre,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(Modifier.height(16.dp))
        Text(producto.nombre, fontSize = 24.sp)
        Spacer(Modifier.height(8.dp))
        Text(producto.categoria, fontSize = 15.sp)
        Spacer(Modifier.height(12.dp))
        Text("S/ %.2f".format(producto.precio), fontSize = 22.sp)
        Spacer(Modifier.height(12.dp))
        Text(producto.descripcion, fontSize = 15.sp)
        Spacer(Modifier.height(24.dp))
        Button(
            onClick = onVolver,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetalleScreenPreview() {
    DetalleScreen(productoId = 1, onVolver = {})
}