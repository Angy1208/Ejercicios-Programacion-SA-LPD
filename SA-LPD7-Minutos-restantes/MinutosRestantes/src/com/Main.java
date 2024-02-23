package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diaSemana;
        int hora, minutos;

        do {
            System.out.println("Por favor, ingresa un día de la semana (lunes a viernes):");
            diaSemana = scanner.nextLine().toLowerCase();
        } while (!esDiaValido(diaSemana));

        do {
            System.out.println("Por favor, ingresa una hora (0 a 23):");
            hora = scanner.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.println("Por favor, ingresa los minutos (0 a 59):");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);

        int minutosFaltantes = calcularMinutosFaltantes(diaSemana, hora, minutos);

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");

        scanner.close();
    }

    public static boolean esDiaValido(String dia) {
        return dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") ||
               dia.equals("jueves") || dia.equals("viernes");
    }

    public static int calcularMinutosFaltantes(String dia, int hora, int minutos) {
        int minutosDia = 24 * 60;
        int minutosViernes = 15 * 60;

        switch (dia) {
            case "lunes":
                return minutosDia * 4 - (hora * 60 + minutos);
            case "martes":
                return minutosDia * 3 - (hora * 60 + minutos);
            case "miércoles":
                return minutosDia * 2 - (hora * 60 + minutos);
            case "jueves":
                return minutosDia - (hora * 60 + minutos);
            case "viernes":
                if (hora < 15) {
                    return minutosViernes - (hora * 60 + minutos);
                } else {
                    return minutosDia - (hora * 60 + minutos);
                }
            default:
                return -1;
        }
    }
}