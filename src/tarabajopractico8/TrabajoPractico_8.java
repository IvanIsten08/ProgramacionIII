/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarabajopractico8;

import java.util.Scanner;
import static tarabajopractico8.viajeTiempo.viajar;

/**
 *
 * @author ivanl
 */
public class TrabajoPractico_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año al que desea viajar: ");
        int year = scanner.nextInt();    
        try{    
        viajar(year);
        }
        catch(YearException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
