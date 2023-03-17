/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.sockets;

import java.io.Serializable;

/**
 *
 * @author jose
 */
public class SimpleMessage implements Serializable {
    
    private String entrada;
    
    private static final long serialVersionUID = 6529685098267757690L;

    public SimpleMessage(String entrada) {
        this.entrada = entrada;
    }

    public SimpleMessage() {
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" + "entrada=" + entrada + '}';
    }
    
    
}
