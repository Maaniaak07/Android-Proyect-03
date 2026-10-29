# Android-Proyect-03 · Catálogo de Bebidas

App Android de catálogo de productos para una licorería, desarrollada con **Kotlin** y **Jetpack Compose**. Muestra una lista de bebidas con imagen, categoría y precio, y al seleccionar un producto se abre una pantalla de detalle con su información completa.

## Funcionalidades

- Pantalla principal con la lista de productos en tarjetas (imagen, nombre, categoría y precio)
- Pantalla de detalle por producto con su descripción
- Navegación entre pantallas con **Navigation Compose**, pasando el `id` del producto como argumento
- Datos gestionados desde un repositorio local (`ProductoRepository`)
- Modelo de datos con `data class` (`Producto`)

## Tecnologías

- Kotlin
- Jetpack Compose + Material 3
- Navigation Compose
- Gradle Kotlin DSL + Version Catalog (`libs.versions.toml`)

## Estructura

```
app/src/main/java/com/demo/android/proyect03/
├── MainActivity.kt          # Punto de entrada y tema
├── AppNavigation.kt         # Rutas y NavHost
├── HomeScreen.kt            # Lista de productos
├── DetalleScreen.kt         # Detalle del producto
├── Producto.kt              # Modelo de datos
├── ProductoRepository.kt    # Fuente de datos local
└── ui/theme/                # Colores, tipografía y tema
```

## Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Maaniaak07/Android-Proyect-03.git
   ```
2. Ábrelo en **Android Studio** y espera a que termine el Gradle Sync.
3. Ejecuta la app en un emulador o dispositivo (▶ Run).

## Autor

**Maaniaak07** · [GitHub](https://github.com/Maaniaak07)
