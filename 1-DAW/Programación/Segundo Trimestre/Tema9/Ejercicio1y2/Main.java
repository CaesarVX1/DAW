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
public class Main {
    public static void main(String[] args) {

        // Hacemos un array
        Futbolista[] equipo = new Futbolista[5];
        equipo[0] = new Futbolista("555", "Zidane", 45, 100);
        equipo[1] = new Futbolista("111", "Messi", 36, 800);
        equipo[2] = new Futbolista("444", "Pele", 80, 1000);
        equipo[3] = new Futbolista("222", "Cristiano", 39, 850);
        equipo[4] = new Futbolista("333", "Iniesta", 38, 150);

        // Los ordenamos
        Arrays.sort(equipo);
        System.out.println("Ordenados por su número de DNI");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Posición " + i + ": " + equipo[i]);
        } // Fin for

        // Ordenamos por su nombre
        Arrays.sort(equipo, new CompararNombre());
        System.out.println("Ordenamos por su nombre");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Posición " + i + ": " + equipo[i]);
        } // Fin for

        // Ahora ordenamos por edad
        Arrays.sort(equipo, new CompararEdad());
        System.out.println("Ordenamos por edad");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Posición " + i + ": " + equipo[i]);
        } // Fin for
    } // Fin psvm
} // Fin clase
