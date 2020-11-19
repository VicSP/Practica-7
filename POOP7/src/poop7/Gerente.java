/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *Clase Gerente que hereda de Empleado
 * @author Santiago Victor
 */
public class Gerente extends Empleado {
    private int presupuesto;
    
    /**
     * Constructor Gerente vacio
     */
    public Gerente() {
    }
    /**
     * Constructor Gerente que recibe 3 parámetros 
     * @param nombre Es de tipo cadena
     * @param numEmpleado Es de tipo entero
     * @param sueldo Es de tipo entero
     */
    public Gerente(String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
    }
    /**
     * Constructor que recibe 1 parámetro
     * @param presupuesto Es de tipo entero
     */

    public Gerente(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Constructor que recibe 4 parámetros
     * @param nombre Es de tipo cadena
     * @param numEmpleado Es de tipo entero
     * @param sueldo Es de tipo entero
     * @param presupuesto Es de tipo entero
     */

    public Gerente(String nombre, int numEmpleado, int sueldo,int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * Método que obtiene el valor del parámetro presupuesto
     * @return 
     */
    

    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Método que establece el valor del parámetro presupuesto
     * @param presupuesto 
     */

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Método que establece el valor del parámetro presupuesto dependiendo de la tasa
     * @param anio Es de tipo entero
     * @param tasa Es de tipo flotante
     */
    
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto += (int)(presupuesto /anio*tasa);
    }
    /**
     * 
     * @return Es de tipo cadena 
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';//clase anterior y concatena el toString
    }

       
}
