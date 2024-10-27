package com.lagvna.tiratareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lagvna.tiratareas.ui.theme.TiraTareasTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Contentido()

        }
    }
}

val colores = listOf(
    Color.Red,
    Color.Yellow,
    Color.Black,
    Color.Cyan,
    Color.Magenta,
    Color.Green,
    Color.Gray,
    Color.DarkGray,
    Color(0xFFFFDD00)

)

// Lista de tareas asociada a cada número
val tareas = listOf(
    "Lavar los trastes",
    "Barrer el piso",
    "Lavar el baño",
    "Sacar la basura",
    "Limpiar la mesa",
    "¡Dia de suerte! Puedes descansar"
)

@Preview
@Composable
fun Contentido() {
    // Variable para almacenar el número aleatorio
    var tiros by remember { mutableStateOf(Random.nextInt(1, 7)) }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(horizontal = 5.dp)
            .background(Color.Green)

    ) {
        TextoDefault("Bienvenido al", Color.Red)
        Spacer(modifier = Modifier.height(10.dp))
        TextoDefault("TiraTareas")
        Spacer(modifier = Modifier.height(10.dp))
        TextoDefault("¿Que harás el día de hoy?", Color.Yellow)
        Spacer(modifier = Modifier.height(20.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(colores) {
                    color ->
                CirculoDefault(color = color)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(20.dp))



        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Botón para generar el número aleatorio
            Button(
                onClick = {
                    tiros = Random.nextInt(1, 7) // Genera un número aleatorio entre 1 y 6
                    println("Número generado: $tiros")
                }
            ) {
                Text(text = "Tirar")
            }
            Spacer(modifier = Modifier.width(10.dp))

            // Muestra el número generado
            Text(text = "Resultado: $tiros", fontWeight = FontWeight.Bold)

        }

        Spacer(modifier = Modifier.height(10.dp))

        // Muestra la tarea asociada al número generado
        Text(
            text = "Tarea asignada: ${tareas[tiros - 1]}", // `tiros - 1` para ajustar el índice
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Blue,
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.CenterHorizontally)


        )

    }
}

@Preview
@Composable
fun TextoDefault(
    texto:String = "Default",
    color: Color = Color.White
){
    Text(
        text = texto,
        color = color,
        fontWeight = FontWeight.Bold,
        fontSize = 40 .sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
            .clickable {
                println("Hola Tarola")
            }

        )
}

@Preview
@Composable
fun CirculoDefault(size:Dp= 70.dp, color: Color = Color.Red) {
    Box(
        modifier = Modifier
            .size(size)
            .background(color, CircleShape)
    )
}