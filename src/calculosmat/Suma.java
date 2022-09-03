/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosmat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Suma {
    public static void Resum (){
        Scanner objeto=new Scanner(System.in);
        
        double num1,num2,resultado;
        
        System.out.println("Ingrese el primer sumando");
        num1=objeto.nextDouble();
        System.out.println("Ingrese el segundo sumando");
        num2=objeto.nextDouble();
        resultado = num1 + num2;
        
        System.out.println("La suma es: "+resultado);
    }
}
