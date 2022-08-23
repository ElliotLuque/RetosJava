package com.elliot.retos;

import java.util.List;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

public class Reto11 {
    public String[] deleteCharactersFromStrings(String string, String string2) {
        List<Character> charString = string.chars().mapToObj(c -> (char) c).toList();
        List<Character> charString2 = string2.chars().mapToObj(c -> (char) c).toList();

        List<Character> output1 = charString.stream().filter(character -> !charString2.contains(character)).toList();
        List<Character> output2 = charString2.stream().filter(character -> !charString.contains(character)).toList();

        StringBuilder stringOutput1 = new StringBuilder();
        StringBuilder stringOutput2 = new StringBuilder();

        output1.forEach(stringOutput1::append);
        output2.forEach(stringOutput2::append);

        return new String[] {
                stringOutput1.toString(),
                stringOutput2.toString()};
    }
}
