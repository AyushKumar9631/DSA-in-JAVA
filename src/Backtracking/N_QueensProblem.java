package Backtracking;

public class N_QueensProblem {
    public static void main(String[] args) {
        int n=5;
        boolean[][] board= new boolean[n][n];
        System.out.println(countSoln(board,0));
    }

    static int countSoln(boolean[][] board, int r){
        int n=board.length;
        if(r ==n){
            display(board);
            return 1;
        }

        int count=0;
        for(int c=0; c<n;c++){
            board[r][c]=true;
            if(noAttack(r,c,board)) count+=countSoln(board, r+1);
            board[r][c]=false;
        }
        return count;
    }

    static boolean noAttack(int r, int c,boolean[][] board ){
        int n=board.length;
        //checking upperRows
        int tempr=r-1;
        while(tempr>=0){
            if(board[tempr][c]) return false;
            tempr--;
        }
        //checking diagonal Right
        tempr=r-1;
        int tempc=c+1;
        while(tempr>=0 && tempc<n){
            if(board[tempr][tempc]) return false;
            tempr--;
            tempc++;
        }
        //checking diagonal Left
        tempr=r-1;
        tempc=c-1;
        while(tempr>=0 && tempc>=0){
            if(board[tempr][tempc]) return false;
            tempr--;
            tempc--;
        }
        return true;
    }
    static void display(boolean[][] board){
        int n=board.length;
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==false) System.out.print("# ");
                else System.out.print("Q ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
