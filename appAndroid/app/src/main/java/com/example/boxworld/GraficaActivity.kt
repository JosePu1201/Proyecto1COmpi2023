package com.example.boxworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GraficaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafica)

        val regresar: Button = findViewById(R.id.regresar)
        regresar.setOnClickListener(View.OnClickListener {
            goToDrawActivity("hola mundo")
        })
    }
    private fun goToDrawActivity(input: String) {
        val intent = Intent(this,MainActivity::class.java)
        /*val bundle = Bundle()
        bundle.putSerializable("input", input)
        intent.putExtras(bundle)*/
        startActivity(intent)
    }
}