/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto18;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejerciciopropuesto18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario_bruto;
        double salario_neto;
        double porcentaje_retencion;
                
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese codigo del empleado");
        int codigo_empleado=entrada.nextInt();

        System.out.println("Ingrese nombre del empleado");
        String nombre_empleado=entrada.next();

        System.out.println("Ingrese valor de retencion");
        double retencion=entrada.nextDouble();
        
        System.out.println("Ingrese las horas tabajadas mes");
        double numero_horas_trabajadas_mes=entrada.nextDouble();
        
        System.out.println("Ingrese valor de hora trabajada retencion");
        double valor_hora_trabajada=entrada.nextDouble();
        
        porcentaje_retencion=Empleado.calcular_porcentaje_retencion(retencion);
        salario_bruto=Empleado.calcular_salario_bruto(numero_horas_trabajadas_mes, valor_hora_trabajada);
        salario_neto=Empleado.calcular_salario_neto(salario_bruto, porcentaje_retencion);

        System.out.println("codigo"+codigo_empleado);
        System.out.println("nombre"+nombre_empleado);
        System.out.println("salario neto"+salario_neto);
        System.out.println("salario bruto"+salario_bruto);
    }
    
}
