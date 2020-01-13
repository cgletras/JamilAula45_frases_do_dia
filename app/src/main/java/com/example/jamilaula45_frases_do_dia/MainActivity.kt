package com.example.jamilaula45_frases_do_dia

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Essa é a frase 1",
        "Essa é a frase 2",
        "Essa é a frase 3",
        "Essa é a frase 4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView
    }

    fun gerarFrase(view: View) {

        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText(frases[numeroAleatorio])
    }
}
