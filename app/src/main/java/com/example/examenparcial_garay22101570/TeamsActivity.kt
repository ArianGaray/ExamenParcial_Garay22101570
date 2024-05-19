package com.example.examenparcial_garay22101570

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeamsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val equipos = listOf(
            "Argentina",
            "Brasil",
            "Uruguay",
            "Colombia",
            "Estados Unidos",
            "Perú",
            "Canadá",
            "México",
            "Trinidad y Tobago"
        )

        // Referencias a los elementos de la UI
        val lvpaises: ListView = findViewById(R.id.lvpaises)

        // Configurar el adaptador del ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, equipos)
        lvpaises.adapter = adapter



        val btngotomenu2: Button = findViewById(R.id.btngotomenu2)

        btngotomenu2.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}