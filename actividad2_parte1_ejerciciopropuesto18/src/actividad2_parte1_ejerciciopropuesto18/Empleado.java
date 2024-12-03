/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto18;

/**
 *
 * @author santi
 */
public class Empleado {
    int codigo_empleado;
    String nombre_empleado;
    double numero_horas_trabajadas_mes;
    double valor_hora_trabajada;
    int retencion;
    double porcentaje_retencion;
    double salario_bruto;
    double salario_neto;      

    public static double calcular_porcentaje_retencion(double retencion) {
        return retencion/100;
    }
    
    public static double calcular_salario_bruto(double numero_horas_trabajadas_mes, double valor_hora_trabajada) {
        return numero_horas_trabajadas_mes*valor_hora_trabajada;
    }
    
    public static double calcular_salario_neto(double salario_bruto, double porcentaje_retencion) {
        return salario_bruto - salario_bruto * porcentaje_retencion;
    }
    
}
