
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        //Declaro variables
        int anterior, num, cp, ci;
        boolean aviso0, avisoParImpar;
        Scanner entrada = new Scanner(System.in);
        //Inicializo variables
        anterior = 0;
        cp = 0;
        ci = 0;
        aviso0 = false;
        avisoParImpar = true;
        //Leo el primer número
        System.out.println("Ingrese un valor entero, finaliza con un  negativo");
        num = entrada.nextInt();
        while (num >= 0) {
            if (num != 0) {
                if (num % 2 == 0) {
                    cp = cp + 1;
                    if (anterior != 0 && anterior % 2 == 0) {
                        avisoParImpar = false;
                    }
                } else {
                    ci = ci + 1;
                    if (anterior != 0 && anterior % 2 != 0) {
                        avisoParImpar = false;
                    }
                }
            }
            if (num == 0) {
                aviso0 = true;
            }
            anterior = num;
            System.out.println("Ingrese un valor entero, finaliza con un  negativo");
            num = entrada.nextInt();
        }
        System.out.println("Por el bucle pasaron " + cp
                + " números pares y " + ci + " números impares");
        if (aviso0 == true) {
            System.out.println("Por el bucle pasó al menos un 0");
        } else {
            System.out.println("Por el bucle no pasó ningún 0");
        }
        if (avisoParImpar == true) {
            System.out.println("Pasó una secuencia par impar");
        }
    }
}
