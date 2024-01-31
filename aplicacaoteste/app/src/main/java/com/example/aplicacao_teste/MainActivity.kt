package com.example.aplicacao_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun sortear(view: View){
            val textoResultado = findViewById<TextView>(R.id.text_resultado)
            val numero = java.util.Random().nextInt(11)
            textoResultado.setText("número gerado $numero")

    }

}
