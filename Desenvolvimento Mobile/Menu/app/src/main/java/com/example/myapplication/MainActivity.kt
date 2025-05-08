package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Acha a view pelo id e adiciona a variável
        val txtTexto = findViewById<TextView>(R.id.txtTexto)

        //altera o tamanho do texto
        txtTexto.setTextSize(30f)

        //altera o texto
        txtTexto.text = "new text"

        //acha a toolbar pelo id e adiciona a variável
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)

        //define a toolbar como barra de ação da atividade
        setSupportActionBar(toolbar)
    }

    //adiciona os itens criados no meu_menu ao menu da toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.meu_menu, menu)
        return true
    }

    //faz com que apareça um pop-up ao clicar nos itens
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.ItemConfiguracao -> Toast.makeText(this@MainActivity, "Configuração", Toast.LENGTH_LONG).show()
            R.id.ItemSobre -> Toast.makeText(this@MainActivity, "Sobre", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
