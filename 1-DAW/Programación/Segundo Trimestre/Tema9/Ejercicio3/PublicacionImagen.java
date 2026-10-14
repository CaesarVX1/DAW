/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class PublicacionImagen extends PublicacionBase implements PublicacionConMultimedia {
    protected String urlDeImagen;

    // Constructor
    public PublicacionImagen(String urlDeImagen, Usuario autor) {
        super(autor);
        this.urlDeImagen = urlDeImagen;
    } // Fin constructor
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Imagen | Autor: " + obtenerAutor());
    } // Fin mostrar detalles
    
    @Override
    public void mostrarMultimedia() {
        System.out.println("Cargando URL imagen →  " + urlDeImagen);
    } // Fin mostrarMultimedia
    
    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.urlDeImagen = nuevoContenido;
    } // Fin editarPublicacion
}
