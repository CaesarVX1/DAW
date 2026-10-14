/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10programaciontarea.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio1Tema10 {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int contador = 0;
        
        try (Scanner s1 = new Scanner(new FileReader("lista1.txt"))) {
            while(s1.hasNextInt()) {
                if(contador == numeros.length) {
                    numeros = Arrays.copyOf(numeros, numeros.length+1);
                } // Fin if
                numeros[contador] = s1.nextInt();
                contador++;
            } // Fin while
        } catch(FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } // Fin catch
        
        try(Scanner s2 = new Scanner(new FileReader("lista2.txt"))) {
            while(s2.hasNextInt()) {
                if(contador == numeros.length) {
                    numeros = Arrays.copyOf(numeros, numeros.length + 1);
                }// Fin if
                numeros[contador] = s2.nextInt();
                contador++;
            } // Fin while
        } catch(FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } // Fin trycatch
        
        // Ordenamos el array
        Arrays.sort(numeros);
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter("listaOrdenada.txt"))) {
            for(int i = 0; i<numeros.length;i++) {
                out.write(String.valueOf(numeros[i]));
                out.newLine();
            } // Fin for
            System.out.println("Lista ordenada terminada");
        } catch(IOException e) {
            System.out.println("Error E/S: " + e.getMessage());
        } // Fin trychat
    } // Fin pvsm
}
