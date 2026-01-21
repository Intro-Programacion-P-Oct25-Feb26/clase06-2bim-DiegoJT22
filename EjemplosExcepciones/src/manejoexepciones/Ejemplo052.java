/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo052 {
    
    public static void main(String[] args) {
        int resultado = 0;
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:"); // 20
            int valor1 = entrada.nextInt(); // se espera un valor entero 
            System.out.println("Ingrese valor 2:"); // 4
            int valor2 = entrada.nextInt(); // se espera un valor entero // 0
            resultado = valor1 / valor2; // 5
            System.out.printf("Resultado %.2f\n", resultado);
        System.out.println("Continuamos");
        
            
        }
        catch (InputMismatchException inputMismatchException) {
            System.out.printf("Existe un error de tipo %s\n", 
                    inputMismatchException);
        }
        catch(ArithmeticException arithmeticException){
            
            System.out.println("Lo sentimos hay un error");
            System.out.printf("De tipo %s\n", arithmeticException);
        
        }
        
        
               
    }
}
