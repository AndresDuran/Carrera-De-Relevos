package co.edu.ucundinamarca.carrerarelevos;

/**
 * @param nombre es el nombre del equipo
 * @param inicial es el identificador del equipo
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
     * Método que concatena para imprimir
     * @return imprimir (variable concatenada)
     */
    
    public synchronized String concatenarImpresion(){
        String imprimir = "";
        imprimir = "\nEquipo : " + inicial + " ";
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                imprimir += "|R|";
            } else if (i == 66) {
                imprimir += "|R|";
            } else if (i == posActual) {
                imprimir += "{^o^}";
            } else {
                imprimir += "¨";
            }
        }
        return imprimir;
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
