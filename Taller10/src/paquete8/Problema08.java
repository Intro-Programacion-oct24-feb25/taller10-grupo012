/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Usuario iTC
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
         *  1    1    2
         *  6    8    1
         */
        double[][] dato3 = new double[2][3];
        int fila;
        int columna;
        
        for (fila = 0; fila < dato3.length; fila++) {
            for (columna = 0; columna < dato3[fila].length; columna++) {
                if (columna == 0 || (fila == 1 && columna == 1)) {
                    dato3[fila][columna] = dato1[fila][columna];
                } else {
                    dato3[fila][columna] = dato2[fila][columna];
                }
            }
        }

        System.out.println("Resultado:");

        for (fila = 0; fila < dato3.length; fila++) {
            for (columna = 0; columna < dato3[fila].length; columna++) {
                System.out.printf("%.0f\t", dato3[fila][columna]);
            }
            System.out.println();
        }

        for (fila = 0; fila < dato3.length; fila++) {
            for (columna = 0; columna < dato3[fila].length; columna++) {
                System.out.printf("La posicion[%d][%d] tiene un "
                        + "valor de: %.0f%n",
                        fila,
                        columna,
                        dato3[fila][columna]);
            }
        }
    }
}
