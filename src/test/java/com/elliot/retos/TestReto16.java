package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class TestReto16 {

    Reto16 firstLetterUppercaseTest = new Reto16();

    @Test
    void itShouldGiveFirstUppercaseString() {
        String text = "hola mundo que tal";

        String result = firstLetterUppercaseTest.uppercaseFirst(text);

        assertThat(result).isEqualTo("Hola Mundo Que Tal");
    }

    @Test
    void itShouldFailToGiveFirstUppercaseString() {
        String text = "buenas tardes tardes";

        String result = firstLetterUppercaseTest.uppercaseFirst(text);

        assertThat(result).isNotEqualTo("Buenas tardes Tardes");
    }
}
