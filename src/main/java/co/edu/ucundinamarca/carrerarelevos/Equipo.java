/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.carrerarelevos;

/**
 * @param nombre es el nombre del equipo
 * @param inicial es la primera letra del equipo
 * @param posActual es la posicion inicial en la que comienza la carrera
 * @author Andres
 */
public class Equipo {
    
    private String nombre;
    private String inicial;
    private int posActual;
    
    /**
    * Constructor que recibe el nombre y la posicion inicial del equipo
    * @param nombre recibe el nombre del equipo
    * @param inicial recibe la inicial del equipo
    */
    public Equipo(String nombre, String inicial) {
        this.nombre = nombre;
        this.inicial = inicial;
        this.posActual=0;

    }
   
    /**
     * Getters y setters
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    
}
