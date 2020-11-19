/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Subclase Alumno que hereda de Persona
 * @author Abigail y Victor
 */
public class Alumno extends Persona{
    int numCuenta;
    /**
     * Constructor vacio Alumno
     */

    public Alumno() {
    }
    /**
     * Constructor Alumno que recibe 4 parámetros
     * @param numCuenta Es de tipo entero
     * @param nombre Es de tipo cadena
     * @param apellido Es de tipo cadena
     * @param edad Es de tipo entero
     */

    public Alumno(int numCuenta, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numCuenta = numCuenta;
    }
    /**
     * Método que obtiene el valor del parámetro numCuenta
     * @return Es de tipo entero
     */

    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * Método que establece el valor del parámetro numCuenta
     * @param numCuenta Es de tipo entero
     */

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    @Override
    public String toString() {
        return super.toString()+" Alumno{" + "numCuenta=" + numCuenta + '}';
    }
    
}
