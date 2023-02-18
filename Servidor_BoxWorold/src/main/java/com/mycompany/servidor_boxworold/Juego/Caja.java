/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.Juego;

/**
 *
 * @author jose
 */
public class Caja extends Casillas{
	private String nombre = "Caja";
	public Caja(int posX, int posY, String tipo) {
		super(posX, posY, tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
