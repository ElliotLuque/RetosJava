package com.elliot.retos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class TestReto01 {

    Reto01 anagramTest = new Reto01();

    @Test
    void itShouldBeAnagram() {
        String word1 = "teal";
        String word2 = "late";

        assertThat(anagramTest.isAnagram(word1, word2)).isTrue();
    }

    @Test
    void itShouldNotBeAnagram() {
        String word1 = "blue";
        String word2 = "red";

        assertThat(anagramTest.isAnagram(word1, word2)).isFalse();
    }

    @Test
    void itShouldNotBeAnagram2() {
        String word1 = "blue";
        String word2 = "blue";

        assertThat(anagramTest.isAnagram(word1, word2)).isFalse();
    }
}
