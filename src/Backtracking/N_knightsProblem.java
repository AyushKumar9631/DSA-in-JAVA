package Backtracking;

public class N_knightsProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.println(countSoln(board,0,0,8));
    }

    static int countSoln(boolean[][] board, int r, int c, int rem){
        int n=board.length;
        //base condition
        if(rem==0){
            display(board);
            return 1;
        }

        //adjustment to r and c
        if(c==n){
            r++;
            c=0;
        }
        int count=0;
        while(r<n && c<n){
            if(issafe(board, r, c)){
                board[r][c]=true;
                count+=countSoln(board,r,c+1,rem-1);
                board[r][c]=false;
            }
            c+=1;
            if(c==n){
                c=0;
                r++;
            }
        }
        return count;
    }

    static boolean issafe(boolean[][] board, int r, int c){
        int n= board.length;
        if(r-2>=0){
            if(c-1>=0 && board[r-2][c-1]) return false;
            else if(c+1<n && board[r-2][c+1]) return false;
        }
        if(r-1>=0){
            if(c-2>=0 && board[r-1][c-2]) return false;
            else if(c+2<n && board[r-1][c+2]) return false;
        }
        return true;
    }

    static void display(boolean[][] board){
        int n=board.length;
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==false) System.out.print("# ");
                else System.out.print("K ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
