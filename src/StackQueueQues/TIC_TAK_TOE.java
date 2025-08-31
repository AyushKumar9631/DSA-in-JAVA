package StackQueueQues;

import java.util.Scanner;

public class TIC_TAK_TOE {
    public static void main(String[] args) {
        char[][] board= new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j]=' ';
            }
        }
        Scanner sc= new Scanner(System.in);
        char player='X';
        boolean gameOver=false;
        while(!gameOver){
            System.out.println("Player "+player+" enter:");
            int row=sc.nextInt();
            int col= sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                display(board);
                gameOver=hasWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+"has won");
                }
                else player=(player=='X')?'O':'X';
            }
            else System.out.println("Invalid move");
        }
    }

    public static boolean hasWon(char[][] board, char player){
        //checking row and column
        for(int i=0; i<3; i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player) return true;
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player) return true;
        }

        //checking diagonals
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player) return true;

        return false;
    }

    public static void display(char[][] board){
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                if(c!=2) System.out.print(board[r][c]+"|");
                else System.out.print(board[r][c]);
            }
            System.out.println();
        }
    }
}
