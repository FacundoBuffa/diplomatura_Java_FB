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
public class pyPrimerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    int dato;
    int cuadrado;
    Scanner entrada = new Scanner (System.in);
    // Entrada de datos
    System.out.println("Ingrese un numero entero");
    dato = entrada.nextInt();
    // Proceso
    cuadrado = dato*dato;
    // Salida
    System.out.println("El cuadrado del numero es: " + cuadrado);
    
    }
}
