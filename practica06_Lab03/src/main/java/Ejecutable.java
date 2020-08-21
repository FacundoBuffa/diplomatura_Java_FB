
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {/*
        Scanner entrada = new Scanner(System.in);
        String nombreVelero;
        int cuotaMensualVelerosAcum, cuotaMensualLanchasAcum, tipoBarco, cantidadBarcos, contador, cuotaEmbarcacion, maxCuotaEmbarcacion;
        System.out.println("Cuantas embarcaciones va a cargar?");
        cantidadBarcos = entrada.nextInt();
        contador = maxCuotaEmbarcacion = cuotaMensualVelerosAcum = cuotaMensualLanchasAcum = 0;
        nombreVelero = "Sin";
        while (contador < cantidadBarcos) {
            System.out.println("Que tipo de embarcación es esta? 1:Velero 2:Lancha");
            tipoBarco = entrada.nextInt();
            switch (tipoBarco) {
                case 1:
                    System.out.println("Cual es la cuota mensual de esta embarcación");
                    cuotaEmbarcacion = entrada.nextInt();
                    if (cuotaEmbarcacion > maxCuotaEmbarcacion) {
                        maxCuotaEmbarcacion = cuotaEmbarcacion;
                        System.out.println("Nombre del Velero?");
                        nombreVelero = entrada.next();
                    }   cuotaMensualVelerosAcum = cuotaMensualVelerosAcum + cuotaEmbarcacion;
                    break;
                case 2:
                    System.out.println("Cual es la cuota mensual de esta embarcación");
                    cuotaEmbarcacion = entrada.nextInt();
                    cuotaMensualLanchasAcum = cuotaMensualLanchasAcum + cuotaEmbarcacion;
                    break;
                default:
                    System.out.println("Número ingresado incorrecto");
                    contador = contador - 1;
                    break;
            }
            contador = contador + 1;
        }
        System.out.println("El total anual aportado por los veleros es: $" + cuotaMensualVelerosAcum * 12 + " y el total anual aportado por las lanchas es: $" + cuotaMensualLanchasAcum * 12);
        System.out.println("El velero que mas paga es el velero: " + nombreVelero + " paga $" + maxCuotaEmbarcacion + " por mes.");
        System.out.println("El valor promedio de la cuota pagada es: $" + ((cuotaMensualLanchasAcum + cuotaMensualVelerosAcum) / cantidadBarcos));
         */
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int cantBarcos, tipoBarco;
        float cuotaBarco, acumLanchas, acumVeleros, cuotaMayor;
        boolean avisoVelero;
        String nombre, nombreMayor;
        acumLanchas = acumVeleros = 0;
        avisoVelero = false;
        nombreMayor = "";
        cuotaMayor = 0;

        do {
            System.out.println("Cuantas embarcaciones va a cargar?");
            cantBarcos = entrada.nextInt();
        } while (cantBarcos <= 0);

        for (int i = 0; i < cantBarcos; i++) {
            System.out.println("Ingrese nombre del barco");
            nombre = entrada2.nextLine();

            do {
                System.out.println("Ingrese el tipo de barco. 1: Velero 2: Lancha");
                tipoBarco = entrada.nextInt();
            } while (tipoBarco != 1 && tipoBarco != 2);

            System.out.println("Cuanto paga mensualmente esta embarcación?");
            cuotaBarco = entrada.nextFloat();

            if (tipoBarco == 1) {
                acumVeleros = acumVeleros + cuotaBarco;
                if (avisoVelero == false) {
                    nombreMayor = nombre;
                    cuotaMayor = cuotaBarco;
                    avisoVelero = true;
                } else if (cuotaBarco > cuotaMayor) {
                    nombreMayor = nombre;
                    cuotaMayor = cuotaBarco;
                }

            } else {
                acumLanchas = acumLanchas + cuotaBarco;
            }

        }

        System.out.println("Total anual de Veleros $" + (acumVeleros * 12));
        System.out.println("Total anual de Lancha $" + (acumLanchas * 12));
        System.out.println("El promedio de cuota es $" + ((acumLanchas + acumVeleros) / cantBarcos));
        if (avisoVelero == true) {
            System.out.println("El velero que mas paga es:" + nombreMayor + " y paga por mes $" + cuotaMayor);
        }
    }

}
