/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11programaciontarea.Ejercicio4;

import java.io.Serializable;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Empleado implements Serializable {
    String dni, nombre;
    double sueldo;

    public Empleado(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    } // Fin constructor
    
    @Override
    public String toString() {
        return "DNI: " + this.dni + ", Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    } // Fin toString
}
