/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.carrerarelevos;

/**
 * Clase para metodo aleatorio qe genera los numeros para avanzar
 * @author Andres
 */
public class Calcular {
    
    /**
     * Método que genera un numero aleatorio entre 0 y 3
     */
    public static int random(){
        return (int) Math.floor(Math.random()*(4));
    }
}
