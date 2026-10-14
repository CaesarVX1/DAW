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
public class CompararEdad implements Comparator<Futbolista> {
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        //Restamos las edades
        // Si f1 = Mayor → Positivo
        // Si f2 = Mayor → Negativo
        // Si son iguales da 0
        return f1.edad-f2.edad;
    } // Fin Compare
}
