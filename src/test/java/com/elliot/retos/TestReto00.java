package com.elliot.retos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class TestReto00 {

    Reto00 fizzbuzzTest = new Reto00();

    @Test
    void itShouldReturnFizz() {
        String result = fizzbuzzTest.calculateFizzBuzz(3);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void itShouldReturnBuzz() {
        String result = fizzbuzzTest.calculateFizzBuzz(5);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void itShouldReturnFizzBuzz() {
        String result = fizzbuzzTest.calculateFizzBuzz(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void itShouldReturnNumber() {
        String result = fizzbuzzTest.calculateFizzBuzz(2);

        assertThat(result).isEqualTo("2");
    }
}
