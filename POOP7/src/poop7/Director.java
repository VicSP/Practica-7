/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Subclase Director que hereda de Trabajador 
 * @author Abigail y Victor
 */
public class Director extends Trabajador{
    String escuela;
    /**
     * Constructor vacio Director
     */

    public Director() {
    }
    /**
     * Constructor Director que recibe 6 parámetros
     * @param escuela Es de tipo cadena
     * @param numTrabajador Es de tipo entero
     * @param sueldo Es de tipo entero
     * @param nombre Es de tipo cadena
     * @param apellido Es de tipo cadena
     * @param edad Es de tipo entero
     */

    public Director(String escuela, int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(numTrabajador, sueldo, nombre, apellido, edad);
        this.escuela = escuela;
    }
    /**
     * Método que obtiene el valor del parámetro escuela
     * @return Es de tipo cadena
     */

    public String getEscuela() {
        return escuela;
    }
    /**
     * Método que establece el valor del parámetro escuela
     * @param escuela Es de tipo cadena
     */

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /**
     * 
     * @return Es de tipo cadena
     */

    @Override
    public String toString() {
        return super.toString()+" Director{" + "\nescuela=" + escuela + '}';
    }
    
}
