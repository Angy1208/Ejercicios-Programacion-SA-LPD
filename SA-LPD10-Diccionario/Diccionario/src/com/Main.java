package com;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");
        diccionario.put("rosa", "pink");
        diccionario.put("morado", "purple");
        diccionario.put("gris", "gray");
        diccionario.put("marrón", "brown");
        diccionario.put("lápiz", "pencil");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Bienvenido a tu aplicación de traducción!");

        for (int i = 0; i < 5; i++) {
            Object[] keys = diccionario.keySet().toArray();
            String palabra = (String) keys[random.nextInt(keys.length)];
            System.out.println("¿Cuál es la traducción al inglés de la palabra '" + palabra + "'?");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabra);
            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + traduccionCorrecta + "'.");
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
