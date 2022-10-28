package com.example.appsencilla

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")
        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo ¿Que tal estás?"


    }
    fun cambiarColor(view: View){
        val button : Button = findViewById(R.id.btnCambiar)
        button.setOnClickListener {
            button.setBackgroundColor(Color.BLUE)
            txtSaludo.setTextColor(Color.RED)

        }
    }
    fun volver(view: View){
        finish()
    }




}