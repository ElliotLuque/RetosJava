package com.elliot.retos;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class Reto16 {
    public String uppercaseFirst(String text) {
        List<String> wordsInText = List.of(text.toLowerCase().split("\\s"));
        StringJoiner convertedText = new StringJoiner(" ");

        wordsInText.forEach(word -> {
            List<Character> charsInWord = new ArrayList<>(word.chars().mapToObj(c -> (char) c).toList());
            StringBuilder convertedWord = new StringBuilder();

            char upperCase = Character.toUpperCase(charsInWord.get(0));
            charsInWord.set(0, upperCase);

            charsInWord.forEach(convertedWord::append);
            convertedText.add(convertedWord);
        });

        return convertedText.toString();
    }
}
