/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_5;

/**
 *
 * @author ivanl
 */
public class Cancion {
    public String artista;
    public String nombre_cancion;
    
    
    public Cancion(String artista, String nombre_cancion) {
        this.artista = artista;
        this.nombre_cancion = nombre_cancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return artista.equals(cancion.artista) && nombre_cancion.equals(cancion.nombre_cancion);
    }
    
    
}
