/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notasCuantitativas = {{7.1, 8, 10}, 
                                        {3, 7, 9}, 
                                        {10, 9, 2.1}};
        String[] nombresEstudiante = {"Jose A", "Elena J", "Paúl L"};
        double[] sumaNotas = new double[3];
        String[][] notasCualitativas = new String[3][3];
        double promedio;
                           
        double suma;
        String reporte = "";
        
        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j]; 
            }
            
            sumaNotas[i] = suma; 
            promedio = sumaNotas[i]/4;
            if (promedio >= 0 && promedio < 6){
                promedioNotasCualitativas[i] = "Bueno";
            } else {
                if (promedio >= 6 && promedio < 9) {
                    promedioNotasCualitativas[i] = "Muy Bueno";
                } else {
                    if (promedio >= 9 && promedio < 11){
                       promedioNotasCualitativas[i] = "Sobresaliente"; 
                    }
                }
            }
        }
        

        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene una sumataria "
                    + "de notas: %.3f\n y su promedio cualitativo es %s\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i],
                    promedioNotasCualitativas[i]);
        }
        
        System.out.printf("%s\n", reporte);
        
    }
}
