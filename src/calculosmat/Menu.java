/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosmat;


import static calculosmat.AleaSuma.submenu;
import static calculosmat.Binarios.DecBin;
import static calculosmat.CalculoFact.ResultFact;
import static calculosmat.Calculosmat.MRU;
import static calculosmat.Primo.Primo;
import static calculosmat.proyectil.PROY;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Lenovo
 */
@SuppressWarnings("InitializerMayBeStatic")
public class Menu {
    
    public static void main(String[] args) throws IOException {
        Scanner scan =new Scanner(System.in);
        
        boolean Salir = false;
        int opcion;
        
                       
        while(!Salir){
            System.out.println("operaciones Matematicas");
            System.out.println("1. Calculo MRU");
            System.out.println("2. Trayectoria Proyectil");
            System.out.println("3. Numero es Primo");
            System.out.println("4. Factorial Numero");
            System.out.println("5. Numero Aleatorio y Suma 2 Numeros");
            System.out.println("6. Decimales a Binarios");
            System.out.println("7. Salir");
            
            System.out.println("Seleccione opcion");
            opcion = scan.nextInt();
            switch (opcion){
                case 1: 
                    System.out.println("Calculo MRU");
                    MRU ();
                    break;
                case 2:
                    System.out.println("Trayectoria Proyectil");
                    PROY();
                    break;
                    
                case 3:
                    System.out.println("Numero es Primo");
                    Primo();
                    break;
                
                case 4:
                    System.out.println("Factorial Numero");
                    ResultFact();
                    break;
                    
                case 5:
                    System.out.println("Numero Aleatorio y Suma 2 Numeros");
                    submenu();
                    break;    
                    
                case 6:
                    System.out.println("Decimales a Binarios");
                    DecBin();
                    break;        
                    
                case 7:
                    Salir=true;
                    break;
                    
                default:
                    System.out.println("Las opciones son entre 1 y 6");

            }
            
                    
        }
 }

  

}

     

    


       
