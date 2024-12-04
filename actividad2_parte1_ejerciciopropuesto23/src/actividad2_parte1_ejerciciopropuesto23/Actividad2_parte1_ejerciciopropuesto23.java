/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto23;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejerciciopropuesto23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c, solucion1, solucion2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese a");
        a = teclado.nextDouble();
        
        System.out.println("Ingrese b");
        b = teclado.nextDouble();
        
        System.out.println("Ingrese c");
        c = teclado.nextDouble();
        
        solucion1 = Soluciones.calcular_solucion1(a, b, c);
        solucion2 = Soluciones.calcular_solucion2(a, b, c);
        
        System.out.println("La posible solucion 1 es: "+solucion1+" y la posible solucion 2 es: "+solucion2);
        
    }
    
}
