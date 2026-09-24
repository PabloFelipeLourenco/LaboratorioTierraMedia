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
    private var contador = 0 //Contador de miembros de la Comunidad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TierraMedia", "El viaje comienza en Rivendell") //Mensaje inicial en Logcat
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
        //Conectamos los elementos de la interfaz con el código
        val boton = findViewById<Button>(R.id.button)
        val saludo = findViewById<TextView>(R.id.textView2)
        val contadorTexto = findViewById<TextView>(R.id.textView)
        //Acciones que se realizan al pulsar el botón
        boton.setOnClickListener {
            contador++
            saludo.text = "¡La Comunidad del Anillo ha partido hacia Mordor!"
            contadorTexto.text = "Miembros reunidos: $contador"
            //Mensaje en Logcat cada vez que se pulsa el botón
            Log.d(
                "TierraMedia",
                "Un nuevo miembro se une a la Comunidad"
            )
        }
    }
    //Se ejecuta cuando la actividad empieza a ser visible
    override fun onStart() {
        super.onStart()
        Log.d(
            "TierraMedia",
            "El Anillo abandona Rivendell y comienza su viaje"
        )
    }
    //Se ejecuta cuando la actividad pasa a primer plano
    override fun onResume() {
        super.onResume()
        Log.d(
            "TierraMedia",
            "La Comunidad continúa su viaje hacia Mordor"
        )
    }
    //Se ejecuta cuando la actividad deja de estar en primer plano
    override fun onPause() {
        super.onPause()
        Log.d(
            "TierraMedia",
            "La Comunidad hace una pausa en su camino"
        )
    }
    //Se ejecuta cuando la actividad deja de ser visible
    override fun onStop() {
        super.onStop()
        Log.d(
            "TierraMedia",
            "La Comunidad abandona temporalmente la escena"
        )
    }
    //Se ejecuta cuando la actividad se destruye
    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            "TierraMedia",
            "El viaje del Anillo llega a su fin"
        )
    }
}