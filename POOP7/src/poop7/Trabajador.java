/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Subclase Trabajador que hereda de Persona 
 * @author Abigail y Victor
 */
public class Trabajador extends Persona{
    int numTrabajador;
    int sueldo;
    /**
     * Constructor vacio Trabajador
     */
    public Trabajador() {
    }
    /**
     * Constructor Trabajador que recibe 5 parámetros
     * @param numTrabajador Es de tipo entero
     * @param sueldo Es de tipo entero 
     * @param nombre Es de tipo cadena
     * @param apellido Es de tipo cadena
     * @param edad Es de tipo entero
     */

    public Trabajador(int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
    }
    /**
     * Método que obtiene el valor del parámetro numTrabajador
     * @return Es de tipo entero
     */

    public int getNumTrabajador() {
        return numTrabajador;
    }
    /**
     * Método que establece el valor del parámetro numTrabajador
     * @param numTrabajador 
     */

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
    /**
     * Método que obtiene el valor del parámetro sueldo
     * @return Es de tipo entero
     */

    public int getSueldo() {
        return sueldo;
    }
    /**
     * Método que establece el valor del parámetro sueldo
     * @param sueldo Es de tipo entero
     */

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    @Override
    public String toString() {
        return super.toString()+" Trabajador{" + "numTrabajador=" + numTrabajador + ", sueldo=" + sueldo + '}';
    }
    
}

