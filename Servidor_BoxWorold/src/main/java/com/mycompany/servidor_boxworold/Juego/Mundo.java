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

    private ArrayList<String> nombre = new ArrayList<>();
    private ArrayList<Integer> filas = new ArrayList<>();
    private ArrayList<Integer> columnas = new ArrayList<>();
    private ArrayList<String> colorCajaFuera = new ArrayList<>();// "#ffff00";
    private ArrayList<String> colorCajasEnAlmacen = new ArrayList<>();// "#fe0002";
    private ArrayList<String> colorAlmace = new ArrayList<>();// "#d6fe0a";
    private ArrayList<String> colorPared = new ArrayList<>();// "#bdbebf";
    private ArrayList<String> colorCamino = new ArrayList<>();// "#0001ff";
    private ArrayList<String> colorLugarNoDefinido = new ArrayList<>();// "#303030";
    private ArrayList<String> colorJugador = new ArrayList<>();// "#ff00f7";
    private ArrayList<Jugador> jugador1 = new ArrayList<>();
    private ArrayList<Caja> cajas = new ArrayList<>();
    private ArrayList<Almacen> almacen = new ArrayList<>();
    private ArrayList<Casillas> casillas = new ArrayList<>();
    private ArrayList<Errores> errores = new ArrayList<>();

    public Mundo() {
    }

    public void agregaDes(String tipo, String Des) {
        errores.add(new Errores(tipo, Des));
    }

    public boolean validacion() {
        boolean val = true;
        if (jugador1.size() > 2) {
            agregaDes("Semantigo", "Solo se puede definir la posicion del jugador una vez");
        }
        if (nombre.size() > 2) {
            agregaDes("Semantico", "Solo se puede definir el nombre una vez");
            val = false;
        }
        if (filas.size() > 2) {
            agregaDes("Semantico", "Solo se puede definir las filas una vez");
            val = false;
        }
        if (columnas.size() > 2) {
            agregaDes("Semantico", "Solo de puede definir la columna una vez");
            val = false;
        }
        if (colorCajaFuera.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorCajaFuera.size() == 2) {
            colorCajaFuera.add(0, colorCajaFuera.get(1));
        }

        if (colorCajasEnAlmacen.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorCajasEnAlmacen.size() == 2) {
            colorCajasEnAlmacen.add(0, colorCajasEnAlmacen.get(0));
        }
        if (colorAlmace.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorAlmace.size() == 2) {
            colorAlmace.add(0, colorAlmace.get(0));
        }
        if (colorPared.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorPared.size() == 2) {
            colorPared.add(0, colorPared.get(0));
        }
        if (colorCamino.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorCamino.size() == 2) {
            colorCamino.add(0, colorCamino.get(0));
        }
        if (colorLugarNoDefinido.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorLugarNoDefinido.size() == 2) {
            colorLugarNoDefinido.add(0, colorLugarNoDefinido.get(0));
        }
        if (colorJugador.size() > 3) {
            agregaDes("Semantico", "Solo de puede definir el color una vez");
            val = false;

        } else if (colorJugador.size() == 2) {
            colorJugador.add(0, colorJugador.get(0));
        }

        return val;
    }

    public void imprimir() {
        System.err.println(xml(jugador1.get(0)));
    }

    public ArrayList<Jugador> getJugador1() {
        return jugador1;
    }

    public void setJugador1(ArrayList<Jugador> jugador1) {
        this.jugador1 = jugador1;
    }

    public ArrayList<Errores> getErrores() {
        return errores;
    }

    public void setErrores(ArrayList<Errores> errores) {
        this.errores = errores;
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
            info = info + "\t\t<boxes>\n"
                    + "\t\t\t<posX>" + caja.getPosX() + "</posX>\n"
                    + "\t\t\t<posY>" + caja.getPosY() + "</posY>\n"
                    + "\t\t</boxes>\n";
        }
        return info;
    }

    public String posAlmacen() {
        String info = "";
        for (Almacen caja : almacen) {
            info = info + "\t\t<targets>\n"
                    + "\t\t\t<posX>" + caja.getPosX() + "</posX>\n"
                    + "\t\t\t<posY>" + caja.getPosY() + "</posY>\n"
                    + "\t\t</targets>\n";
        }
        return info;
    }

    public String posJugador(Jugador jugador) {
        String info = "";
        info = info + "\t\t<player>\n"
                + "\t\t\t<posX>" + jugador.getPosX() + "</posX>\n"
                + "\t\t\t<posY>" + jugador.getPosY() + "<posY>\n"
                + "\t\t</player>\n";

        return info;
    }

    public String posCasilla() {
        String info = "";
        for (Casillas caja : casillas) {
            info = info + "\t\t<board>\n"
                    + "\t\t\t<posX>" + caja.getPosX() + "</posX>\n"
                    + "\t\t\t<posY>" + caja.getPosY() + "</posY>\n"
                    + "\t\t\t<type>" + caja.getTipo() + "</type>\n"
                    + "\t\t</board>\n";
        }
        return info;
    }

    public String xml(Jugador jugador) {
        String salida = "\t<worolds>\n"
                + "\t\t<name>" + nombre.get(0) + "</name>\n"
                + "\t\t<rows>" + filas.get(0) + "</rows>\n"
                + "\t\t<cols>" + columnas.get(0) + "</cols>\n"
                + "\t\t<config>\n"
                + "\t\t\t<box_color>" + colorCajaFuera.get(0) + "</box_color>\n"
                + "\t\t\t<box_on_target_color>" + colorCajasEnAlmacen.get(0) + "</box_on_target_color>\n"
                + "\t\t\t<target_color>" + colorAlmace.get(0) + "</target_color>\n"
                + "\t\t\t<brick_color>" + colorPared.get(0) + "</brick_color>\n"
                + "\t\t\t<hall_color>" + colorCamino.get(0) + "</hall_color>\n"
                + "\t\t\t<undefined_color>" + colorLugarNoDefinido.get(0) + "</undefined_color>\n"
                + "\t\t\t<player_color>" + colorJugador.get(0) + "</player_color>\n"
                + "\t\t</config>\n"
                + posCasilla()
                + posCajas()
                + posAlmacen()
                + posJugador(jugador)
                + "\t</worolds>\n";
        return salida;
    }

}
