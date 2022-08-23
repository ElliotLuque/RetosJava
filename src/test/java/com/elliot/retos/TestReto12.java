package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

public class TestReto12 {

    Reto12 palindromeTest = new Reto12();

    @Test
    void itShouldBePalindrome() {
        String text = "Ana lleva al oso la avellana";

        boolean result = palindromeTest.isPalindrome(text);

        assertThat(result).isTrue();
    }

    @Test
    void itShouldNotBePalindrome() {
        String text = "Hola mundo";

        boolean result = palindromeTest.isPalindrome(text);

        assertThat(result).isFalse();
    }
}
