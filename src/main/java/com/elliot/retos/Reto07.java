package com.elliot.retos;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class Reto07 {
    public Map<String, Long> countWordsFromString(String text) {

        List<String> wordsInText = List.of(text.toLowerCase().split("\\s"));

        return wordsInText.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
