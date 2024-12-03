//Ejercicio 21
package poo5.pkg3;
import java.util.Scanner;
public class POO53 {
    public static void main(String[] args) {
        double p,s;
        double a;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el valor del lado a");
        double la=entrada.nextDouble();
        System.out.println("Ingrese el valor del lado b");
        double lb=entrada.nextDouble();
        System.out.println("Ingrese el valor del lado c");
        double lc=entrada.nextDouble();
        
        p=Triangulo.obtener_perimetro(la, lb, lc);
        s=Triangulo.obtener_semiperimetro(p);
        a=Triangulo.obtener_area(s, la, lb, lc);
        
        System.out.println("perimetro:"+p);
        System.out.println("semiperimetro:"+s);
        System.out.println("area:"+a);
    }
    
}
