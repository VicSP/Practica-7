/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Subclase Profesor que hereda de Trabajador 
 * @author Abigail y Victor
 */
public class Profesor extends Trabajador{
    String materia;
    int grupo;
    /**
     * Constructor vacio Profesor 
     */

    public Profesor() {
    }
    /**
     * Constructor Profesor que recibe 7 parámetros
     * @param materia Es de tipo cadena
     * @param grupo Es de tipo entero
     * @param numTrabajador Es de tipo entero 
     * @param sueldo Es de tipo entero
     * @param nombre Es de tipo cadena 
     * @param apellido Es de tipo cadena
     * @param edad Es de tipo entero
     */

    public Profesor(String materia, int grupo, int numTrabajador, int sueldo, String nombre, String apellido, int edad) {
        super(numTrabajador, sueldo, nombre, apellido, edad);
        this.materia = materia;
        this.grupo = grupo;
    }
    /**
     * Método que obtiene el valor del parámetro materia
     * @return Es de tipo cadena
     */

    public String getMateria() {
        return materia;
    }
    /**
     * Método que establece el valor del parámetro materia
     * @param materia Es de tipo cadena
     */

    public void setMateria(String materia) {
        this.materia = materia;
    }
    /**
     * Método que obtiene el valor del parámetro grupo
     * @return Es de tipo entero
     */

    public int getGrupo() {
        return grupo;
    }
    /**
     * Método que establece el valor del parámetro grupo 
     * @param grupo Es de tipo entero
     */

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "\nmateria=" + materia + ", grupo=" + grupo + '}';
    }
    
}
