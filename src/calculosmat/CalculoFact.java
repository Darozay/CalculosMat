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
public class CalculoFact {
    public static void ResultFact (){
     Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese numero para calcular factorial: ");
       int numero = entrada.nextInt();
        Recursividad recursividad =new Recursividad();
         int factorial = recursividad.Factorial(numero);
        System.out.println("El factorial es: "+factorial);
        
    }
}
