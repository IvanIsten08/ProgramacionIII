/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8_2;

import java.util.Scanner;

import static trabajoPractico8_2.verificacionDeEdad.verificacion;

/**
 *
 * @author ivanl
 */
public class trabajoPractico8_2 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido! Por favor ingrese su edad: ");
        int edad = entrada.nextInt();
        
        try{
            verificacion(edad);
        }
        catch(YearException e){
            System.out.println(e.getMessage());
        }
    }
    
}
