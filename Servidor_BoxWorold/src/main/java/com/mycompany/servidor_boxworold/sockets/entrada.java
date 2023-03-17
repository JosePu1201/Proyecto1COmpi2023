/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.sockets;

import com.mycompany.servidor_boxworold.lexer.cup.parser;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class entrada extends Thread{
    
    private int puerto;
    private ArrayList<parser> mundos = new ArrayList<>();

    public entrada(int ip) {
        this.puerto = ip;
    }
    @Override
    public void run(){
        try(ServerSocket servidor = new ServerSocket(this.puerto)){
            while(true){
            System.out.println("escuchando 0");
            Socket socket = servidor.accept();
            System.out.println("escuchando");
            
            //ObjectOutputStream salida = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
            System.out.println("Mensaje por recibir");
            //SimpleMessage nuevo = (SimpleMessage) entrada.readObject();
            String nuevos  = entrada.readUTF();
            
            System.out.println("Mensaje Recibido ");
            System.out.println(nuevos);
            //System.out.println("entrad de archivo"+nuevo.getEntrada());
            
            socket.close();
            }

            //System.err.println(nuevo.getEntrada());
            // Lo que entra leido con entrada 
            
            
            //lo que sale enviado con salida 
            
        }catch(IOException e){
            System.out.println("error");
        }
        //Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);

        
        
    }
    
}
