/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase base Persona
 * @author Abigail y Victor
 */
public class Persona {
    String nombre;
    String apellido;
    int edad;
    /**
     * Constructor Persona vacio
     */
    public Persona() {
    }
    /**
     * Constructor Persona que recibe 3 parámetros 
     * @param nombre Es de tipo cadena
     * @param apellido Es de tipo cadena
     * @param edad Es de tipo entero
     */

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
     * Método que obtiene el valor del parámetro apellido
     * @return Es de tipo cadena
     */

    public String getApellido() {
        return apellido;
    }
    /**
     * Método que establece el valor del parámetro apellido
     * @param apellido Es de tipo cadena
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Método que obtiene el valor del parámetro edad
     * @return Es de tipo entero
     */

    public int getEdad() {
        return edad;
    }
    /**
     * Método que establece el valor del parámetro edad
     * @param edad Es de tipo entero
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return Es de tipo cadena
     */

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ",\nedad=" + edad + '}';
    }
    
}
