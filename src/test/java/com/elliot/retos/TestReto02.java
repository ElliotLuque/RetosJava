package com.elliot.retos;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class TestReto02 {

    Reto02 fibonacciTest = new Reto02();

    @Test
    void itShouldGiveFibonacciNumber10() {
        int num = 10;

        int result = fibonacciTest.fibonacci(num);

        assertThat(result).isEqualTo(55);
    }

    @Test
    void itShouldGiveFibonacciNumber20() {
        int num = 20;

        int result = fibonacciTest.fibonacci(num);

        assertThat(result).isEqualTo(6765);
    }

    @Test
    void itShouldPrintFirst20Fibonacci(){
        fibonacciTest.printFibonacciSequence(20);
    }
}
