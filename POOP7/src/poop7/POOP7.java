/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase principal que hace uso de las otras clases
 * @author Abigail y Victor
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****1*****");
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("*****2*****");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        System.out.println("Nombre "+ gerente1.getNombre());
        System.out.println("No Empleado "+ gerente1.getNumEmpleado());
        System.out.println("Sueldo "+ gerente1.getSueldo());
        System.out.println("Presupuesto "+ gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto "+ gerente1.getPresupuesto());
        
        System.out.println("*****3*****");
        Gerente gerente2 = new Gerente("Julio",88,200000,500000);
        System.out.println("Nombre "+ gerente2.getNombre());
        System.out.println("No Empleado "+ gerente2.getNumEmpleado());
        System.out.println("Sueldo "+ gerente2.getSueldo());
        System.out.println("Presupuesto "+ gerente2.getPresupuesto());
        
        System.out.println("*****4*****");
        //Sobrescritura
        System.out.println(gerente2);
        
        System.out.println("*****5*****");
        //Sobrecarga
        System.out.println("Presupuesto "+ gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+ gerente2.getPresupuesto());
        gerente2.setPresupuesto(5,5.5f);
        System.out.println("Presupuesto "+ gerente2.getPresupuesto());
        
        System.out.println("*****6*****");
        
        System.out.println("****6.1****");
        Persona per1 = new Persona();
        per1.setNombre("Victor");
        per1.setApellido("Santiago");
        per1.setEdad(19);
        System.out.println("Persona 1:");
        System.out.println("Nombre "+ per1.getNombre());
        System.out.println("Apellido "+ per1.getApellido());
        System.out.println("Edad "+ per1.getEdad());
        System.out.println(per1);
        Persona per2 = new Persona("Abigail","Peñafiel",19);
        System.out.println("Persona 2:");
        System.out.println("Nombre "+ per2.getNombre());
        System.out.println("Apellido "+ per2.getApellido());
        System.out.println("Edad "+ per2.getEdad());
        System.out.println(per2);
        
        System.out.println("****6.2****");
        Alumno alum1 = new Alumno();
        alum1.setNombre("Mairol");
        alum1.setApellido("Estrella");
        alum1.setEdad(19);
        alum1.setNumCuenta(317485602);
        System.out.println("Alumno 1:");
        System.out.println("Nombre "+ alum1.getNombre());
        System.out.println("Apellido "+ alum1.getApellido());
        System.out.println("Edad "+ alum1.getEdad());
        System.out.println("No de Cuenta "+ alum1.getNumCuenta());
        System.out.println(alum1);
        
        Alumno alum2 = new Alumno(317271469,"Christian","Cedillo",19);
        System.out.println("Alumno 2:");
        System.out.println("Nombre "+ alum2.getNombre());
        System.out.println("Apellido "+ alum2.getApellido());
        System.out.println("Edad "+ alum2.getEdad());
        System.out.println("No de Cuenta "+ alum2.getNumCuenta());
        System.out.println(alum2);
        
        System.out.println("****6.3****");
        Trabajador trab1 = new Trabajador();
        trab1.setNombre("Gilberto");
        trab1.setApellido("Natera");
        trab1.setEdad(27);
        trab1.setNumTrabajador(170);
        trab1.setSueldo(3500);
        System.out.println("Trabajador 1:");
        System.out.println("Nombre "+ trab1.getNombre());
        System.out.println("Apellido "+ trab1.getApellido());
        System.out.println("Edad "+ trab1.getEdad());
        System.out.println("No de Trabajador "+ trab1.getNumTrabajador());
        System.out.println("Sueldo "+ trab1.getSueldo());
        System.out.println(trab1);
        
        Trabajador trab2 = new Trabajador(145,4500,"Damon","Ángeles",30);
        System.out.println("Trabajador 2:");
        System.out.println("Nombre "+ trab2.getNombre());
        System.out.println("Apellido "+ trab2.getApellido());
        System.out.println("Edad "+ trab2.getEdad());
        System.out.println("No de Trabajador "+ trab2.getNumTrabajador());
        System.out.println("Sueldo "+ trab2.getSueldo());
        System.out.println(trab2);
        
        System.out.println("****6.4****");
        Profesor prof1 = new Profesor();
        prof1.setNombre("Ulises");
        prof1.setApellido("Candia");
        prof1.setEdad(28);
        prof1.setNumTrabajador(150);
        prof1.setSueldo(4500);
        prof1.setMateria("Geometría analítica y caculo differencial");
        prof1.setGrupo(10);
        System.out.println("Profesor 1:");
        System.out.println("Nombre "+ prof1.getNombre());
        System.out.println("Apellido "+ prof1.getApellido());
        System.out.println("Edad "+ prof1.getEdad());
        System.out.println("No de Trabajador "+ prof1.getNumTrabajador());
        System.out.println("Sueldo "+ prof1.getSueldo());
        System.out.println("Materia "+ prof1.getMateria());
        System.out.println("Grupo "+ prof1.getGrupo());
        System.out.println(prof1);
        
        Profesor prof2 = new Profesor("Fundamentos de Programacion",05,117,5000,"Omar","Garret",29);
        System.out.println("Profesor 2:");
        System.out.println("Nombre "+ prof2.getNombre());
        System.out.println("Apellido "+ prof2.getApellido());
        System.out.println("Edad "+ prof2.getEdad());
        System.out.println("No de Trabajador "+ prof2.getNumTrabajador());
        System.out.println("Sueldo "+ prof2.getSueldo());
        System.out.println("Materia "+ prof2.getMateria());
        System.out.println("Grupo "+ prof2.getGrupo());
        System.out.println(prof2);
        
        System.out.println("****6.5****");
        Director dire1 = new Director();
        dire1.setNombre("Gabriela");
        dire1.setApellido("Bistrain");
        dire1.setEdad(32);
        dire1.setNumTrabajador(23);
        dire1.setSueldo(6000);
        dire1.setEscuela("Instituto Francisco Possenti");
        System.out.println("Director 1:");
        System.out.println("Nombre "+ dire1.getNombre());
        System.out.println("Apellido "+ dire1.getApellido());
        System.out.println("Edad "+ dire1.getEdad());
        System.out.println("No de Trabajador "+ dire1.getNumTrabajador());
        System.out.println("Sueldo "+ dire1.getSueldo());
        System.out.println("Escuela "+ dire1.getEscuela());
        System.out.println(dire1);
        
        Director dire2 = new Director("Ilvermorny",39,6500,"Mael","Malfoy",33);
        System.out.println("Director 2:");
        System.out.println("Nombre "+ dire2.getNombre());
        System.out.println("Apellido "+ dire2.getApellido());
        System.out.println("Edad "+ dire2.getEdad());
        System.out.println("No de Trabajador "+ dire2.getNumTrabajador());
        System.out.println("Sueldo "+ dire2.getSueldo());
        System.out.println("Escuela "+ dire2.getEscuela());
        System.out.println(dire2);
    }
    
}
