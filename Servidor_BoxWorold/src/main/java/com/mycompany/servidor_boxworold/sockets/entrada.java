/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class entrada extends Thread{
    
    private int puerto;

    public entrada(int ip) {
        this.puerto = ip;
    }
    @Override
    public void run(){
        while(true){
        try(ServerSocket servidor = new ServerSocket(this.puerto)){
            System.out.println("escuchando 0");
            String direccionHost = InetAddress.getLocalHost().getHostAddress();
            Socket socket = servidor.accept();
            System.out.println("escuchando");
            ObjectOutputStream salida = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
            archivoEntrada nuevo = (archivoEntrada) entrada.readObject();
            System.err.println("entrad de archivo");
            System.err.println(nuevo.getEntrada());
            // Lo que entra leido con entrada 
            
            
            //lo que sale enviado con salida 
            
        }
        catch(IOException e){
            System.out.println("error");
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error");
            }
        }
        
    }
    
}
