package com.brunoarine.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
       button.setOnClickListener {
           calcularIMC(editWeight.text.toString(), editHeight.text.toString())
        }
    }
    private fun calcularIMC(peso:String, altura:String) {
       val peso = peso.toDouble()
        val altura = altura.toDouble()
        if (peso != null && altura != null){
            val imc = peso/(altura * altura * 0.0001)
            result.text = "Your IMC is %.1f".format(imc)
        }

    }
}