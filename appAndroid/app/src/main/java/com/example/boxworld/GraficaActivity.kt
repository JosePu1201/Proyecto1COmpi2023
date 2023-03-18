package com.example.boxworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.boxworld.LexSint.Analisis
import com.example.boxworld.sockets.SimpleMessage
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.Socket
import java.util.concurrent.Executors

class GraficaActivity : AppCompatActivity() {
    val ip: String =  "192.168.0.101"
    val puerto: Int = 9090;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafica)

        val regresar: Button = findViewById(R.id.regresar)
        val mover: Button = findViewById(R.id.mover)
        val graf: Button = findViewById(R.id.pedir)
        val entradaTexto: TextView = findViewById(R.id.entradaTexto)

        regresar.setOnClickListener(View.OnClickListener {
            goToDrawActivity("hola mundo")

        })

        mover.setOnClickListener(View.OnClickListener {

        })

        graf.setOnClickListener(View.OnClickListener {
                Executors.newSingleThreadExecutor().execute{
                val txt = entradaTexto.text.toString()
                val socket = Socket(ip,puerto)
                val DataOutputStream = DataOutputStream(socket.getOutputStream())
                val DataInputStream = DataInputStream(socket.getInputStream())
                DataOutputStream.writeUTF(txt)
                socket.close()
            }
        })

        mover.setOnClickListener(View.OnClickListener {
            val texto = entradaTexto.text.toString()
            val analisis = Analisis(texto)
            analisis.generarTodo()
        })
    }

    private fun goToDrawActivity(input: String) {
        val intent = Intent(this, MainActivity::class.java)
        /*val bundle = Bundle()
        bundle.putSerializable("input", input)
        intent.putExtras(bundle)*/
        startActivity(intent)
    }
}