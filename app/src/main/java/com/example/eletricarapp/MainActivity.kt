package com.example.eletricarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var btnCalcular: Button
    lateinit var kmPercorrido: EditText
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {
        preco = findViewById(R.id.et_preco_kwh)
        btnCalcular = findViewById(R.id.btn_calcular)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()

        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()

        val result = preco / km

        resultado.text = result.toString()

    }
}



/*R. (Resource): no Android, tudo que é referenciado a tela, ele cria um identificador
único (id) para ela*/

/* Log.d("Resultado -> ", resultado.toString())
    Log.d("Preço -> ", preco.toString())
    Log.d("Km Percorrido -> ", km.toString())*/