package com.example.boxworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.boxworld.sockets.SimpleMessage
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.Socket
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    val ip: String = "192.168.0.101"
    val puerto: Int = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editor: EditText = findViewById(R.id.editTextTextMultiLine)

        val boton: Button = findViewById(R.id.compilar)
        val siguiente: Button = findViewById(R.id.siguiente)

        boton.setOnClickListener(View.OnClickListener {
            println("click")
            //enviar("hola mundo")
            Executors.newSingleThreadExecutor().execute{
                val txt = editor.text.toString()
                val mensaje: SimpleMessage = SimpleMessage("hola mundo del servidor")
                val socket = Socket(ip,puerto)
                val DataOutputStream = DataOutputStream(socket.getOutputStream())
                val DataInputStream = DataInputStream(socket.getInputStream())
                DataOutputStream.writeUTF(txt)
                socket.close()
            }
        })
        siguiente.setOnClickListener(View.OnClickListener {
            goToDrawActivity("hola mundo")
        })




    }
    private fun goToDrawActivity(input: String) {
        val intent = Intent(this, GraficaActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("input", input)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}