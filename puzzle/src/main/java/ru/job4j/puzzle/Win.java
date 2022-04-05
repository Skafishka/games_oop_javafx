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

/* /старое решение/
public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            int index_row = 0;
            for (int cell = 0; cell < board[row].length; cell++) {
                int index_column = 0;
                if (board[row][cell] == 1) {
                    index_row +=1;
                    for (int row1 = 0; row1 < board.length; row1++) {
                        if (board[row1][cell] == 1 && row == 0) {
                            index_column += 1;
                        }
                    }
                }
                if (index_row == 5 || index_column == 5) {
                rsl = true;
                break;
                }
            }
        }
        return rsl;
    }
} */

