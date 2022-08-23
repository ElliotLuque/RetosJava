package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

public class TestReto11 {

    Reto11 deleteCharactersTest = new Reto11();

    @Test
    void itShouldGiveCorrectStrings() {
        String string = "hola";
        String string2 = "mundo";

        String[] result = deleteCharactersTest.deleteCharactersFromStrings(string, string2);
        String[] expectedResult = {"hla", "mund"};

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void itShouldNotGiveCorrectStrings() {
        String string = "abc";
        String string2 = "cde";

        String[] result = deleteCharactersTest.deleteCharactersFromStrings(string, string2);
        String[] expectedResult = {"abc", "de"};

        assertThat(result).isNotEqualTo(expectedResult);
    }
}
