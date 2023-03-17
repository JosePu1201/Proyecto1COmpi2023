package com.example.boxworld

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

    }


    private fun enviar(entrad: String){
      /*  val archivoEntrada = SimpleMessage(entrad)
        val tarea = MyTask(ip,puerto,archivoEntrada)
        //tarea.delegate = this
        tarea.execute()*/
    }
}