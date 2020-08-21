
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        int montoRetiro, billMil, billQuinientos, billDoscientos, billCien;
        Scanner entrada = new Scanner(System.in);
        //billCien = billDoscientos = billMil = billQuinientos = 0;
        System.out.println("Ingrese monto a retirar:");
        montoRetiro = entrada.nextInt();
        billMil = montoRetiro / 1000;
        billQuinientos = (montoRetiro % 1000) / 500;
        billDoscientos = (montoRetiro - (billMil * 1000 + billQuinientos * 500)) / 200;
        billCien = (montoRetiro - (billMil * 1000 + billQuinientos * 500+billDoscientos*200)) / 100;
        System.out.println("Total billetes de $1000: " + billMil);
        System.out.println("Total billetes de $500: " + billQuinientos);
        System.out.println("Total billetes de $200: " + billDoscientos);
        System.out.println("Total billetes de $100: " + billCien);
    }

}
