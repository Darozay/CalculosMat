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
public class Recursividad {
    public int Factorial (int Parametro){
        if (Parametro > 0){
            int valor_calculado = Parametro * Factorial( Parametro-1);
            return valor_calculado;
                    
        }
        return 1;
    }

    int Factorial(Scanner numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
