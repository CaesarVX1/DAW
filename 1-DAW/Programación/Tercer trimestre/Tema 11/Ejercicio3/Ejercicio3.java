/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11programaciontarea.Ejercicio3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firmas = new String[0];
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("firmas.dat"))) {
            firmas = (String[]) in.readObject();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } // Fin del chat
        
        System.out.println("Escribe 1 para ver las firmas y 2 para firmar");
        int opcion = sc.nextInt();
        sc.nextInt();
        
        if(opcion==1) {
            System.out.println(Arrays.toString(firmas));
        } else if(opcion==2) {
            System.out.println("Introducee tu nombre para firmar");
            String nombre = sc.nextLine();
            
            boolean repetido = false;
            // Ahora vamos a comprobar si está repetido
            for(String f : firmas) {
                if(f.equalsIgnoreCase(nombre)) {
                    repetido = true;
                    break;
                    // Sé que no te gusta que usemos break, pero es que no se me ocurre
                    // Otra forma de hacerlo ahora mismo
                } // Fin ifelse
            } // Fin for
            if(!repetido) {
                firmas = Arrays.copyOf(firmas, firmas.length +1);
                firmas[firmas.length-1] = nombre;
                
                // Ahora para guardar el nombre:
                try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("firmas.dat"))) {
                    out.writeObject(firmas);
                } catch(IOException e) {
                    System.out.println("Error: " + e.getMessage());
                } // Fin catch
            } else {
                System.out.println("Ya has firmado antes, o el nombre ya está repetido");
            } // Fin if
        }
        
    } // Fin main
} // Fin ej3
