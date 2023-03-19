/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.servidor_boxworold;

import com.mycompany.servidor_boxworold.*;
import com.mycompany.servidor_boxworold.Grafico.MuestraPeticiones;
import com.mycompany.servidor_boxworold.lexer.Lexer;
import com.mycompany.servidor_boxworold.lexer.cup.parser;
import com.mycompany.servidor_boxworold.sockets.entrada;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class Servidor_BoxWorold {

    public static void main(String[] args) {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tPantalla = pantalla.getScreenSize(); // guarda el tamaño de la pantalla
        int altura = tPantalla.height;
        int ancho = tPantalla.width;
        JFrame ventana = new JFrame();
        ventana.setSize(tPantalla);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Servidor Boxworld");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MuestraPeticiones pedir = new MuestraPeticiones();
        ventana.getContentPane().add(pedir);
        ventana.setVisible(true);
        

    }
}
