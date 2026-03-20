/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class PublicacionTexto extends PublicacionBase {
    // Atributo
    protected String contenido;

    public PublicacionTexto(Usuario autor, String contenido) {
        super(autor);
        this.contenido = contenido;
    } // Fin constructor

    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.contenido = nuevoContenido;
    } // Fin editarPublicacion

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Texto | Autor: " + obtenerAutor());
        System.out.println("Contenido: " + contenido);
    }
    
}
