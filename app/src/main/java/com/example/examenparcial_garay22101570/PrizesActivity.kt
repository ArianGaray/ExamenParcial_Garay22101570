package com.example.examenparcial_garay22101570

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrizesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etPremioTotal: EditText = findViewById(R.id.etPremioTotal)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val txtprimero: TextView = findViewById(R.id.txtprimero)
        val txtsegundo: TextView = findViewById(R.id.txtsegundo)
        val txttercero: TextView = findViewById(R.id.txttercero)
        val txtotros: TextView = findViewById(R.id.txtotros)


        btnCalculate.setOnClickListener {
            val totalAmountString = etPremioTotal.text.toString()
            if (totalAmountString.isNotEmpty()) {
                val totalAmount = totalAmountString.toDouble()


                val firstPlace = 0.25 * totalAmount
                val secondPlace = 0.15 * totalAmount
                val thirdPlace = 0.10 * totalAmount
                val remainingAmount = totalAmount - (firstPlace + secondPlace + thirdPlace)
                val otherPlaces = remainingAmount / 13


                txtprimero.text = String.format("%.2f", firstPlace)
                txtsegundo.text = String.format("%.2f", secondPlace)
                txttercero.text = String.format("%.2f", thirdPlace)
                txtotros.text = String.format("%.2f", otherPlaces)
            }
        }

        val btngotomenu: Button = findViewById(R.id.btngotomenu)

        btngotomenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}