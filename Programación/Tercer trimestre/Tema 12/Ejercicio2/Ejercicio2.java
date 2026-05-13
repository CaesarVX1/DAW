/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea12Ejercicios.Ejercicio2;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            // Conexión a la BD
            String url = "jdbc:mysql://localhost/Empresa";
            String user = "root";
            String password ="";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            // Creamos la sentencia para ejecutar los SQL
            Statement sentencia = con.createStatement();
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce la edad mínima");
            int edadMin = sc.nextInt();
            
            System.out.println("Introduce la edad máxima");
            int edadMax = sc.nextInt();
            
            //Consulta de SQL
            String sql = "SELECT nombre, edad "
                    + "FROM Empleados "
                    + "WHERE edad BETWEEN " + edadMin + " AND " + edadMax;
            
            ResultSet rs = sentencia.executeQuery(sql);
            
            System.out.println("Listando los empleados cuya edad está entre: " + edadMin + " y " + edadMax);
            
            while(rs.next()) {
                // obtenemos los datos
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                
                // Mostramos la información
                System.out.println("Empleado: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println(" "); // Para espaciar
            } // Fin while
            con.close();
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } // Fin catch
    } // Fin main
} // Fin clase
