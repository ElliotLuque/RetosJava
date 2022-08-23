package com.elliot.retos;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Stream;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

public class Reto09 {
    private final Map<String, String> morseDictionary = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("A", ".-"),
            new AbstractMap.SimpleEntry<>("B", "-..."),
            new AbstractMap.SimpleEntry<>("C", "-.-."),
            new AbstractMap.SimpleEntry<>("D", "-.."),
            new AbstractMap.SimpleEntry<>("E", "."),
            new AbstractMap.SimpleEntry<>("F", "..-."),
            new AbstractMap.SimpleEntry<>("G", "--."),
            new AbstractMap.SimpleEntry<>("H", "...."),
            new AbstractMap.SimpleEntry<>("I", ".."),
            new AbstractMap.SimpleEntry<>("J", ".---"),
            new AbstractMap.SimpleEntry<>("K", "-.-"),
            new AbstractMap.SimpleEntry<>("L", ".-.."),
            new AbstractMap.SimpleEntry<>("M", "--"),
            new AbstractMap.SimpleEntry<>("N", "-."),
            new AbstractMap.SimpleEntry<>("Ñ", "--.--"),
            new AbstractMap.SimpleEntry<>("O", "---"),
            new AbstractMap.SimpleEntry<>("P", ".--."),
            new AbstractMap.SimpleEntry<>("Q", "--.-"),
            new AbstractMap.SimpleEntry<>("R", ".-."),
            new AbstractMap.SimpleEntry<>("S", "..."),
            new AbstractMap.SimpleEntry<>("T", "-"),
            new AbstractMap.SimpleEntry<>("U", "..-"),
            new AbstractMap.SimpleEntry<>("V", "...-"),
            new AbstractMap.SimpleEntry<>("W", ".--"),
            new AbstractMap.SimpleEntry<>("X", "-..-"),
            new AbstractMap.SimpleEntry<>("Y", "-.--"),
            new AbstractMap.SimpleEntry<>("Z", "--.."),
            new AbstractMap.SimpleEntry<>("0", "-----"),
            new AbstractMap.SimpleEntry<>("1", ".----"),
            new AbstractMap.SimpleEntry<>("2", "..---"),
            new AbstractMap.SimpleEntry<>("3", "...--"),
            new AbstractMap.SimpleEntry<>("4", "....-"),
            new AbstractMap.SimpleEntry<>("5", "....."),
            new AbstractMap.SimpleEntry<>("6", "-...."),
            new AbstractMap.SimpleEntry<>("7", "--..."),
            new AbstractMap.SimpleEntry<>("8", "---.."),
            new AbstractMap.SimpleEntry<>("9", "----."),
            new AbstractMap.SimpleEntry<>(".", ".-.-.-"),
            new AbstractMap.SimpleEntry<>(",", "--..--"),
            new AbstractMap.SimpleEntry<>("?", "..--.."),
            new AbstractMap.SimpleEntry<>("\"", ".-..-."),
            new AbstractMap.SimpleEntry<>(" ", "/")
    );

    public String toMorse(String natural) {
        List<Character> letters = natural.toUpperCase().chars().mapToObj(c -> (char) c).toList();
        StringJoiner morse = new StringJoiner(" ");

        letters.forEach(letter -> morse.add(morseDictionary.get(String.valueOf(letter))));

        return morse.toString();
    }

    public String toNatural(String morse) {
        List<String> morseCodes = List.of(morse.split("\\s"));
        StringBuilder natural = new StringBuilder();

        morseCodes = morseCodes
                .stream()
                .map(this::findNaturalByMorse)
                .toList();

        morseCodes.forEach(natural::append);

        return natural.toString();
    }

    private String findNaturalByMorse(String morseCode) {
        Stream<String> stream = morseDictionary
                .entrySet()
                .stream()
                .filter(entry -> morseCode.equals(entry.getValue()))
                .map(Map.Entry::getKey);

        return stream.findFirst().orElse(null);
    }
}
