/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        String cadena = "";
        int fila;
        int columna;
        
        for (fila = 0; fila < estudiantes.length; fila++) {
            for(columna = 0; columna < estudiantes[fila].length; columna++) {
                if (estudiantes[fila][columna].length() == 11) {
                    cadena = String.format("%s%s\n", 
                            cadena,
                            estudiantes[fila][columna]);
                }
            }
        }
        System.out.printf("Estudiantes con 11 caracteres:\n%s\n", cadena);
    }
}
