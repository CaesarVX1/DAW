/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10programaciontarea.Ejercicio4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 3) {
            System.out.println("Menú del registro del clima");
            System.out.println("1 - Registrar nueva temperatura");
            System.out.println("2 - Mostrar historial de registros");
            System.out.println("3 - Salir del programa");
            System.out.println("Elija la opción que desees");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion==1) {
                try (BufferedWriter out = new BufferedWriter(new FileWriter("clima.txt"))) {
                    System.out.println("Introduce la fecha (Anyo, mez, dia)");
                    String fecha = sc.nextLine();
                    System.out.println("Introduce la temperatura máxima");
                    int max = sc.nextInt();
                    System.out.println("Introduce la temperatura mínima");
                    int min = sc.nextInt();
                    
                    out.write(fecha + ", " + max + ", " + min);
                    out.newLine();
                    System.out.println("Datos guardados");
                } catch(IOException e) {
                    System.out.println("Error: " + e.getMessage());
                } // Fin catch
            } else if (opcion == 2) {
                File archivo = new File("clima.txt");
                
                if(!archivo.exists()) {
                    System.out.println("No hay registros");
                } else {
                    int maxAbsoluta = Integer.MIN_VALUE;
                    int minAbsoluta = Integer.MAX_VALUE;
                    
                    System.out.println(" historial de temperaturas ");
                    System.out.println(" Fecha - Máxima - Mínima");
                    
                    try(Scanner lector = new Scanner(archivo)) {
                        while(lector.hasNextLine()) {
                            String linea = lector.nextLine();
                            String [] datos = linea.split(", ");
                            
                            String fecha = datos[0];
                            int tMax = Integer.parseInt(datos[1]);
                            int tMin = Integer.parseInt(datos[2]);
                            
                            System.out.println(" | " + tMax + "|" + tMin);
                            
                            if(tMax > maxAbsoluta) maxAbsoluta = tMax;
                            if(tMin < minAbsoluta) minAbsoluta = tMin;
                        } // Fin while
                        System.out.println("Temperatura máxima total: " + maxAbsoluta);
                        System.out.println("Temperatura mínima total: " + minAbsoluta);
                    } catch (FileNotFoundException e) {
                        System.out.println("No encontré el archivo: " + e.getMessage());
                    } // Fin catch
                } // Fin ifesle   
            } else if (opcion == 3) {
                System.out.println("Cerrando...");
            } else {
                System.out.println("Opción no existente");
            } // Fin if else
        }
        sc.close();
    } // Fin main
} // Fin ejercicio
