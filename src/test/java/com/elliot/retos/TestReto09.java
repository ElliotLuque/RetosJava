package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

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

public class TestReto09 {

    Reto09 morseTranslateTest = new Reto09();

    @Test
    void itShouldTranslateToMorse() {
        String natural = "Hola mundo SOS";

        String result = morseTranslateTest.toMorse(natural);

        assertThat(result).isEqualTo(".... --- .-.. .- / -- ..- -. -.. --- / ... --- ...");
    }

    @Test
    void itShouldFailTranslateToMorse() {
        String natural = "SOS";

        String result = morseTranslateTest.toMorse(natural);

        assertThat(result).isNotEqualTo(".. / .. / ..");
    }

    @Test
    void itShouldTranslateToNatural() {
        String morse = "-.. --. -.-.";

        String result = morseTranslateTest.toNatural(morse);

        assertThat(result).isEqualTo("DGC");
    }

    @Test
    void itShouldFailTranslateToNatural() {
        String morse = ".-. / .... / ..-";

        String result = morseTranslateTest.toNatural(morse);

        assertThat(result).isNotEqualTo("ABC");
    }
}
