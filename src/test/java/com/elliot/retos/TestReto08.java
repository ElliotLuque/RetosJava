package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class TestReto08 {

    Reto08 binaryConverterTest = new Reto08();

    @Test
    void itShouldConvertToBinary() {
        int decimal = 170;

        String result = binaryConverterTest.convertToBinary(decimal);

        assertThat(result).isEqualTo("10101010");
    }

    @Test
    void itShouldConvertToBinary2() {
        int decimal = 15;

        String result = binaryConverterTest.convertToBinary(decimal);

        assertThat(result).isEqualTo("1111");
    }

    @Test
    void itShouldConvertWronglyToBinary() {
        int decimal = 20;

        String result = binaryConverterTest.convertToBinary(decimal);

        assertThat(result).isNotEqualTo("22112");
    }
}
