/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_3;

import tarabajopractico8.YearException;

/**
 *
 * @author ivanl
 */
public class calcular_Propina {
    
    public static void calcular(float propina, float propina_min) throws YearException{
        if(propina < propina_min){
            throw new YearException("Por favor no sea tan miserable y proporcione una propina mayor a $" + propina_min + ".");
        }else{
            System.out.println("Muchas gracias, espero haya disfrutado su consumicion");
        }
    }
}
