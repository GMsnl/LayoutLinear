package com.example.layoutlinear

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Seguros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seguros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnSegVoltar = findViewById<Button>(R.id.buttonSegVoltar)

        btnSegVoltar.setOnClickListener{
            var email = findViewById<EditText>(R.id.editTextEmail).text
            var senha = findViewById<EditText>(R.id.editTextSenha).text
            var btnLogar = findViewById<Button>(R.id.buttonLogar)
            var btnCadastrar = findViewById<Button>(R.id.buttonCadastrar)

            btnLogar.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
            }
        }
    }
}