/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String [] vendedores = {"Jessica Cole", "Robert Wallace"};
        double [][] ventas = new double[2][5];
        int fila;
        int columna;
        double valor;
        double total = 0;
        
        for (fila = 0; fila < ventas.length; fila++) {
            for (columna = 0; columna < ventas[fila].length; columna++) {
                System.out.println("Ingrese las ventas del dia " + columna);
                valor = entrada.nextDouble();
                ventas[fila][columna] = valor;
                total = total + ventas[fila][columna];
            }
        }
        System.out.println();
        for (fila = 0; fila < ventas.length; fila++){
            System.out.printf("Vendedor(a) %s\n", vendedores[fila]);
        }
        System.out.printf("Ha realizado un total de %.2f en ventas", total);
    }
}
