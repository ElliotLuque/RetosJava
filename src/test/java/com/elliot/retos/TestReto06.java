package com.elliot.retos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class TestReto06 {

    Reto06 reverseStringTest = new Reto06();

    @Test
    void itShouldReverseString() {
        String reverse = "Hola mundo";

        String result = reverseStringTest.reverseString(reverse);

        assertThat(result).isEqualTo("odnum aloH");
    }

    @Test
    void itShouldNotReverseString() {
        String reverse = "Hola mundo";

        String result = reverseStringTest.reverseString(reverse);

        assertThat(result).isNotEqualTo("Hola mundo");
    }

}
