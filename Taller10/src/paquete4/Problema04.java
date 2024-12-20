/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] datos = new double[2][2];
        double valor;
        int valores_fuera = 0;
        String cadena = "";

        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                System.out.printf("Ingrese el valor [%d][%d] para el arreglo\n",
                        fila,
                        columna);
                valor = entrada.nextDouble();
                datos[fila][columna] = valor;

                if (valor > 1000 && valor < 1199) {
                    datos[fila][columna] = valor;
                } else {
                    datos[fila][columna] = 10;
                    valores_fuera = valores_fuera + 1;
                }
            }
        }
        
        System.out.println("\nArreglo resultante:");
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                System.out.printf("[%d][%d] %.2f\t\n",
                        fila,
                        columna,
                        datos[fila][columna]);
            }
        }
        System.out.printf("\nCantidad de valores fuera de rango: %d\n",
                valores_fuera);
    }
}
