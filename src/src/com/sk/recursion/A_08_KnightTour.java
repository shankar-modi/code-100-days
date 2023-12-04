package com.sk.recursion;

import java.util.Arrays;

public class A_08_KnightTour {

    static int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        if(isSolve(board)){
            for (int[] row: board ) {
                System.out.println(Arrays.toString(row));
            }
        }else {
            System.out.println("No Solution");
        }
    }

    private static boolean isSolve(int[][] board) {
        return solveUtil(0 ,0, 1, board);
    }

    private static boolean solveUtil(int i, int j, int move, int[][] board) {
        if (move == 64)return true;
        for (int k= 0; k< 8; k++){
            int nextX = i + xMove[k];
            int nextY = j + yMove[k];
            if(isSafe(nextX, nextY, board)){
                board[nextX][nextY] = move;
                if(solveUtil(nextX, nextY, move+1, board)){
                    return true;
                }else {
                    board[nextX][nextY] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < board.length && y >= 0 && y < board.length
                && board[x][y] == 0);
    }
}
