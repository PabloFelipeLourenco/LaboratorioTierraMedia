package com.example.laboratoriotierramedia

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TierraMedia", "El viaje comienza en Rivendell")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
        val boton = findViewById<Button>(R.id.button)
        val saludo = findViewById<TextView>(R.id.textView2)
        val contadorTexto = findViewById<TextView>(R.id.textView)
        // Listener del botón
        boton.setOnClickListener {
            contador++
            saludo.text = "¡La Comunidad del Anillo ha partido hacia Mordor!"
            contadorTexto.text = "Miembros reunidos: $contador"
            Log.d(
                "TierraMedia",
                "Un nuevo miembro se une a la Comunidad"
            )
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(
            "TierraMedia",
            "El Anillo abandona Rivendell y comienza su viaje"
        )
    }
    override fun onResume() {
        super.onResume()
        Log.d(
            "TierraMedia",
            "La Comunidad continúa su viaje hacia Mordor"
        )
    }
    override fun onPause() {
        super.onPause()
        Log.d(
            "TierraMedia",
            "La Comunidad hace una pausa en su camino"
        )
    }
    override fun onStop() {
        super.onStop()
        Log.d(
            "TierraMedia",
            "La Comunidad abandona temporalmente la escena"
        )
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            "TierraMedia",
            "El viaje del Anillo llega a su fin"
        )
    }
}