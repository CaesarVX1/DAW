/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea12Ejercicios.Ejercicio1;
import java.sql.*;
/**
 *
 * @author Cesar Valverde Pardo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Conexión a la base de datos
            String url = "jdbc:mysql://localhost/Empresa";
            String user = "root";
            String password ="";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            // Creamos la sentencia para ejecutar los SQL
            Statement sentencia = con.createStatement();
            
            // Botenemos todos los empleados
            String sql = "SELECT * FROM Empleados";
            ResultSet rs = sentencia.executeQuery(sql);
            
            System.out.println("↓ Listado de todos los empleados ↓");
            
            int contador = 0;
            while(rs.next()) {
                
                
                // Cojo los datos de los empleados
                int numeroEmpleado = rs.getInt("numemp");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                int oficina = rs.getInt("oficina");
                String puesto = rs.getString("puesto");
                Date contrato = rs.getDate("contrato");
                contador++;
                
                System.out.println("Datos del empleado: " + contador);
                System.out.println("Numero: " + numeroEmpleado);
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Oficina: " + oficina);
                System.out.println("Puesto: " + puesto);
                System.out.println("Contrato: " + contrato);
                // Pongo esto para "espaciarlos"
                System.out.println(" ");
                
            } // Fin while
            // Cerramos la conexión
            con.close();
            
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
