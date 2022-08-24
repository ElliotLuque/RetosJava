package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

public class TestReto19 {

    Reto19 millisecondsTest = new Reto19();

    @Test
    void itShouldCalculateMilliseconds() {
        int days = 1;
        int hours = 4;
        int minutes = 17;
        int seconds = 22;

        long result = millisecondsTest.calculateMilliseconds(days, hours, minutes, seconds);

        assertThat(result).isEqualTo(101842000L);
    }

    @Test
    void itShouldCalculateMilliseconds2() {
        int days = 0;
        int hours = 0;
        int minutes = 1;
        int seconds = 47;

        long result = millisecondsTest.calculateMilliseconds(days, hours, minutes, seconds);

        assertThat(result).isEqualTo(107000L);
    }

    @Test
    void itShouldFailToCalculateMilliseconds() {
        int days = 5;
        int hours = 24;
        int minutes = 3;
        int seconds = 2;

        long result = millisecondsTest.calculateMilliseconds(days, hours, minutes, seconds);

        assertThat(result).isNotEqualTo(300000L);
    }
}
