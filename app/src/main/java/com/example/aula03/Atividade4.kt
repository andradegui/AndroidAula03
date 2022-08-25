package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Atividade4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade4)

        val valor1: EditText = findViewById(R.id.vl1);
        val valor2: EditText = findViewById(R.id.vl2);
        val valor3: EditText = findViewById(R.id.vl3);


    }
}