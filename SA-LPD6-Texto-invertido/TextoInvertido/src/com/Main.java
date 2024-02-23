package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una palabra o frase:");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("El texto al revés es:");
        System.out.println(reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        // Convierte la cadena a un arreglo de caracteres
        char[] charArray = str.toCharArray();

        // Invierte el arreglo de caracteres
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        // Convierte el arreglo de caracteres de nuevo a una cadena
        return new String(charArray);
    }
}