/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosmat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

/**
 *
 * @author Lenovo
 */
public class proyectil {
    
      public static void PROY () throws IOException{
          int Velocidad, angulo;
          float altura;
          BufferedReader ingreso = new BufferedReader (new InputStreamReader(System.in));
          
          System.out.println("Digite Velocidad inicial: ");
          Velocidad=Integer.parseInt(ingreso.readLine());
          System.out.println("Digite angulo incial: ");
          angulo=Integer.parseInt(ingreso.readLine());
          
          altura = (float) (pow(Velocidad,2)*pow(sin(angulo),2)/(2*9.8));
                    
          System.out.println("La altura maxima del proyectil es: "+altura);
          
      }
}
