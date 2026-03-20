/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class PublicacionVideo extends PublicacionBase implements PublicacionConMultimedia, PublicacionInteractiva {
    // Atributos
    protected String urlVideo;
    protected int reproducciones, likes;

    // Cosntructor
    public PublicacionVideo(String urlVideo, int reproducciones, int likes, Usuario autor) {
        super(autor);
        this.urlVideo = urlVideo;
        this.reproducciones = reproducciones;
        this.likes = likes;
    } // Fin COnstructor
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Vídeo | Autor: " + obtenerAutor());
        System.out.println("Likes: " + likes + " | Reproducciones: " + reproducciones);
    } // Fin mostrarDetalles
    
    @Override
    public void mostrarMultimedia() {
        System.out.println("Reproduciendo vídeo de la url: " + urlVideo);
    } // Fin mostrarMultimedia
    
    @Override
    public void reaccionar(String reaccion) {
        if(reaccion.equalsIgnoreCase("like")) {
            this.likes++;
            System.out.println( obtenerAutor() + "Recibió un like");
        } // Fin if
    } // Fin reaccionar
    
    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.urlVideo = nuevoContenido;
    } // Fin editarPublicacion
}
