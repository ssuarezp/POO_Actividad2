/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author santi
 */
public class Valpag {
        public static double valor_a_pagar(double valcomp, String color){
            
        double valpag, pdes;
        
        if (color.equals("blanco")) {
            pdes = 0;
        }
        else if (color.equals("verde")){
            pdes=25; 
        }   
        else if (color.equals("azul")) {
            pdes=50;
        } 
        
        else {
            pdes=100;
        }   
        
        return valcomp - pdes * valcomp / 100;
    }
    
}
