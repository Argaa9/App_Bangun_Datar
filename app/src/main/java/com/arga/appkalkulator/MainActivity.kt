package com.arga.appkalkulator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun KalkulatorAppPreview() {
    KalkulatorApp()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                KalkulatorApp()
            }
        }
    }
}

@Composable
fun KalkulatorApp() {
    var angkaPertama by remember { mutableStateOf("") }
    var angkaKedua by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = angkaPertama,
            onValueChange = {
                angkaPertama = it
                errorMessage = "" // Reset error message
            },
            label = { Text("Angka Pertama") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = angkaKedua,
            onValueChange = {
                angkaKedua = it
                errorMessage = "" // Reset error message
            },
            label = { Text("Angka Kedua") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { hasil = hitung(angkaPertama, angkaKedua, "+") }) { Text("+") }
            Button(onClick = { hasil = hitung(angkaPertama, angkaKedua, "-") }) { Text("-") }
            Button(onClick = { hasil = hitung(angkaPertama, angkaKedua, "*") }) { Text("*") }
            Button(onClick = { hasil = hitung(angkaPertama, angkaKedua, "/") }) { Text("/") }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                angkaPertama = ""
                angkaKedua = ""
                hasil = ""
                errorMessage = ""
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Clear")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Hasil: $hasil",
            style = MaterialTheme.typography.h5
        )

        if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color = MaterialTheme.colors.error,
                style = MaterialTheme.typography.body2
            )
        }
    }
}
fun hitung(angka1: String, angka2: String, operasi: String): String {
    return try {
        if (angka1.isEmpty() || angka2.isEmpty()) {
            "Invalid Input"
        } else {
            val num1 = angka1.toDouble()
            val num2 = angka2.toDouble()
            when (operasi) {
                "+" -> (num1 + num2).toString()
                "-" -> (num1 - num2).toString()
                "*" -> (num1 * num2).toString()
                "/" -> if (num2 != 0.0) (num1 / num2).toString() else "Error: Division by zero"
                else -> "Invalid Operation"
            }
        }
    } catch (e: Exception) {
        "Invalid Input"
    }
}
