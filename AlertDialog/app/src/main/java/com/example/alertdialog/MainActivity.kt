package com.example.alertdialog

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //cria uma caixa de dialogo
        val alerta = AlertDialog.Builder(this)

        //define o titulo da caixa de dialogo
        alerta.setTitle("Alerta do Android")

        //define a mensagem da caixa de dialogo
        alerta.setMessage("Uma mensagem para você")

        //de acordo com o que foi selecionado mostra um pop-up com o texto do mesmo
        alerta.setPositiveButton("Certo"){ dialog, which ->
            Toast.makeText(applicationContext,
                "Certo", Toast.LENGTH_SHORT).show()
        }

        alerta.setNegativeButton("Cancela"){ dialog, which ->
            Toast.makeText(applicationContext,
                "Cancela", Toast.LENGTH_SHORT).show()
        }

        alerta.setNeutralButton("Quem sabe"){ dialog, which ->
            Toast.makeText(applicationContext,
                "Quem sabe", Toast.LENGTH_SHORT).show()
        }

        //mostra a caixa de dialogo
        alerta.show()
    }
}