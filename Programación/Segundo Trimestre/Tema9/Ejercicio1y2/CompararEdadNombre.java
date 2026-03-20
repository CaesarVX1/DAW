/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio1y2;
import java.util.Comparator;
/**
 *
 * @author Cesar Valverde Pardo
 */
public class CompararEdadNombre implements Comparator<Futbolista> {
    
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        // Primero comparamos por la edad
        int resultado = f1.edad - f2.edad;
        
        // Si da 0, tienen la misma edad
        if(resultado == 0) {
            // Si tienen la misma edad, comparamos sus nombres
            resultado = f1.nombre.compareTo(f2.nombre);
        } // Fin if
        
        return resultado;
    } // Fin compare
}
