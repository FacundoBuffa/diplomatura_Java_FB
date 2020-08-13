package com.mycompany.pybarajasespanolas;

import java.util.Random;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int numCart1, numCart2, paloCart1, paloCart2, contManos, puntosJug1, puntosJug2;
        String jugador1, jugador2, paloCart1Escrito, paloCart2Escrito;
        System.out.println("Ingrese el nombre del primer jugador:");
        jugador1 = entrada.next();
        System.out.println("Ingrese el nombre del segundo jugador:");
        jugador2 = entrada.next();
        contManos = puntosJug1 = puntosJug2 = 0;
        paloCart1Escrito = paloCart2Escrito = "Sin palo aún";
        do {
            numCart1 = r.nextInt(12) + 1;
            numCart2 = r.nextInt(12) + 1;
            paloCart1 = r.nextInt(4) + 1;
            paloCart2 = r.nextInt(4) + 1;
            switch (paloCart1) {
                case 1:
                    paloCart1Escrito = "Copa";
                    break;
                case 2:
                    paloCart1Escrito = "Basto";
                    break;
                case 3:
                    paloCart1Escrito = "Espada";
                    break;
                case 4:
                    paloCart1Escrito = "Oro";
                    break;
            }
            switch (paloCart2) {
                case 1:
                    paloCart2Escrito = "Copa";
                    break;
                case 2:
                    paloCart2Escrito = "Basto";
                    break;
                case 3:
                    paloCart2Escrito = "Espada";
                    break;
                case 4:
                    paloCart2Escrito = "Oro";
                    break;
            }
            if (numCart1 > numCart2) {
                puntosJug1 = puntosJug1 + numCart1 + numCart2;
            }
            if (numCart1 < numCart2) {
                puntosJug2 = puntosJug2 + numCart1 + numCart2;
            }
            if (numCart1 == numCart2) {
                if (paloCart1 == 4) {
                    puntosJug1 = puntosJug1 + numCart1 + numCart2;
                }
                if (paloCart2 == 4) {
                    puntosJug2 = puntosJug2 + numCart1 + numCart2;
                } else {
                    puntosJug1 = puntosJug1 +numCart1;
                    puntosJug2 = puntosJug2 +numCart2;
                }
            }
            contManos = contManos + 1;
            if (contManos == 1) {
                System.out.println("En la primer mano las cartas fueron " + numCart1 + " de " + paloCart1Escrito + " para "
                        + jugador1 + " y " + numCart2 + " de " + paloCart2Escrito + " para " + jugador2);

                System.out.println("En la primer mano el puntaje para " + jugador1 + " fue " + puntosJug1 + " y el puntaje de " + jugador2 + " fue " + puntosJug2);
            }

        } while (contManos < 2);
        System.out.println("En la segunda mano las cartas fueron " + numCart1 + " de " + paloCart1Escrito + " para "
                + jugador1 + " y " + numCart2 + " de " + paloCart2Escrito + " para " + jugador2);

        System.out.println("El puntaje final para " + jugador1 + " es " + puntosJug1 + " y el puntaje de " + jugador2 + " es " + puntosJug2);
    }

}
