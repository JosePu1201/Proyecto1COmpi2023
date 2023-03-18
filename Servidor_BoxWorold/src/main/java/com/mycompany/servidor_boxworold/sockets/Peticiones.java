/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.sockets;

import com.mycompany.servidor_boxworold.Grafico.MuestraPeticiones;
import com.mycompany.servidor_boxworold.Juego.Mundo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Peticiones extends Thread {
    private MuestraPeticiones panel;
    private final int puerto = 9090;
    private ArrayList<Mundo> mundos = new ArrayList<>();

    public Peticiones() {
    }

    public ArrayList<Mundo> getMundos() {
        return mundos;
    }

    public void setMundos(ArrayList<Mundo> mundos) {
        this.mundos = mundos;
    }

    public MuestraPeticiones getPanel() {
        return panel;
    }

    public void setPanel(MuestraPeticiones panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        try (ServerSocket servidor = new ServerSocket(this.puerto)) {
            while (true) {
                Socket socket = servidor.accept();
                System.out.println("Escuchando puerto 9090");
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                DataInputStream entrada = new DataInputStream(socket.getInputStream());
                String nuevos = entrada.readUTF();
                System.out.println(nuevos);
                panel.getEntrada().setText(nuevos);
                if(nuevos.equals("all")){
                
                }
                else{
                    String sal = "";
                    for (Mundo mundo : mundos) {
                        if(mundo.getNombre().get(0).equals(nuevos) && mundo.isBandera()){
                            sal = mundo.getXml();
                            panel.getSalida().setText(sal);
                        }
                    }
                }
                socket.close();
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
