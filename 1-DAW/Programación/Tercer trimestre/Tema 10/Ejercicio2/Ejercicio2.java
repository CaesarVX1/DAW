package t10programaciontarea.Ejercicio2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Iniciamos el flujo y los contradores
        BufferedReader flujoEntrada = null;
        int numCaracteres = 0;
        int numLineas = 0;
        int numPalabras = 0;
        
        try {
            flujoEntrada = new BufferedReader(new FileReader("carta.txt")) ;
            
            String linea = flujoEntrada.readLine();
            
            while(linea != null) {
                // Contamos la linea leida
                numLineas++;
                
                // Contamos ahora los carácteres de la línea
                numCaracteres += linea.length();
                
                //Contamos las palabras
                // Aquí no sé si es lo mejor, pero he usado trim por si acaso
                // Es decir, no sé si quieres que cuente el espacio cómo un o no
                if(!linea.trim().isEmpty()) {
                    String[] palabrasEnLinea = linea.trim().split(" ");
                    numPalabras += palabrasEnLinea.length;
                } // Fin if
            } // Fin while
            System.out.println("--------------Contador----------------");
            System.out.println("Numero de carácteres: " + numCaracteres);
            System.out.println("Numero de líneas: " + numLineas);
            System.out.println("Numero de palabras: " + numPalabras);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(flujoEntrada != null) {
                try {
                    flujoEntrada.close();
                } catch(IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                } // Fin catch
            } // fin if
        } // Fin finjaly
    } // Fin main
} // Fin ej2
