
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
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
    }

}
