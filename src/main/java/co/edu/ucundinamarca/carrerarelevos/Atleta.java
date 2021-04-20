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
    /**
     * Variables de la clase atleta
     */
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
     * Metodo heredado para los hilos
     */
    @Override
    public void run(){
        if (posIni == 0) {
            sumaAtleta(1);
        } else if(posIni ==33){
            sumaAtleta(2);
        }else if(posIni == 66){
            sumaAtleta(3);
        }else{
            dormirHilo();
        }
    }

    /**
     * Método para avanzar
     * @param atleta id o numero del atleta
     */
    public void sumaAtleta(int atleta){
        while(true){
            if(atleta == 1){
                int pasoActual = suma();
                if (pasoActual >= 33) { 
                    synchronized (equipo) {
                        equipo.notifyAll();
                    }
                    break;
                }
            }
            if(atleta == 2){
                int pasoActual = suma();
                if (pasoActual >= 66) {         
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
            if(atleta == 3){
                int pasoActual = suma();
                if (pasoActual >= 100) {            
                    System.out.println(equipo.getNombre()+" Llegó a la meta primero");                    
                    System.exit(0);
                }
            }
        }
    }
    
    
    /**
     * Método que hace que el siguiente hilo (atleta) espere 
     */
    public void dormirHilo(){
        synchronized (equipo) {
            try {
                equipo.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Metodo que suma al atleta un numero random de 0 a 3
     * @return posicion del atleta 
     */
    public int suma() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        int avance = Calcular.random();
       
        equipo.setPosActual(equipo.getPosActual() + avance);
        imprimir();
        return equipo.getPosActual();
            
      }
    /**
     * Variables para pintar por colores los equipos
     */
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String reset="\u001B[0m";
   
    /**
     * Método para imprimir el equipo y sus posiciones
     * Llama al método concatenarImpresion para imprimir
     */
    public void imprimir(){
        if(equipo.concatenarImpresion().contains("E1")){
            System.out.println(red+equipo.concatenarImpresion()+reset);
        }else if(equipo.concatenarImpresion().contains("E2")){
            System.out.println(yellow+equipo.concatenarImpresion()+reset);
        }else if(equipo.concatenarImpresion().contains("E3")){
            System.out.println(green+equipo.concatenarImpresion()+reset);
        }
    }

    
    /**
     * getters y setters
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