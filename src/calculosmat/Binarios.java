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
public class Binarios {
    public static void DecBin (){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese decimales en forma entero: ");
        int input = leer.nextInt();
        int digito;
        String binario="";
        do{
            digito=input %2;
            binario+=digito;
            input=input/2;
  
        }
        while (input !=0);
        System.out.println("El binario del numero es: "+binario);
    }
}
