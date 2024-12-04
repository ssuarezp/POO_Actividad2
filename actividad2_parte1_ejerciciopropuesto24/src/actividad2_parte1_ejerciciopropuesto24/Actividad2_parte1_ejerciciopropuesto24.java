/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto24;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejerciciopropuesto24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c, solucion1, solucion2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese peso de esfera a");
        a = teclado.nextDouble();
        
        System.out.println("Ingrese perso de esfera b");
        b = teclado.nextDouble();
        
        System.out.println("Ingrese peso de esfera c");
        c = teclado.nextDouble();
        
        if ((a>b)&&(a>c)){
            System.out.println("La esfera a es la de mayor peso");
        }
        else if ((b>a)&&(b>c)){
            System.out.println("La esfera b es la de mayor peso");
        }
        
        else{
            System.out.println("La esfera c es la de mayor peso");
        }
        
    }
    
}
