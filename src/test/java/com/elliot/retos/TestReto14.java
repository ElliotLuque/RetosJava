package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

public class TestReto14 {

    Reto14 armstrongTest = new Reto14();

    @Test
    void itShouldBeArmstrong() {
        int num = 153;

        boolean result = armstrongTest.isArmstrong(num);

        assertThat(result).isTrue();
    }

    @Test
    void itShouldBeArmstrong2() {
        int num = 370;

        boolean result = armstrongTest.isArmstrong(num);

        assertThat(result).isTrue();
    }

    @Test
    void itShouldNotBeArmstrong() {
        int num = 55;

        boolean result = armstrongTest.isArmstrong(num);

        assertThat(result).isFalse();
    }
}
