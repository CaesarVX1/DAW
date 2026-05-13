/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea12Ejercicios.Ejercicio3;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            // Conexión a la BD
            String url = "jdbc:mysql://localhost/Empresa";
            String user = "root";
            String password ="";
            Connection con = DriverManager.getConnection(url,user,password);
            
            // SEntencia SQL
            Statement sentencia = con.createStatement();
            
            Scanner sc = new Scanner(System.in);
            
            // Pido los datos del empleado
            System.out.println("Introduce el número del empleado");
            int numEmpleado = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Introduce el nombre");
            String nombre = sc.nextLine();
            
            System.out.println("Introduce el edad");
            int edad = sc.nextInt();
          
            System.out.println("Introduce el oficina");
            int oficina = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Introduce el puesto");
            String puesto = sc.nextLine();
            
            // Consulta SQL
            String sql = "INSERT INTO Empleados Values(" + numEmpleado + ", '" + nombre + "', " + edad + ", " + oficina + ", '" + puesto + "', CURDATE())";
            
            // Ejecutamos el INSERT
            int filasInsertadas = sentencia.executeUpdate(sql);
            
            // Mostramos resultado
            System.out.println("Se han insertado: " + filasInsertadas + " filas");
            con.close();
            
            
            
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } // Fin catch
    }
}
