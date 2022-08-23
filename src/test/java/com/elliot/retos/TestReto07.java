package com.elliot.retos;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class TestReto07 {

    Reto07 wordCountTest = new Reto07();

    @Test
    void itShouldGiveWordCount() {
        String text = "Buenas tardes tardes";

        Map<String, Long> result = wordCountTest.countWordsFromString(text);
        Map<String, Long> expectedResult = new HashMap<>();
                expectedResult.put("buenas", 1L);
                expectedResult.put("tardes", 2L);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void itShouldGiveWrongWordCount() {
        String text = "Hola mundo";

        Map<String, Long> result = wordCountTest.countWordsFromString(text);
        Map<String, Long> expectedResult = new HashMap<>();
                expectedResult.put("hola", 5L);
                expectedResult.put("mundo", 10L);

        assertThat(result).isNotEqualTo(expectedResult);
    }
}
