/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11programaciontarea.Ejercicio4;

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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] lista = new Empleado[0]; 
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            lista =(Empleado[]) in.readObject();
        } catch(IOException e) {
            System.out.println("rError: " + e.getMessage());
        } catch(ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } // Fin catch
        
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Escribe 1 para Alta "
                    + "2 para baja"
                    + "3 para mostrar uno"
                    + "4 para listar a todos"
                    + "5 para salir.");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Sueldo: ");
                    double sueldo = sc.nextDouble();
                    
                    lista = Arrays.copyOf(lista, lista.length +1);
                    lista[lista.length-1] = new Empleado(dni, nombre, sueldo);
                    break;
                case 4:
                    for(Empleado e : lista) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
                        out.writeObject(lista); // Guardamos la lisat
                    } catch (IOException e) {
                        System.out.println("Error E/S: " + e.getMessage());
                    } // Fin catch
                    break;
            }
        }
    }
}
