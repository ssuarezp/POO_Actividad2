/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejercicioresuelto14;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejercicioresuelto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vd1, vd2, vd3, salar1, salar2, salar3;
        double salario_d1, salario_d2, salario_d3;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1:");
        vd1 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 1:");
        salario_d1 = teclado.nextDouble();        
        
        System.out.println("Ingrese las ventas del departamento 2:");
        vd2 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 2:");
        salario_d2 = teclado.nextDouble();        
        
        
        System.out.println("Ingrese las ventas del departamento 3:");
        vd3 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 3:");
        salario_d3 = teclado.nextDouble();  
        
        salar1 = Salario_VD1.salario_vd1(vd1, vd2, vd3, salario_d1);
        salar2 = Salario_VD2.salario_vd2(vd1, vd2, vd3, salario_d2);
        salar3 = Salario_VD3.salario_vd3(vd1, vd2, vd3, salario_d3);
        
        System.out.println("Salario vendedores departamento 1" + salar1);
        System.out.println("Salario vendedores departamento 2" + salar2);
        System.out.println("Salario vendedores departamento 3" + salar2);
        
    }
    
}
