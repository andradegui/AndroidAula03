package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tipo de binding 1 - findViewById
        val editValor1: EditText = findViewById(R.id.valor1)
        val editValor2: EditText = findViewById(R.id.valor2)

        val btnSomar: Button = findViewById(R.id.btnSomar)
        val btnSubtrair: Button = findViewById(R.id.btnSubtrair)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDividir: Button = findViewById(R.id.btnDividir)



        btnSomar.setOnClickListener {

            if(!editValor1.text.isEmpty() )
            val valor1 = editValor1.text.toString().toInt();
            val valor2 = editValor2.text.toString().toInt();


            val resultado = valor1 + valor2;

            showDialog("A soma é " + resultado)
        }

        btnSubtrair.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt();
            val valor2 = editValor2.text.toString().toInt();


            val resultado = valor1 - valor2;

            showDialog("A subtração é " + resultado)
        }

        btnMultiplicar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt();
            val valor2 = editValor2.text.toString().toInt();


            val resultado = valor1 * valor2;

            showDialog("A multiplicação é " + resultado)
        }

        btnDividir.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt();
            val valor2 = editValor2.text.toString().toInt();


            val resultado = valor1 / valor2;

            showDialog("A divizão é " + resultado)
        }

    }

    fun showDialog(msg: String) {
        val builder = AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show();
    }
}