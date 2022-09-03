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
public class Primo {
     public static void Primo (){
         Scanner num=new Scanner (System.in);
         
         System.out.println("Ingrese un numero: ");
         int numero = num.nextInt();
         
         int suma = 0;
                 
         for(int i=1; i<=numero; i++){
             
             int auxiliar = numero%i;
             
             if (auxiliar ==0){
                 
                 suma = suma+1;
                 
                 
             }
             
         }
        if (suma <= 2){
            
            System.out.println("Tu numero es primo");
        }      
        else  {
            System.out.println("Tu numero No es primo");
        }
     }
}
