package com.example.examenparcial_garay22101570

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnSigin: Button = findViewById(R.id.btnSignIn)

        btnSigin.setOnClickListener{
            val email: String = etEmail.text.toString()
            val password: String = etPassword.text.toString()

            if(email == "admin@americancup.com" && password == "admin123")
            {
                val intent = Intent (this, MenuActivity:: class.java)
                startActivity(intent)

            }else{
                Toast.makeText( this,
                    "Credenciales inválidas", Toast.LENGTH_LONG).show()
            }

        }
    }
}