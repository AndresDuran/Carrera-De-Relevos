/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.carrerarelevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @param equipo nombre del equipo del atleta
 * @param nombre nombre del atleta
 * @param  posIni es la posicion inicial del atleta
 * @author Andres
 */
public class Atleta extends Thread{
    
    Equipo equipo;
    private String nombre;
    private int posIni;

    
    /**
     * Constructor
     * @param nombre nombre del atleta
     * @param posicionInicial posicion inicial del atleta
     * @param equipo nombre del equipo al que pertenece
     */
    public Atleta(String nombre, int posicionInicial, Equipo equipo) {
        this.nombre = nombre;
        this.posIni = posicionInicial;
        this.equipo = equipo;
    }
    
    
    /**
     * Getters y Setters
     * @return 
     */
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosIni() {
        return posIni;
    }

    public void setPosIni(int posIni) {
        this.posIni = posIni;
    }
}