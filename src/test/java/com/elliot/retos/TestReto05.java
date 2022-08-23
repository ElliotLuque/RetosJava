package com.elliot.retos;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

public class TestReto05 {

    Reto05 aspectRatioTest = new Reto05();

    @Test
    void itShouldGiveCorrectAspectRatio() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");

        String result = aspectRatioTest.calculateAspectRatio(url);

        assertThat(result).isEqualTo("128:41");
    }

    @Test
    void itShouldGiveCorrectAspectRatio2() throws IOException {
        URL url = new URL("https://fondosmil.com/fondo/11777.jpg");

        String result = aspectRatioTest.calculateAspectRatio(url);

        assertThat(result).isEqualTo("16:9");
    }

    @Test
    void itShouldGiveIncorrectAspectRatio() throws IOException {
        URL url = new URL("https://fondosmil.com/fondo/11771.jpg");

        String result = aspectRatioTest.calculateAspectRatio(url);

        assertThat(result).isNotEqualTo("4:3");
    }
}
