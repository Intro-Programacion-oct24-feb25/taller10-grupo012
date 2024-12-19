/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double [] promedio = new double[3];
        int fila;
        int columna;
        double suma = 0;
        
        for (fila = 0; fila < notas.length; fila++) {
            for (columna = 0; columna < 4; columna++) {
                suma = suma + notas[fila][columna];
            }
            promedio[fila] = suma / 4;
        }
        for (fila = 0; fila < notas.length; fila++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    estudiantes[fila],
                    promedio[fila]);
        }
    }

}
