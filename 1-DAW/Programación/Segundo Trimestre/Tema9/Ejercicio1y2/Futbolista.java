/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio1y2;


/**
 *
 * @author Cesar Valverde Pardo
 */
public class Futbolista implements Comparable<Futbolista>{
    // Atributos
    protected String dni, nombre;
    protected int edad, numGoles;
    
    //Constructor
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    } //Fin constructor
    
    // Métodos
    @Override
    public boolean equals (Object obj) {
        // Nos aseguramos de que lo que pase tiene que ser sí o sí Futbolista
        if(!(obj instanceof Futbolista)) {
            return false;
        } // Fin 
        
        // Castemamos
        Futbolista otro = (Futbolista) obj;
        // Comparamos el DNI de this con el de otro
        return this.dni.equals(otro.dni);
    } // Fin equals
    
    @Override
    public String toString() {
        return "DNI: " + this.dni + ""
                + "Nombre: " + this.nombre + ""
                + "Edad: " + this.edad + ""
                + "Numero de Goles: " + this.numGoles;
    } // Fin toString();

    // Metemos el método que nos obliga la interfaz de Comparable
    @Override
    public int compareTo(Futbolista otro) {return this.dni.compareTo(otro.dni);} // Fin CompareTo
    
    
    
    
}
