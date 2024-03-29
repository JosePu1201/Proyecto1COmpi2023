package com.example.boxworld.sockets

import android.os.AsyncTask
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket
import java.util.concurrent.Executors

class Tarea(val ip: String, val port: Int, val message: String)  {

    fun execute(){
        Executors.newSingleThreadExecutor().execute{
            val socket = Socket(ip,port)
            val outputStream = ObjectOutputStream(socket.getOutputStream())
            val inputStream = ObjectInputStream(socket.getInputStream())
            outputStream.writeObject(message)
        }

    }
/*
    var delegate: AsyncResponse? = null

    override fun doInBackground(vararg p0: Void?): String {
        val socket = Socket(ip, port)
        val outputStream = ObjectOutputStream(socket.getOutputStream())
        val inputStream = ObjectInputStream(socket.getInputStream())

        // sending message
        outputStream.writeObject(message)

        // receiving message
        val response: archivoEntrada = inputStream.readObject() as archivoEntrada;
        //showing message
        return response.toString()
    }

    override fun onPostExecute(result: String?) {
        delegate?.processResponse(result)
    }*/
}