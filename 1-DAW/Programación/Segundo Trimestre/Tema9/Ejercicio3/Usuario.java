/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9practica.cesarvalverdepardo.Ejercicio3;

/**
 *
 * @author Cesar Valverde Pardo
 */
public class Usuario {
    //ATributos
    protected String nombre;
    protected Publicacion[] publicaciones;
    protected int contadorPublicaciones;
   
    //Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new Publicacion[100];
        this.contadorPublicaciones = 0;
    } // Fin constructor
    
    // Que devuelva el nombre:
    public String getNombre() {return this.nombre;}
    
    // Que agregue una publicación al Array
    public void agregarPublicacion(Publicacion publicacion) {
        if(contadorPublicaciones<publicaciones.length) {
            publicaciones[contadorPublicaciones] = publicacion;
            contadorPublicaciones++;
        } // Fin if
    } // Fin agregarPublicacion
    
    // Mostrar las publicaciones hechas del usuario
    public void mostrarPublicaciones() {
        System.out.println("Publicacion de: " + this.nombre + ":");
        for(int i = 0; i<contadorPublicaciones;i++) {
            publicaciones[i].mostrarDetalles();
        } // Fin for
    } // Fin mostrarPublicaciones
    
} // Fin Usuario
