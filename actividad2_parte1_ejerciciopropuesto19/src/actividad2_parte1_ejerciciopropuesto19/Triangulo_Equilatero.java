/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto19;

/**
 *
 * @author santi
 */
public class Triangulo_Equilatero {
    public static double obtener_permitetro(double lado){
        return 3*lado;
    }
    public static double obtener_altura(double lado){
        return (lado*Math.sqrt(3))/2;
    }
    public static double obtener_area(double lado){
        return (Math.pow(lado, 2)*Math.sqrt(3))/4;                
    }
}
