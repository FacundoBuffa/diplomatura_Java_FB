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
        /*{
        //Leer un número y determinar si es o no par
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = entrada.nextInt();
        if (num % 2 == 0)
            System.out.println("El número es PAR");
         else 
            System.out.println("El número es IMPAR");  
    }*/
        //Leer un número y determinar si es o no par siempre que sea positivo
        // Caso de no serlo mostrar un mensaje

        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = entrada.nextInt();
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("El número es PAR");
            } else {
                System.out.println("El número es IMPAR");
            }
        } else;
        System.out.println("El número es negativo");

    }

}
