package com.example.boxworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.boxworld.sockets.SimpleMessage
import com.example.boxworld.sockets.Tarea
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
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

        boton.setOnClickListener(View.OnClickListener {
            println("click")

            Executors.newSingleThreadExecutor().execute{
                val mensaje: SimpleMessage = SimpleMessage("hola mundo del servidor")
                val socket = Socket(ip,puerto)
                val outputStream = ObjectOutputStream(socket.getOutputStream())
                //val inputStream = ObjectInputStream(socket.getInputStream())
                outputStream.writeUTF("esto es una prueba desde el cliente")
                socket.close()
            }
        })

    }


    /*private fun enviar(entrad: String){
        val archivoEntrada = archivoEntrada(entrad)
        val tarea = Tarea(ip,puerto,entrad)
        //tarea.delegate = this
        tarea.execute()
    }*/
}