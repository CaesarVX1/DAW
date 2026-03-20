/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class MainEj3 {
    public static void main(String[] args) {
        // Creamos el usuario
        Usuario u1 = new Usuario("Cesar");
        
        // Hacemos 3 tipos de publicaciones
        Publicacion p1 = new PublicacionTexto(u1, "Hola");
        Publicacion p2 = new PublicacionImagen("https://googlephotos.com/foto1.jpg", u1);
        Publicacion p3 = new PublicacionVideo("video.com/videoASD.mp4", 0, 0, u1);
        
        //Creamos el array de 3 y metemos los que ya tenemos
        Publicacion [] Posts = {p1, p2, p3};
        
        //Los metemos dentro de usuario
        for(int i = 0; i<Posts.length;i++) {
            u1.agregarPublicacion(Posts[i]);
        } // Fin for
        
        // Mostrarmos todos los posts de usuario
        System.out.println("Posts de: " + u1.getNombre());
        u1.mostrarPublicaciones();
        
        // Cómo texto no tiene mostrarMultimedia pero los otros 2 sí
        // Hago esto para que se muestre
        ((PublicacionConMultimedia) p2).mostrarMultimedia();
        ((PublicacionConMultimedia) p3).mostrarMultimedia();
        
        
    }
}
