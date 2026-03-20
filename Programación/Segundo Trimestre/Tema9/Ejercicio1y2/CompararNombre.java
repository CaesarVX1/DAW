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
public class CompararNombre implements Comparator<Futbolista>{
    
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        // Esto puede devolver un número negativo, un 0 o un positivo
        return f1.nombre.compareTo(f2.nombre);
    } // Fin compare
    
    
    
}
