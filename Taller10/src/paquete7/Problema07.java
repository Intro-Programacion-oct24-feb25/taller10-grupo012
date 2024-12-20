/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author Usuario iTC
 */
public class Problema07 {

    public static void main(String[] args) {

        double[][] dato1 = {{0, 2, 0}, {1, 0, 0}};
        // double [][] dato1 = {{0,0,0}, {0,0,0}};
        double sumatoria = 0;
        int fila;
        int columna;

        for (fila = 0; fila < dato1.length; fila++) {
            for (columna = 0; columna < dato1[fila].length; columna++) {

                sumatoria = sumatoria + dato1[fila][columna];
            }
        }
        
        if (sumatoria == 0) {
            System.out.printf("\nEl arreglo es NULO(La suma de "
                    + "sus valores es %.2f)\n", sumatoria);
        } else {
            System.out.printf("\nEl arreglo NO es NULO (La suma de sus "
                    + "valores es %.2f)\n", sumatoria);
        }
    }
}
