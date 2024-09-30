/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_2;


/**
 *
 * @author ivanl
 */
public class verificacionDeEdad {
    
    public static void verificacion(int edad) throws YearException{
        if(edad < 13){
            throw new YearException("Error, no tiene la edad suficiente para poder ingresar a este sitio. Por favor ingrese a un sitio mas adecuado para ud, le sugerimos el siguiente : https://www.youtube.com/watch?v=cd59qEZdAys&ab_channel=PeppaPigEspa%C3%B1olLatino-CanalOficial");
        }else{
            System.out.println("Bienvenido a nuestro sitio, espero sea de su agrado.");
        }
    }
    
}
