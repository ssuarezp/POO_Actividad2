/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_parte1_ejercicioresuelto10;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Actividad2_parte1_ejercicioresuelto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio resuelto 10-pág 56
        System.out.println("Ejercicio resuelto 10");
        int ni, est;
        String nombre, apellido;
        double pat, pagmat;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero de incripcion");
        ni=entrada.nextInt();
        
        System.out.println("Ingrese nombre");
        nombre=entrada.next();
        
        System.out.println("Ingrese apellido");
        apellido=entrada.next();
        
        System.out.println("Ingrese patrimonio");
        pat=entrada.nextDouble();
        
        System.out.println("Ingrese el valor del estrato");
        est=entrada.nextInt();
        
        pagmat=Estudiante.obtener_pagmat(pat, est);
        
        System.out.println("El estudiante "+nombre+" "+apellido+" con numero de inscripcion "+ni+" debe pagar "+pagmat);
    }
}

