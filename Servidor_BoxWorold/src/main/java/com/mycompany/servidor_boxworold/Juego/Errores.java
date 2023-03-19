/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.Juego;

/**
 *
 * @author jose
 */
public class Errores {
    private String token;
    private String tipo;
    private String Descripcion;
    private int fila;
    private int columna;
    private String salXml;

    public Errores() {
    }

    public Errores(String token, String tipo, String Descripcion, int fila, int columna) {
        this.token = token;
        this.tipo = tipo;
        this.Descripcion = Descripcion;
        this.fila = fila;
        this.columna = columna;
    }

    public String getSalXml() {
        return salXml;
    }

    public void setSalXml(String salXml) {
        this.salXml = salXml;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Errores(String tipo, String Descripcion) {
        this.tipo = tipo;
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void xml(){
        salXml = "<error>\n"
                + "\t<lexema>"+token+"</lexema>\n"
                + "\t<line>"+fila+"</line>\n"
                + "\t<column>"+columna+"</column>\n"
                + "\t<type>"+tipo+"</type>\n"
                + "\t<description>"+Descripcion+"</description>\n"
                + "</error>\n";
    }
    
            
}
