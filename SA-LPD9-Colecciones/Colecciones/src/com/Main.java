package com;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("plátano", "banana");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");
        diccionario.put("gris", "gray");
        diccionario.put("rosa", "pink");
        diccionario.put("morado", "purple");
        diccionario.put("marrón", "brown");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una palabra en español:");
        String palabraEspanol = scanner.nextLine();

        String palabraIngles = diccionario.get(palabraEspanol);

        if (palabraIngles != null) {
            System.out.println("La traducción de \"" + palabraEspanol + "\" es \"" + palabraIngles + "\".");
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}