/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11programaciontarea.Ejercicio2;

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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] listadNombres = new String[0];
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("nombres.dat"))) {
            listadNombres = (String[]) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } // Fin cat
        
        System.out.println("Introduce nombre/s, escribe fin para parar");
        String nombreNuevo;
        
        while(!(nombreNuevo = sc.nextLine()).equalsIgnoreCase("fin")) {
            //Agrando el array para que sea dinámico
            listadNombres = Arrays.copyOf(listadNombres, listadNombres.length +1);
            // Asigno el nombre que da el usuario al slot (No sé cómo se dice en español ahora) correspondiente
            listadNombres[listadNombres.length-1] = nombreNuevo;
        } // Fin del while
        
        // Pide el ejercicio ordenar de forma albafetica
        Arrays.sort(listadNombres);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("nombres.dat"))) {
            out.writeObject(listadNombres);
            System.out.println("Lista guardada, mire el archivo");
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } // Fin catch
        
    } // Fin main
} // fin ej2
