package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        for (int cell : board[row]) {
            if (cell == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1 && monoVertical(board, row) || monoHorizontal(board, row)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}