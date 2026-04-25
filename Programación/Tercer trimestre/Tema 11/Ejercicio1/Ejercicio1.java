/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11programaciontarea.Ejercicio1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"));
            ObjectOutputStream outPares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            ObjectOutputStream outImpares = new ObjectOutputStream(new FileOutputStream("impares.dat"))) {
            
            // Hago un bucle hasta el final del fichero
            while(true) {
                int n = in.readInt();
                if(n%2 == 0) {
                    outPares.writeInt(n);
                } else {
                    outImpares.writeInt(n);
                } // Fin if else
            } // Fin whilñe
        } catch(EOFException e) {
            System.out.println("Terminado");
        } catch(IOException ex) {
            System.out.println("Error de E/S: " + ex.getMessage());
        } // Fin catch
    } // Fin main
} // Finjejercicio
