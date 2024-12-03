//CLASE 7 19/11/2024 - CONDICIONAL MÚLTIPLE: 
package ejercicio11;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       
        //Ejercicio 11-pág 57
        double n1,n2,n3,menor,mayor;
        
        System.out.println("Ingrese el valor numerico de n1");
        n1=teclado.nextInt();
        
        System.out.println("Ingrese el valor numerico de n2");
        n2=teclado.nextInt();
        
        System.out.println("Ingrese el valor numerico de n3");
        n3=teclado.nextInt();
        
        if ((n1>n2) && (n1>n3)){
            mayor=n1;
        }
        else if ((n2>n3)){
            mayor=n2;
        }
        else {
            mayor=n3;
        }
        System.out.println("El mayor entre: "+n1+", "+n2+" y "+n3+" es "+mayor);
    }
    
}
