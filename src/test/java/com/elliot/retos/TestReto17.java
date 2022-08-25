package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

public class TestReto17 {

    Reto17 raceTest = new Reto17();

    @Test
    void itShouldBeCorrectRace() {
        String race = "__|_|||";
        String[] movements = {"run", "run", "jump", "run", "jump", "jump",
                              "jump"};

        String result = raceTest.race(movements, race);
        boolean completed = raceTest.raceResult(result);

        assertThat(completed).isTrue();
    }

    @Test
    void itShouldBeIncorrectRace() {
        String race = "_|__|_|||_|";
        String[] movements = {"jump", "jump", "run", "run", "jump", "run",
                              "jump", "jump", "run", "run", "jump"};

        String result = raceTest.race(movements, race);
        boolean completed = raceTest.raceResult(result);

        assertThat(completed).isFalse();
    }

    @Test
    void itShouldThrowExceptionForInvalidRaceCourse() {
        String race = "_||a_b";
        String[] movements = {"jump", "jump", "run", "run", "jump", "run"};

        assertThatThrownBy(() -> raceTest.race(movements, race)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Race inputs must be well formed... ( '|' = jump, '_' = run )");
    }

    @Test
    void itShouldThrowExceptionForInvalidRaceMovements() {
        String race = "|__||_";
        String[] movements = {"hola", "jump", "a", "run", "b", "adios"};

        assertThatThrownBy(() -> raceTest.race(movements, race)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Race inputs must be well formed... ( '|' = jump, '_' = run )");
    }

    @Test
    void itShouldThrowExceptionForNumberOfMovements() {
        String race = "|__||_|";
        String[] movements = {"jump", "jump", "run", "run", "jump", "run", "jump", "run", "run", "run", "run"};

        assertThatThrownBy(() -> raceTest.race(movements, race)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("There must be the same number of obstacles and moves...");
    }
}
