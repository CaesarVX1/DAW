/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio1y2;

import java.util.Arrays;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class MainEj2 {
    public static void main(String[] args) {
        Futbolista[] equipo = new Futbolista[5];
        equipo[0] = new Futbolista("555", "Zidane", 45, 100);
        equipo[1] = new Futbolista("111", "Messi", 36, 800);
        equipo[2] = new Futbolista("444", "Pele", 80, 1000);
        
        // A diferencia del primer main, aquí pongo la misma edad
        equipo[3] = new Futbolista("222", "Cristiano", 36, 850); 
        equipo[4] = new Futbolista("333", "Abidal", 36, 150);
        
        // Ordenamos por el criterio nuevo de edad y por nomkbre
        Arrays.sort(equipo, new CompararEdadNombre());
        
        System.out.println("Ordenado por edad y luego nombre");
        for(int i = 0; i<equipo.length;i++) {
            System.out.println("Posición " + i + ": " + equipo[i]);
        } // Fin for
    } // Fin main
} // Fin clase
