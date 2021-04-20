/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.carrerarelevos;

/**
 * Clase donde se crean los objetos de equipos y atletas
 * @author Andres
 */
public class Principal {
    
    Equipo equipo1 = new Equipo("Equipo 1", "E1");
    Equipo equipo2 = new Equipo("Equipo 2", "E2");
    Equipo equipo3 = new Equipo("Equipo 3", "E3");
    
    Atleta atleta1 = new Atleta("Corredor 1", 0, equipo1);
    Atleta atleta2 = new Atleta("Corredor 2", 33, equipo1);
    Atleta atleta3 = new Atleta("Corredor 3", 66, equipo1);
    Atleta atleta4 = new Atleta("Corredor 4", 0, equipo2);
    Atleta atleta5 = new Atleta("Corredor 5", 33, equipo2);
    Atleta atleta6 = new Atleta("Corredor 6", 66, equipo2);
    Atleta atleta7 = new Atleta("Corredor 7", 0, equipo3);
    Atleta atleta8 = new Atleta("Corredor 8", 33, equipo3);
    Atleta atleta9 = new Atleta("Corredor 9", 66, equipo3);
    
    /**
     * Se inician los hilos de los 9 atletas
     */
    public void inicializar(){
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        atleta5.start();
        atleta6.start();
        atleta7.start();
        atleta8.start();
        atleta9.start();
        
    }

}