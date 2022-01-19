package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl;
        int num = Diagonal(board);
        rsl = (Horizontal(board, num)) || Vertical(board, num);
        return rsl;
    }

    public static boolean Horizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean Vertical(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static int Diagonal(int[][] board) {
        int num = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] > 0) {
                num = i;
            }
        }
        return num;
    }
}
