/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosmat;

import static calculosmat.Aleatorio.NumAlet;
import static calculosmat.Suma.Resum;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AleaSuma {
    @SuppressWarnings("empty-statement")
    public static void submenu (){
       Scanner S=new Scanner(System.in);
        int a;
        boolean Salir = false;
        
        while(!Salir){
            System.out.println("1. Numero Aleatorio");
            System.out.println("2. Suma 2 Numeros");
            System.out.println("3. Salir");
            a = S.nextInt();
               
       
        switch(a){
            case 1:
                System.out.println("Numero Aleatorio");
                NumAlet();
                break;
            case 2:
                System.out.println("Suma dos numeros");
                Resum();
                break;
            case 3:
                Salir= true;
                break;
            
            default:
                    System.out.println("Las opciones son de 1 a 3");    
        }
     
    }
     }   
 }