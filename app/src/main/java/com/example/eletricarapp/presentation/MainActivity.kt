package com.example.eletricarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.eletricarapp.R

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
        //preco = findViewById(R.id.et_preco_kwh)
        //btnCalcular = findViewById(R.id.btn_calcular)
        //kmPercorrido = findViewById(R.id.et_km_percorrido)
        //resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            //calcular()
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

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

/*O Android possui 4 pilares de componentes de aplicativo:
 1- Activitys (atividades): ponto de entrada para interação de usuário.
  Ela representa uma tela única com a interface do usuário.
 2- Serviços: serviço em Android é um ponto de entrada para manter um
  aplicativo em execução em segundo plano.
 3- Broadcast Receiver: é um componente que faz o sistema entregar eventos
  ao aplicativo fora do fluxo do usuário comum.
 4- Provider (Provedor de Conteúdo): gerenciam um conjunto de dados compartilhados do
   aplicativo que você pode armazenar em sistemas de arquivos. */