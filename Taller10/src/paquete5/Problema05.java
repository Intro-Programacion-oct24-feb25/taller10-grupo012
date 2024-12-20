/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        // TODO code application logic here

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        String cadena = "";
        
        int fila;
        int columna;
        char primeraLetra;
        
        for (fila = 0; fila < estudiantes.length; fila++) {
            for (columna = 0; columna < estudiantes[fila].length; columna++) {
                primeraLetra = estudiantes[fila][columna].charAt(0);
                
                if (primeraLetra == 'S' || primeraLetra == 'P'
                        || primeraLetra == 'T') {
                    cadena = String.format("%s %s\n",
                            cadena,
                            estudiantes[fila][columna]);
                }
            }
        }
        System.out.printf("Estudiantes que comienzan con S, P o T:\n%s",
                cadena);
    }
}
