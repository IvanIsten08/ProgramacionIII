/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_3;

import java.util.Scanner;
import tarabajopractico8.YearException;
import static trabajoPractico8_3.calcular_Propina.calcular;

/**
 *
 * @author ivanl
 */
public class TrabajoPractico8_3 {

    
   public static void main(String[] args){
           Scanner entrada = new Scanner(System.in);
           float min = (float) 0.10;
           System.out.println("Gracias por su consumicion. Por favor ingrese el pago de su consumo: ");
           float consumicion = entrada.nextFloat();
           System.out.println("Por favor ingrese su propina: ");
           float propina = entrada.nextFloat();
           float propina_min = consumicion * min;
           
           try{
               calcular(propina, propina_min);
           }
           catch(YearException e){
               System.out.println(e.getMessage());
           }
       
   }
    
    
}
