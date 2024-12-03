package ejercicio12;

import java.util.Scanner;

public class POO72 {
    public static void main(String[] args) {
        // Ejercicio 12
        String nombre;
        double nht, vhn, salario;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
        
        System.out.println("Ingrese el número de horas trabajadas");
        nht=teclado.nextDouble();
        
        System.out.println("Ingrese el valor de las horas trabajadas");
        vhn=teclado.nextDouble();
        
        salario = Empleado.obtener_salario(nht, vhn);
        
        System.out.println("El trabajador: "+nombre+" devengo $"+salario);
        
    }
    
}
