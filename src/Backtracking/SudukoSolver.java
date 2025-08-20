package Backtracking;

import java.util.Arrays;

public class SudukoSolver {
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
        System.out.println(countsoln(board));

    }

    static int countsoln(int[][] board){
        int row=-1;
        int col=-1;
        //checking for unsolved boxes
        for (int i = 0; i < 9; i++) {
            for(int j=0; j<9; j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                }
            }
        }
        //checking if solved
        if(row==-1){
            display(board);
            return 1;
        }

        //else filling the box
        int count=0;
        for(int i=1; i<10; i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                count+=countsoln(board);
                board[row][col]=0;
            }
        }
        return count;
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        //checking row and col
        for(int i=0; i<9; i++){
            if(board[r][i]==num || board[i][c]==num) return false;
        }
        //checking 3*3
        int Brow=r-(r%3);
        int Bcol=c-(c%3);
        for(int i=Brow; i<=Brow+2; i++){
            for(int j=Bcol; j<=Bcol+2; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }

    static void display(int[][] board){
        for(int[] row: board){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
