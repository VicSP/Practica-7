/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poop7;
/**
 *Clase base Empleado
 * @author Santiago Victor
 */
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;
    
    /**
     * Constructor vacio Empleado
     */
    public Empleado() {
    }
    /**
     *Constructor Empleado que recibe 3 parámetros
     * @param nombre Es de tipo cadena
     * @param numEmpleado Es de tipo entero
     * @param sueldo Es de tipo entero
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * Método que obtiene el valor del parámetro nombre
     * @return Es de tipo cadena 
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Método que establece el valor del parámetro nombre
     * @param nombre Es de tipo cadena
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que obtiene el valor del parámetro numEmpleado
     * @return Es de tipo entero
     */

    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * Método que establece el valor del parámetro numEmpleado
     * @param numEmpleado Es de tipo entero
     */

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
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
        if (sueldo >=0)
            this.sueldo = sueldo;
    }
    /**
     * Método que aumenta el valor del parámetro sueldo dependiendo de un porcentaje
     * @param porcentaje Es de tipo entero
     * @return Es de tipo entero
     */
    public int aumentarSueldo(int porcentaje){
        sueldo+= (int)(sueldo* porcentaje/100);
        return sueldo;
    }
    /**
     * 
     * @return Es de tipo cadena
     */

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
