package com.example.boxworld.sockets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class s extends Thread{
    int puerto = 9090;
    public s() {

    }
    @Override
    public void run(){
        try (ServerSocket servidor = new ServerSocket(puerto)) {
            System.out.println("escuchando 0");
            String direccionHost = InetAddress.getLocalHost().getHostAddress();
            Socket socket = servidor.accept();
            System.out.println("escuchando");
            ObjectOutputStream salida = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
            String nuevo = entrada.readObject().toString();
            System.err.println("entrad de archivo");


        } catch (IOException e) {
            System.out.println("error");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
        }
    }
    public void servidor(int puerto) {


    }
}
