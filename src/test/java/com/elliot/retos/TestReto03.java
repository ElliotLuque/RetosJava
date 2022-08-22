package com.elliot.retos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class TestReto03 {

    Reto03 primeNumberTest = new Reto03();

    @Test
    void itShouldBePrimeNumber() {
        int num = 23;

        boolean result = primeNumberTest.isPrime(num);

        assertThat(result).isTrue();
    }

    @Test
    void itShouldBePrimeNumber2() {
        int num2 = 30203;

        boolean result2 = primeNumberTest.isPrime(num2);

        assertThat(result2).isTrue();
    }

    @Test
    void itShouldNotBePrimeNumber() {
        int num = 18;

        boolean result = primeNumberTest.isPrime(num);

        assertThat(result).isFalse();
    }

    @Test
    void itShouldNotBePrimeNumber2() {
        int num2 = 5818681;

        boolean result2 = primeNumberTest.isPrime(num2);

        assertThat(result2).isFalse();
    }

    @Test
    void itShouldPrintFirst100PrimeNumbers() {
        primeNumberTest.printPrimeNumbers();
    }
}
