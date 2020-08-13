/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author facub
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* dada una calificacion de una tiendea de aplicaciones
             mostrar la calificacion correspondiente segun:
             - 1 Regular
             - 2 muy buena
             - 3 Recomendable
             Si es otra, indicar valor no permitido
         */
        Scanner entrada = new Scanner(System.in);
        short calificacion;
        String valoracion;
        System.out.println("Ingrese un numero representativo a la calificación de la aplicación");
        calificacion = entrada.nextShort();

        switch (calificacion) {
            case 1: {
                valoracion = "Calificación Regular";
                break;
            }
            case 2: {
                valoracion = "Calificación Muy buena";
                break;
            }
            case 3: {
                valoracion = "Calificación Recomendable";
                break;
            }
            default: {
                valoracion = "Valor no permitido";
            }

        }
        System.out.println(valoracion);
    }
}
