package com.example.apptelefono

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.llamada)
        boton.setOnClickListener{
            val intent: Intent = Intent (this, Pantalla2:: class.java)
            startActivity(intent)
        }
    }
}