/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejerciciopropuesto19;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejerciciopropuesto19 {
    public static void main(String[] args) {
        double perimetro, altura, area;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");
        double lado=entrada.nextDouble();
        
        perimetro = Triangulo_Equilatero.obtener_permitetro(lado);
        area=Triangulo_Equilatero.obtener_area(lado);
        altura=Triangulo_Equilatero.obtener_altura(lado);
        
        System.out.println("perimetro:"+perimetro);
        System.out.println("area:"+area);
        System.out.println("altura:"+altura);
    } 
}
