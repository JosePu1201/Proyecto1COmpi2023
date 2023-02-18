/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor_boxworold.Juego;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Mundo {

	private String nombre;
	private int filas;
	private int columnas;
	private String colorCajaFuera = "#ffff00";
	private String colorCajasEnAlmacen = "#fe0002";
	private String colorAlmace = "#d6fe0a";
	private String colorPared = "#bdbebf";
	private String colorCamino = "#0001ff";
	private String colorLugarNoDefinido = "#303030";
	private String colorJugador = "#ff00f7";
	private Jugador jugador;
	private ArrayList<Caja> cajas = new ArrayList<>();
	private ArrayList<Almacen> almacen = new ArrayList<>();
	private ArrayList<Casillas> casillas = new ArrayList<>();

	public Mundo() {
	}

	public Mundo(String nombre, int filas, int columnas) {
		this.nombre = nombre;
		this.filas = filas;
		this.columnas = columnas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public String getColorCajaFuera() {
		return colorCajaFuera;
	}

	public void setColorCajaFuera(String colorCajaFuera) {
		this.colorCajaFuera = colorCajaFuera;
	}

	public String getColorCajasEnAlmacen() {
		return colorCajasEnAlmacen;
	}

	public void setColorCajasEnAlmacen(String colorCajasEnAlmacen) {
		this.colorCajasEnAlmacen = colorCajasEnAlmacen;
	}

	public String getColorAlmace() {
		return colorAlmace;
	}

	public void setColorAlmace(String colorAlmace) {
		this.colorAlmace = colorAlmace;
	}

	public String getColorPared() {
		return colorPared;
	}

	public void setColorPared(String colorPared) {
		this.colorPared = colorPared;
	}

	public String getColorCamino() {
		return colorCamino;
	}

	public void setColorCamino(String colorCamino) {
		this.colorCamino = colorCamino;
	}

	public String getColorLugarNoDefinido() {
		return colorLugarNoDefinido;
	}

	public void setColorLugarNoDefinido(String colorLugarNoDefinido) {
		this.colorLugarNoDefinido = colorLugarNoDefinido;
	}

	public String getColorJugador() {
		return colorJugador;
	}

	public void setColorJugador(String colorJugador) {
		this.colorJugador = colorJugador;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public ArrayList<Caja> getCajas() {
		return cajas;
	}

	public void setCajas(ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}

	public ArrayList<Almacen> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(ArrayList<Almacen> almacen) {
		this.almacen = almacen;
	}

	public ArrayList<Casillas> getCasillas() {
		return casillas;
	}

	public void setCasillas(ArrayList<Casillas> casillas) {
		this.casillas = casillas;
	}

	public String posCajas() {
		String info = "";
		for (Caja caja : cajas) {
			info = info + "<boxes>\n"
				+ "\t<posX>" + caja.getPosX() + "</posX>\n"
				+ "\t<posY>" + caja.getPosY() + "</posY>\n"
				+ "</boxes>\n";
		}
		return info;
	}

	public String posAlmacen() {
		String info = "";
		for (Almacen caja : almacen) {
			info = info + "<targets>\n"
				+ "\t<posX>" + caja.getPosX() + "</posX>\n"
				+ "\t<posY>" + caja.getPosY() + "</posY>\n"
				+ "</targets>\n";
		}
		return info;
	}

	public String posJugador() {
		String info = "";
		info = info + "<player>\n"
			+ "\t<posX>" + jugador.getPosX() + "</posX>\n"
			+ "\t<posY>" + jugador.getPosY() + "<posY>\n"
			+ "</player>\n";

		return info;
	}
	public String posCasilla(){
		String info = "";
		for (Casillas caja : casillas) {
			info = info +"<board>\n"
				+ "\t<posX>"+caja.getPosX()+"</posX>\n"
				+ "\t<posY>"+caja.getPosY()+"</posY>\n"
				+ "\t<type>"+caja.getTipo()+"</type>\n"
				+ "</board>\n";
		}
		return info;
	}
	public String xml(){
		String salida =  "\t<worolds>\n"
			+ "\t\t<name>"+nombre+"</name>\n"
			+ "\t\t<rows>"+filas+"</rows>\n"
			+ "\t\t<cols>"+columnas+"</cols>\n"
			+"\t\t<config>\n"
			+"<\t\t\tbox_color>"+colorCajaFuera+"</box_color>\n"
			+"<\t\t\tbox_on_target_color>"+colorCajasEnAlmacen+"</box_on_target_color>\n"
			+"<\t\t\ttarget_color>"+colorAlmace+"</target_color>\n"
			+"<\t\t\tbrick_color>"+colorPared+"</brick_color>\n"
			+"<\t\t\thall_color>"+colorCamino+"</hall_color>\n"
			+"<\t\t\tundefined_color>"+colorLugarNoDefinido+"</undefined_color>\n"
			+"<\t\t\tplayer_color>"+colorJugador+"</player_color>\n"
			+"\t\t</config>\n"
			+"\t\t"+posCasilla()
			+"\t\t"+posCajas()
			+"\t\t"+posAlmacen()
			+"\t\t"+posJugador()
			+"\t</worolds>\n";
		return salida;
	}

}
