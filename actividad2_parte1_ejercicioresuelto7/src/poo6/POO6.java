//CLASE 6 14/11/2024 - PROGRAMACIÓN CON CONDICIONALES: https://drive.google.com/file/d/1aRHBd60Y2QC9LORcsb-my8HlitTNculL/view
package poo6;
import java.util.Scanner;
public class POO6 {
    public static void main(String[] args) {
        //Ejercicio 7
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese a");
        double a=entrada.nextDouble();
        System.out.println("Ingrese b");
        double b=entrada.nextDouble();
        
        if (a>b){
            System.out.println(a+" es mayor que b "+b);
        }
        else if (b==a){
            System.out.println(a+" es igual que "+b);
        }
        else {
            System.out.println(a+" es menor que "+b);
        }       
    }
}
