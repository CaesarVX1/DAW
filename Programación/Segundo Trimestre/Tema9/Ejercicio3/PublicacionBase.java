/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public abstract class PublicacionBase implements Publicacion {
    //Atributos
    protected Usuario autor;
    protected static int totalPublicaciones = 0;
    
    // Constructor
    public PublicacionBase(Usuario autor) {
        this.autor = autor;
        totalPublicaciones++; // Al crear un post que incremente en 1
    } // Fin constructor
    
    @Override
    public String obtenerAutor() {return autor.getNombre();}
    
    // Devolvemos el total de publicaciones creadas
    public static int getTotalPublicaciones() {return totalPublicaciones;}
    
    // Creamos el método abstracto
    public abstract void editarPublicacion(String nuevoContenido);
}
