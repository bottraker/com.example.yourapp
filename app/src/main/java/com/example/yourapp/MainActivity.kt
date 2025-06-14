package com.example.yourapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Crear una vista de texto programáticamente
        val textView = TextView(this).apply {
            text = "Hola desde GitHub Actions"
            textSize = 24f
            gravity = android.view.Gravity.CENTER
        }
        
        // Establecer la vista como el contenido de la actividad
        setContentView(textView)
    }
}
