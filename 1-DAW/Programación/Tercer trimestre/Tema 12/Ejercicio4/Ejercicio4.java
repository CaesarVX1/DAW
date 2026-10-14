/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea12Ejercicios.Ejercicio4;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            //Conexión a BD
            String url = "jdbc:mysql://localhost/Empresa";
            String user = "root";
            String password = "";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            Statement sentencia = con.createStatement();
            Scanner sc = new Scanner(System.in);
            
            // Pido los datos
            System.out.println("Introduce el número de la oficina");
            int oficina = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Introduce la nueva ciudad");
            String ciudad = sc.nextLine();
            
            System.out.println("Introduce el incremento de ventas");
            double sumaVentas = sc.nextDouble();
            
            //SQL
            String sql = "UPDATE Oficinas "
                    + "SET ciudad = '" + ciudad + "', "
                    + "ventas = ventas + " + sumaVentas + " "
                    + "WHERE oficina = " + oficina;
            
            int filasActualizadas = sentencia.executeUpdate(sql);
            
            System.out.println("Se han actualizado " + filasActualizadas + " filas");
            con.close();
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } // Fin catch
    } // Fin main
} // Fin ej4
