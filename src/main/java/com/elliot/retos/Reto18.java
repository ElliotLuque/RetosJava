package com.elliot.retos;

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

public class Reto18 {
    public String ticTacToe(String[][] board) {
        if (!checkBoardPlayers(board) || !checkBoardProportions(board) || !checkBoardSquares(board)) {
            return "Null";
        }

        if (findDraw(board)) {
            return "Draw";
        }

        if (findWinDiagonal(board, 1, "X") || findWinDiagonal(board, 2, "X")) {
            return "X";
        }

        if (findWinDiagonal(board, 1, "O") || findWinDiagonal(board, 2, "O")) {
            return "O";
        }

        for (int i = 0; i < board.length; i++) {
            if (findWinHorizontal(board, i, "X") ||
                    findWinVertical(board, i, "X")) {
                return "X";
            }

            if (findWinHorizontal(board, i, "O") ||
                    findWinVertical(board, i, "O")) {
                return "O";
            }
        }

        return "0";
    }

    private boolean findWinHorizontal(String[][] board, int row, String player) {
        for (int i = 0; i < board.length; i++) {
            if (!board[row][i].equals(player)) {
                return false;
            }
        }
        return true;
    }

    private boolean findWinVertical(String[][] board, int column, String player) {
        for (int i = 0; i < board.length; i++) {
            if (!board[i][column].equals(player)) {
                return false;
            }
        }
        return true;
    }

    private boolean findWinDiagonal(String[][] board, int direction, String player) {
        int start;

        if (direction == 1) {
            start = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][start].equals(player)) {
                    start++;
                } else {
                    return false;
                }
            }
        } else if (direction == 2) {
            start = 2;
            for (int i = 0; i < board.length; i++) {
                if (board[i][start].equals(player)) {
                    start--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean findDraw(String[][] board) {
        for (String[] row : board) {
            for (String column : row) {
                if (column.equals(" ")) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkBoardSquares(String[][] board) {
        for (String[] row : board) {
            for (String column : row) {
                return column.equals("X") || column.equals("O") || column.equals(" ");
            }
        }

        return true;
    }

    private boolean checkBoardPlayers(String[][] board) {
        int countX = 0;
        int countO = 0;

        for (String[] row : board) {
            for (String column : row) {
                if (column.equals("X")) {
                    countX++;
                } else if (column.equals("O")) {
                    countO++;
                }
            }
        }

        if (countX == countO) {
            return true;
        }

        return countX - 1 == countO || countO - 1 == countX;
    }

    private boolean checkBoardProportions(String[][] board) {
        int rowCount = 0;
        for (int i = 0; i < board.length; i++) {
            rowCount++;
        }

        return board.length <= 3 && rowCount <= 3;
    }
}
