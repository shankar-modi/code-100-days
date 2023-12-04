package com.sk.recursion;

import java.util.Arrays;

public class A_08_SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            for (int[] b : board) {
                System.out.println(Arrays.toString(b));
            }
        } else {
            System.out.println("No solution");
        }
    }

    private static boolean solve(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (isSafe(k, i, j, board)) {
                            board[i][j] = k;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSafe(int val, int row, int col, int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == val) return false;
            if (board[i][col] == val) return false;

            if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == val) return false;
        }
        return true;
    }
}
