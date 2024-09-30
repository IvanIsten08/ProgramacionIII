package tarabajopractico8;

import java.util.Scanner;


public class viajeTiempo {
 
    public static void viajar(int year) throws YearException{
        if(year < 1900 || year > 2100){
            throw new YearException("Error: el año " + year + " es un tiempo muy pasado y podria afectar los tiempos actuales ocasionando cambios que modificarian nuestro tiempo como lo conocemos ahora.");
        }else{
            System.out.println("Viajando al año " + year + ", recuerda tratar de no involucrarte mucho con los sucesos que vas a vivir porque podria afectar el presente, podrias impedir tu nacimiento.");
        }
}
    
}
