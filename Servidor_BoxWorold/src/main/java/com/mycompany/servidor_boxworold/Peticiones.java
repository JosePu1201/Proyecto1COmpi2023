/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Peticiones {
    
    public String salidaXML(ArrayList<String> entradas){
        String salida = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "\n<worlds>";
        
        for (String entrada : entradas) {
            salida = salida + "\n" +entrada;
        }
        salida = salida + "\n </worlds>";
        
        return salida;
    }
}
