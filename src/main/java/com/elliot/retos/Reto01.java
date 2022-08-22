package com.elliot.retos;

import java.util.List;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Reto01 {
    public boolean isAnagram(String word, String word2) {

        if (word.length() == word2.length()
                && !word.equalsIgnoreCase(word2)) {
            return containsSameLetters(word, word2);
        }

        return false;
    }

    private boolean containsSameLetters(String word, String word2) {
        List<Character> letras1 = word.chars().sorted().mapToObj(c -> (char) c).toList();
        List<Character> letras2 = word2.chars().sorted().mapToObj(c -> (char) c).toList();

        return letras1.equals(letras2);
    }
}
