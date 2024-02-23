package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor, ingresa el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Array original mostrando la posición del array más el valor:");
        mostrarArray(numeros);

        int[] numerosPrimos = new int[numeros.length];
        int indicePrimos = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                numerosPrimos[indicePrimos] = numero;
                indicePrimos++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                numerosPrimos[indicePrimos] = numeros[i];
                indicePrimos++;
            }
        }

        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        mostrarArray(numerosPrimos);

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}