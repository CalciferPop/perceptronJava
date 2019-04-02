/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joseh
 */
public class RNA_Perceptron {

    double umbral_act = 1.5, coef_aprendizaje, w1, w2, error = 0, Yr = 0;
    int epocas, patrones;
    int[][] patrones_AND = {
        {1, 1, 1},
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 0}};
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.000");
    int cont = 0;

    public RNA_Perceptron() {

        m_proceso();
    }

    public void m_proceso() {
        System.out.println("Ingresa el numero de epocas para el entrenamiento");
        epocas = Integer.parseInt(teclado.next());

        System.out.println("1; Generacion de Pesos sinapticos aleatorios");
        w1 = new Random().nextDouble() / 2.5;
        w2 = new Random().nextDouble() / 2.5;
        System.out.println("w1: " + df.format(w1));
        System.out.println("w2: " + df.format(w2));
        System.out.println("Umbral Act : " + umbral_act);

        
            while (cont < patrones_AND.length) {
                Yr = (patrones_AND[cont][0] * w1) + (patrones_AND[cont][1] * w2) - umbral_act;
                System.out.println(
                        "Entrada : " + patrones_AND[cont][0] + " " + patrones_AND[cont][1] + " Salida Deseada (Yd): " + patrones_AND[cont][2]
                        + " Salida Real (Yr)  : " + Yr);

                if (Yr == patrones_AND[cont][2]) {
                    cont++;
                } else {
                    //Calcular el error Salida Deseada - Salida Real
                    error = (patrones_AND[cont][2] - Yr);
                    System.out.println("Error cometido: " + error);

                    //Modificacion de los pesos
                    w1 = w1 + (coef_aprendizaje * patrones_AND[cont][0] * error);
                    w2 = w2 + (coef_aprendizaje * patrones_AND[cont][1] * error);
                    umbral_act = umbral_act + (coef_aprendizaje * patrones_AND[cont][2] * error);

                    System.out.println("Pesos Modificados: " + cont);
                    System.out.println("w1(" + cont + "): " + w1);
                    System.out.println("w2(" + cont + "): " + w2);
                    System.out.println("w0(" + cont + "): " + umbral_act);
                    cont++;

                }

            }
        

        System.out.println("RESULTADOS DEL APRENDIZAJE:");

        System.out.println("w1: " + w1);
        System.out.println("w2: " + w2);
        System.out.println("Umbral : " + umbral_act);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Pruebas");
        System.out.println("Ingresa x1: ");
        double x1 = Double.parseDouble(teclado.next());
        System.out.println("Ingresa x2: ");
        double x2 = Double.parseDouble(teclado.next());
        System.out.println("---------------------------------------------");

        Yr = (x1 * w1) + (x2 * w2) - umbral_act;

        //Yr = (Yr >= umbral_act) ? 1 : 0;
        if (Yr >= 0) {
            Yr = 1;
        } else if (Yr < 0) {
            Yr = 0;
        }

        System.out.println("Salida: " + Math.abs((int) Yr));

    }

}
