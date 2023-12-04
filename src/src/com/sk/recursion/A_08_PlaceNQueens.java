package com.sk.recursion;

import java.util.Arrays;

public class A_08_PlaceNQueens {

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[4][4];
        for (char[] c: board) {
            Arrays.fill(c, '.');
        }
        placeQueens(0, board);

    }

    private static void placeQueens(int currCol, char[][] board) {
        if (currCol == board.length){
            System.out.println("======");
            for (char[] row: board ) {
                System.out.println(Arrays.toString(row));
            }
            return;
        }

        for (int i = 0 ; i < board.length; i++){
            if(isSafe(i, currCol, board)){
                board[i][currCol] = 'Q';
                placeQueens(currCol+1, board);
                board[i][currCol] = '.';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {

        int dupRow =row;
        int dupCol = col;
        while (row >=0 && col>=0){
            if (board[row][col] == 'Q')return false;
            row--;
            col--;
        }

        row =dupRow;
        col = dupCol;
        while (col>=0){
            if (board[row][col] == 'Q')return false;
            col--;
        }

        row =dupRow;
        col = dupCol;
        while (row<board.length &&  col>=0){
            if (board[row][col] == 'Q')return false;
            row++;
            col--;
        }

        return true;
    }
}
