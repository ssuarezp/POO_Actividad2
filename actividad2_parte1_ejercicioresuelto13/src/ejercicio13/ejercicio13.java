package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //Ejercicio 13 - página  60
        String color;
        double valcomp, valpag;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra");
        valcomp=teclado.nextDouble();
        
        System.out.println("Ingrese el color");
        color=teclado.next();
        
        valpag = Valpag.valor_a_pagar(valcomp, color);
        
        System.out.println("El cliente debe pagar "+valpag);
        
    }
    
}
