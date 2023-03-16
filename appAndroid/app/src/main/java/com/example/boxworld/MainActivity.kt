package com.example.boxworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.boxworld.sockets.Tarea
import com.example.boxworld.sockets.archivoEntrada

class MainActivity : AppCompatActivity() {
    val ip: String = "192.168.0.101"
    val puerto: Int = 9090

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editor: EditText = findViewById(R.id.editTextTextMultiLine)

        val boton: Button = findViewById(R.id.compilar)

        boton.setOnClickListener(View.OnClickListener {
            println("click")
            val text = editor.text.toString()
            this.enviar(text)
        })

    }


    private fun enviar(entrad: String){

        val archivoEntrada = archivoEntrada(entrad)

        val tarea = Tarea(ip,puerto,archivoEntrada);
        //tarea.delegate = this
        tarea.execute()
    }
}