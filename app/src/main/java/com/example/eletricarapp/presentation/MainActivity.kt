package com.example.eletricarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.eletricarapp.R

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {

        btnCalcular = findViewById(R.id.btn_calcular)
    }


    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
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