/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.servidor_boxworold.Grafico;

import com.mycompany.servidor_boxworold.sockets.Peticiones;
import com.mycompany.servidor_boxworold.sockets.entrada;
import javax.swing.JTextArea;

/**
 *
 * @author jose
 */
public class MuestraPeticiones extends javax.swing.JPanel {

    /**
     * Creates new form Peticiones
     */
    public MuestraPeticiones() {
        initComponents();
        ejecucion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();

        setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Peticiones ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setOpaque(true);
        add(jLabel1);

        entrada.setColumns(20);
        entrada.setRows(5);
        jScrollPane1.setViewportView(entrada);

        add(jScrollPane1);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Respuestas ");
        jLabel2.setAutoscrolls(true);
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setOpaque(true);
        add(jLabel2);

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane2.setViewportView(salida);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea salida;
    // End of variables declaration//GEN-END:variables
    public void ejecucion(){
        entrada nuevo = new entrada(5000);
        nuevo.setPanel(this);
        nuevo.start();
        
        Peticiones pet = new Peticiones();
        pet.setMundos(nuevo.getMundos());
        pet.setPanel(this);
        pet.start();
        
    }

    public JTextArea getEntrada() {
        return entrada;
    }

    public void setEntrada(JTextArea entrada) {
        this.entrada = entrada;
    }

    public JTextArea getSalida() {
        return salida;
    }

    public void setSalida(JTextArea salida) {
        this.salida = salida;
    }
    
}
