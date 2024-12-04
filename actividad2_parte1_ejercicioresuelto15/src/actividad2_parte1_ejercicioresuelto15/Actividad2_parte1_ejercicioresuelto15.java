/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejercicioresuelto15;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejercicioresuelto15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double pesoa, pesob, pesoc, pesod;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera a");
        pesoa = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera b");
        pesob = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera c");
        pesoc = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera d");
        pesod = teclado.nextDouble();
        
        if ((pesoa==pesob)&&(pesoa==pesoc)){
        }            
            else if(pesod > pesoa){
                System.out.println("La esfera a es la diferente");
            }
            else{
                System.out.println("La esfera d es la diferente");
            }
        
        if ((pesoa==pesob)&&(pesoa==pesod)){
            System.out.println("La esfera c es la diferente");
        }            
            else if(pesod > pesoa){
                System.out.println("y es de mayor peso");
                
            }
            else{
                System.out.println("y es de menor peso");
            }
        
        if ((pesoa==pesoc)&&(pesoa==pesod)){
            System.out.println("La esfera b es la diferente");
        }            
            else if(pesob > pesod){
                System.out.println("y es de mayor peso");
                
            }
            else{
                System.out.println("y es de menor peso");
            }
        
        if(pesoa > pesob){
                System.out.println("y es de mayor peso");
                
            }
            else{
                System.out.println("y es de menor peso");
            }
        
    }
    
}
