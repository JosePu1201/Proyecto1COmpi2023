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

	private ArrayList<String> nombre  = new ArrayList<>(); ;
	private ArrayList<Integer> filas = new ArrayList<>();;
	private ArrayList<Integer> columnas = new ArrayList<>();;
	private ArrayList<String> colorCajaFuera  = new ArrayList<>();// "#ffff00";
	private ArrayList<String> colorCajasEnAlmacen  = new ArrayList<>();// "#fe0002";
	private ArrayList<String> colorAlmace  = new ArrayList<>();// "#d6fe0a";
	private ArrayList<String> colorPared  = new ArrayList<>();// "#bdbebf";
	private ArrayList<String> colorCamino  = new ArrayList<>();// "#0001ff";
	private ArrayList<String> colorLugarNoDefinido  = new ArrayList<>();// "#303030";
	private ArrayList<String> colorJugador  = new ArrayList<>();// "#ff00f7";
	private ArrayList<Jugador> jugador1 = new ArrayList<>();;
	private ArrayList<Caja> cajas = new ArrayList<>();
	private ArrayList<Almacen> almacen = new ArrayList<>();
	private ArrayList<Casillas> casillas = new ArrayList<>();

	public Mundo() {
	}

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<Integer> filas) {
        this.filas = filas;
    }

    public ArrayList<Integer> getColumnas() {
        return columnas;
    }

    public void setColumnas(ArrayList<Integer> columnas) {
        this.columnas = columnas;
    }

    public ArrayList<String> getColorCajaFuera() {
        return colorCajaFuera;
    }

    public void setColorCajaFuera(ArrayList<String> colorCajaFuera) {
        this.colorCajaFuera = colorCajaFuera;
    }

    public ArrayList<String> getColorCajasEnAlmacen() {
        return colorCajasEnAlmacen;
    }

    public void setColorCajasEnAlmacen(ArrayList<String> colorCajasEnAlmacen) {
        this.colorCajasEnAlmacen = colorCajasEnAlmacen;
    }

    public ArrayList<String> getColorAlmace() {
        return colorAlmace;
    }

    public void setColorAlmace(ArrayList<String> colorAlmace) {
        this.colorAlmace = colorAlmace;
    }

    public ArrayList<String> getColorPared() {
        return colorPared;
    }

    public void setColorPared(ArrayList<String> colorPared) {
        this.colorPared = colorPared;
    }

    public ArrayList<String> getColorCamino() {
        return colorCamino;
    }

    public void setColorCamino(ArrayList<String> colorCamino) {
        this.colorCamino = colorCamino;
    }

    public ArrayList<String> getColorLugarNoDefinido() {
        return colorLugarNoDefinido;
    }

    public void setColorLugarNoDefinido(ArrayList<String> colorLugarNoDefinido) {
        this.colorLugarNoDefinido = colorLugarNoDefinido;
    }

    public ArrayList<String> getColorJugador() {
        return colorJugador;
    }

    public void setColorJugador(ArrayList<String> colorJugador) {
        this.colorJugador = colorJugador;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador1;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador1 = jugador;
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

	public String posJugador(Jugador jugador) {
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
             Jugador jugador = new Jugador(0, 0, "o");
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
			+"\t\t"+posJugador(jugador)
			+"\t</worolds>\n";
		return salida;
	}

}
