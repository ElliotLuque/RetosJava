package com.elliot.retos;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */

public class TestReto18 {

    Reto18 ticTacToeTest = new Reto18();

    @Test
    void itShouldWinX() {
        String[][] board = {
                {"X", "O", " "},
                {" ", "X", " "},
                {" ", "O", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("X");
    }

    @Test
    void itShouldWinX2() {
        String[][] board = {
                {"X", "X", "X"},
                {"O", "O", " "},
                {" ", "O", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("X");
    }

    @Test
    void itShouldWinO() {
        String[][] board = {
                {"X", "O", "X"},
                {" ", "O", " "},
                {"X", "O", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("O");
    }

    @Test
    void itShouldWinO2() {
        String[][] board = {
                {"X", "O", "O"},
                {"X", "O", " "},
                {"O", "X", " "},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("O");
    }

    @Test
    void itShouldBeDraw() {
        String[][] board = {
                {"O", "X", "O"},
                {"X", "X", "O"},
                {"O", "O", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("Draw");
    }

    @Test
    void itShouldBeNullGame() {
        String[][] board = {
                {"O", "O", "O"},
                {"O", " ", " "},
                {"O", " ", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("Null");
    }

    @Test
    void itShouldBeNullGame2() {
        String[][] board = {
                {"O", "X", "O"},
                {"X", "X", "O"},
                {"O", "", "X"},
                {"X", "O", " "}
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("Null");
    }

    @Test
    void itShouldBeNullGame3() {
        String[][] board = {
                {"a", "X", "O"},
                {"X", "b", "O"},
                {"O", "", "X"},
        };

        String result = ticTacToeTest.ticTacToe(board);

        assertThat(result).isEqualTo("Null");
    }
}
