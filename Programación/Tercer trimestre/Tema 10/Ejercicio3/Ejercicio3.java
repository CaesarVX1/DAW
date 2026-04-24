/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10programaciontarea.Ejercicio3;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        FileReader f1 = null;
        FileReader f2 = null;
        
        int numLinea = 1;
        int numCaracter = 1;
        boolean sonIguales = true;
        
        try {
            // Abrirmos los 2 archivos
            f1 = new FileReader("texto1.txt");
            f2 = new FileReader("texto2.txt");
            
            // Leer el primer caracter de cada texto
            int c1 = f1.read();
            int c2 = f2.read();
            
            while(c1 != -1 || c2 != -1) {
                if(c1 != c2) {
                    sonIguales = false;
                    System.out.println("Los archivos son distintos"
                            + "La diferencia está en la línea: " + numLinea + ", caracter" + numCaracter);
                    // No se me ocurre otra forma de salir de aquí así que uso break
                    // Aunque digas que es una malapraxis
                    break;
                } // Fin if
                
                // Miramos si es un salto de línea
                if((char) c1 == '\n') {
                    numLinea++;
                    numCaracter++;
                } else {
                    numCaracter++;
                } // Fin ifelse
                
                c1 = f1.read();
                c2 = f2.read();
            } // Fin while
        } catch(IOException ex) {
            System.out.println("Error es: " + ex.getMessage());
        } finally {
            try {
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar: " + ex.getMessage());
            } // Fin catch
        } // Fin finally
    } // Fin main
}
