/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.sockets;

import com.mycompany.servidor_boxworold.Grafico.MuestraPeticiones;
import com.mycompany.servidor_boxworold.Juego.Errores;
import com.mycompany.servidor_boxworold.Juego.Mundo;
import com.mycompany.servidor_boxworold.lexer.Lexer;
import com.mycompany.servidor_boxworold.lexer.cup.parser;
import com.mycompany.servidor_boxworold.xml;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StringReader;
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
public class entrada extends Thread {

    private int puerto;
    private MuestraPeticiones panel;
    private ArrayList<Mundo> mundos = new ArrayList<>();

    public entrada(int ip) {
        this.puerto = ip;
    }

    @Override
    public void run() {
        try (ServerSocket servidor = new ServerSocket(this.puerto)) {
            while (true) {
                Socket socket = servidor.accept();
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                DataInputStream entrada = new DataInputStream(socket.getInputStream());
                String nuevos = entrada.readUTF();
                panel.getEntrada().setText(nuevos);
                parser(nuevos,salida);
                socket.close();
            }

        } catch (IOException e) {
            
        }
        //Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);

    }

    public void parser(String archivo,DataOutputStream salida) {
        Reader adentro = new StringReader(archivo);
        Lexer nuevo = new Lexer(adentro);
        parser nuevo1 = new parser(nuevo);
        try {
            nuevo1.parse();
            if(nuevo1.getMundoTemp().isBandera()){
                mundos.add(nuevo1.getMundoTemp());
                salida.writeUTF("Mundo correcto"); 
                panel.getSalida().setText("Mundo Correcto");
            }else{
                String s="";
                for (Errores mundo :nuevo1.getMundoTemp().getErrores()) {
                      mundo.xml();
                      s = s + mundo.getSalXml();
                }
                xml n = new xml();
                salida.writeUTF(n.error(s));  
                panel.getSalida().setText(n.error(s));
            }

        } catch (Exception e) {
            
        }

    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public MuestraPeticiones getPanel() {
        return panel;
    }

    public void setPanel(MuestraPeticiones panel) {
        this.panel = panel;
    }

    public ArrayList<Mundo> getMundos() {
        return mundos;
    }

    public void setMundos(ArrayList<Mundo> mundos) {
        this.mundos = mundos;
    }

}
