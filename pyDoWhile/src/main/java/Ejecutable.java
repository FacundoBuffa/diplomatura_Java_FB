
import java.util.Scanner;
import java.util.Random;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int cordX, cordY, op;
        cordX = r.nextInt(100);
        cordY = r.nextInt(100);
        do {
            System.out.println("La posición actual de tito es ( " + cordX + ";" + cordY + " ).");
            System.out.println("1. Girar al norte y avanzar 10 pasos");
            System.out.println("2. Girar al sur y avanzar 20 pasos");
            System.out.println("3. Girar al este y avanzar 10 pasos");
            System.out.println("4. Girar al oeste y avanzar 20 pasos");
            System.out.println("5. salir");
            System.out.println("Ingrese la opción deseada");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    cordY = cordY + 10;
                    break;
                case 2:
                    cordY = cordY - 20;
                    break;
                case 3:
                    cordX = cordX + 10;
                    break;
                case 4:
                    cordX = cordX - 20;
                    break;
                case 5:
                    System.out.println("Adios tito!");
                    break;
                default:
                    System.out.println("El número ingresado no corresponde a una opción valida");
                        
            }
        } while (op != 5);

    }

}
