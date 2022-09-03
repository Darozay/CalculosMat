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
public class Denominador {
    private final Scanner scanner;
    public Denominador(){
        scanner = new Scanner(System.in);
    }
    public int catchValidadivisor(){
        int output = 0;
        do{
            System.out.println("Indique el tiempo: ");
            output = scanner.nextInt();
            if(output==0){
                System.out.println("El tiempo no puede ser cero");
            }
            
        }while(output==0);
        return output;
        
    }
    
}
