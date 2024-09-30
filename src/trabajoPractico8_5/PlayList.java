/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_5;

import java.util.ArrayList;

/**
 *
 * @author ivanl
 */
public class PlayList {
    
    public ArrayList<Cancion> canciones = new ArrayList<>();

    
    public PlayList() {
    }

    public PlayList(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }
    

    public void agregarNewCancion(Cancion newCancion) throws CancionException {
        if (canciones.contains(newCancion)) {
            throw new CancionException("Error: La canción ya existe en la playlist.");
        } else {
            canciones.add(newCancion);
            System.out.println("Canción agregada a la playlist.");
        }
    }
    
    public Cancion getCancionPorNombre(String nombre){
        for(Cancion cancion: canciones){
            if(cancion.getNombre_cancion().equals(nombre)){
                return cancion;
            }
        }
        return null;
    }
}
