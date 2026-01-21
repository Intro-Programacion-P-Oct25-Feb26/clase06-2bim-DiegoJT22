/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author daigo
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio {

    public static void main(String[] args) {

        int valor1 = ingreseValor();
        int valor2 = ingreseValor();
        int suma = obtenerSuma(valor1, valor2);
        imprimir(suma);
    }

    public static int ingreseValor() {

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int valor = 0;

        while (bandera) {
            try {
                System.out.println("Ingrese valor :");
                valor = entrada.nextInt();

                if (valor % 2 == 1 || valor < 0) {
                    throw new Exception("Error: solo números pares y positivos");
                }

                bandera = false;

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero");
                entrada.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return valor;
    }

    public static void imprimir(int resultado) {
        System.out.printf("Resultado %d\n", resultado);
    }

    public static int obtenerSuma(int a, int b) {
        return a + b;
    }
}
