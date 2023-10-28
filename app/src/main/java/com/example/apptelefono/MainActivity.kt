package com.example.apptelefono

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.llamada)
        boton.setOnClickListener{
            val intent: Intent = Intent (this, Pantalla2:: class.java)
            startActivity(intent)
        }


        val alarma: Button = findViewById(R.id.botonAlarma)
        alarma.setOnClickListener() {
            abrirAppAlarmaConAlarmaPredeterminada()
        }

        val botonURL: Button = findViewById(R.id.url)
            botonURL.setOnClickListener {
            abrirURL("https://www.wikipedia.com")
        }
    }

    private fun abrirURL(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    }
    private fun abrirAppAlarmaConAlarmaPredeterminada() {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_HOUR, 8) // Hora de la alarma (formato de 24 horas)
            putExtra(AlarmClock.EXTRA_MINUTES, 0) // Minutos de la alarma
            putExtra(AlarmClock.EXTRA_MESSAGE, "Alarma predeterminada") // Mensaje de la alarma
            putExtra(AlarmClock.EXTRA_SKIP_UI, true) // Opcional: Salta la interfaz de usuario de configuración de la alarma

        }

    }
