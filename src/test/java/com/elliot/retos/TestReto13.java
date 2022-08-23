package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

public class TestReto13 {

    Reto13 factorialTest = new Reto13();

    @Test
    void itShouldGiveFactorial() {
        int num = 5;

        int result = factorialTest.factorial(num);

        assertThat(result).isEqualTo(120);
    }

    @Test
    void itShouldGiveFactorial2() {
        int num = 9;

        int result = factorialTest.factorial(num);

        assertThat(result).isEqualTo(362880);
    }

    @Test
    void itShouldGiveWrongFactorial() {
        int num = 10;

        int result = factorialTest.factorial(num);

        assertThat(result).isNotEqualTo(500);
    }
}
