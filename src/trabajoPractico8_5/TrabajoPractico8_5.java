/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_5;

import java.util.Scanner;
import trabajoPractico8_5.PlayList;
/**
 *
 * @author ivanl
 */
public class TrabajoPractico8_5 {
    
   public static void main(String[] args) {
       PlayList playList = new PlayList();
       Scanner entrada = new Scanner(System.in);
       playList.agregarCancion(new Cancion("Michael Jackson", "Billie Jean"));
       playList.agregarCancion(new Cancion("Bon Jovi", "Livin´on a Prayer"));
       playList.agregarCancion(new Cancion("Queen", "Bohemian Rhapsody"));
       playList.agregarCancion(new Cancion("Whitney Houston", "I wanna dance with somebody"));
       playList.agregarCancion(new Cancion("Guns N´Roses", "Knockin' On Heaven's Door"));
       playList.agregarCancion(new Cancion("Europe", "Open your Heart"));
       playList.agregarCancion(new Cancion("Iron Maiden", "The Trooper"));
       boolean continuar = true;
       
       while(continuar){
         try{
           
           System.out.println("Ingrese el nombre de la banda: ");
           String banda = entrada.nextLine();
           System.out.println("Ingrese el nombre de la cancion: ");
           String nombre = entrada.nextLine();
           
           Cancion newCancion = new Cancion(banda, nombre);
           playList.agregarNewCancion(newCancion);
             
           }
         catch(CancionException e){
           System.out.println(e.getMessage());
         }
            System.out.print("\n¿Desea agregar otra canción? (s/n): ");
            String continuarRespuesta = entrada.nextLine();
            if (!continuarRespuesta.equalsIgnoreCase("s")) {
                continuar = false;
       }
    }
  }      
}
