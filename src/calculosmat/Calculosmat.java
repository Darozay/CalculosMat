/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculosmat;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Calculosmat{
    
    /**
     *
     */
    public static void MRU (){
        Scanner distancia = new Scanner(System.in);
        Denominador tiempo = new Denominador();
        System.out.println("Indique la distancia: ");
        float d = distancia.nextFloat();
        int t = tiempo.catchValidadivisor();
        
       
            try {
                float v = d/t;
                System.out.printf("La Velocidad es %.4f%n",v);
                                
            }
            
            finally {
                System.out.println("FIN");
            }
        }
        
        // TODO code application logic here

    
    }
    

