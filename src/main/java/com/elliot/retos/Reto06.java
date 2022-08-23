package com.elliot.retos;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class Reto06 {
    public String reverseString(String original) {

        char[] wordLetters = original.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = wordLetters.length ; i > 0; i--) {
            reversed.append(wordLetters[i-1]);
        }

        return reversed.toString();
    }
}
