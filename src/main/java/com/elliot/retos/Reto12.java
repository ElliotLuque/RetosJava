package com.elliot.retos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

public class Reto12 {
    public boolean isPalindrome(String text) {
        List<Character> letters = new ArrayList<>(text
                .toLowerCase()
                .replace(" ","")
                .chars()
                .mapToObj(c -> (char) c)
                .toList());

        List<Character> reversed = new ArrayList<>(List.copyOf(letters));
        Collections.reverse(reversed);

        StringBuilder reversedText = new StringBuilder();
        reversed.forEach(reversedText::append);

        return reversedText
                .toString()
                .equals(text
                        .toLowerCase()
                        .replace(" ",""));

    }
}
