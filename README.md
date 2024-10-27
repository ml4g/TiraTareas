# TiraTareas #

## Descripción:

TiraTareas es una aplicación de Android sencilla desarrollada en Kotlin, diseñada para simular un dado que asigna tareas domésticas de manera aleatoria. Cada vez que el usuario tira el dado, se genera un número aleatorio entre 1 y 6, y se muestra una tarea asignada correspondiente al número obtenido. Esta aplicación tiene como propósito hacer que la asignación de tareas sea divertida y más dinámica.

## Cómo ejecutar la aplicación

### Requisitos previos

  - Android Studio: Asegúrate de tener la última versión de Android Studio instalada.
  - Kotlin: La aplicación está desarrollada en Kotlin, que es el lenguaje principal utilizado.


### Pasos para ejecutar

1. Clonar el repositorio (si se encuentra en un repositorio de control de versiones):

    git clone https://github.com/tuusuario/TiraTareas.git


2. Abrir el proyecto en Android Studio:

  - Abre Android Studio.
  - Selecciona Open an existing project y navega hasta la carpeta del proyecto.

3. Ejecutar la aplicación:

  - Conecta un dispositivo Android o usa el emulador de Android.
  - Haz clic en el botón Run (ícono de triángulo verde) en la barra superior para compilar y ejecutar la aplicación.



## Componentes principales

### Actividad principal (MainActivity.kt)

  - MainActivity: Es el punto de entrada de la aplicación y se encarga de configurar el contenido de la interfaz de usuario llamando a la función Contentido().


### Función Contentido()

  - Column: Contiene y organiza los componentes visuales verticalmente. Esta columna tiene un color de fondo personalizado.

  - TextoDefault: Una función reutilizable que muestra un texto en un color específico y con estilos personalizados.

  - Button: Permite al usuario "tirar" el dado, generando un número aleatorio cada vez que es presionado.

  - Text: Muestra el resultado numérico del dado y la tarea asignada según el valor obtenido.


### Otros componentes

  - LazyRow: Muestra una lista de colores en forma de círculos, organizada horizontalmente.

  - CirculoDefault: Función que crea círculos de colores para decoración.

  - Mutable State: Usa remember y mutableStateOf para manejar el estado de tiros, el cual se actualiza cada vez que el botón es presionado, generando un nuevo número aleatorio entre 1 y 6.


### Créditos

Desarrollado como una aplicación de ejemplo en Kotlin para asignar tareas de manera divertida y aleatoria.
