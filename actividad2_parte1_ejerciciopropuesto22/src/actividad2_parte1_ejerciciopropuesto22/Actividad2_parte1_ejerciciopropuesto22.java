/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto22;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejerciciopropuesto22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario_basico_hora, horas_trabajadas, salario_mensual;
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el salario básico por hora");
        salario_basico_hora = teclado.nextDouble();
        
        System.out.println("Ingrese el número de horas trabajadas");
        horas_trabajadas = teclado.nextDouble();
        
        System.out.println("Ingrese el nombre");
        nombre = teclado.next();
        
        salario_mensual = salario_basico_hora*horas_trabajadas;
        
        if (salario_mensual>450000){
            System.out.println("El empleado "+nombre+" tuvo un salario mensual de: $ "+salario_mensual);
        }
        else {
            System.out.println("El empleado "+nombre);
        }
        
    }
    
}
