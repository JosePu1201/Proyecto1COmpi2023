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
public class xml {
       
    
    public String salidaXML(ArrayList<String> entradas){
        String sal= "";
        String salida = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "\n<worlds>";
        
        for (String entrada : entradas) {
            sal = sal + "\n\t<worold>" +entrada+"</worold>";
        }
        salida = salida +sal+ "\n </worlds>";
        
        return salida;
    }
    public String error(String a){
        String sal="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "\n<worlds>";
        sal = sal +a ;       
        sal = sal + "\n </worlds>";
        
        return sal;
    }
        public String mundo(String a){
        String sal="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "\n<errors>";
        sal = sal +a ;       
        sal = sal + "\n </errors>";
        
        return sal;
    }
}
