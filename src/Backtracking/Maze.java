package Backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        //suppose a maze of 3*3 and player can move right and down
        //print no of possible paths from (0,0) to (2,2)
        System.out.println(countPaths(3,3));
        //Print all paths
        printPaths(3,3,"");
        System.out.println();
        //print all paths if player can also move diagonally RD
        printPathsDia(3,3,"");
        System.out.println();
        //print paths if (1,1) contains a obstacle;
        printPathsObs(3,3,"");
        System.out.println();
        //do above question using boolean array
        boolean[][] board=
                {{true,true,true},
                {true,false,true},
                {true, true, true}};
        printPathMaze(0,0,board,"");
        System.out.println();
        //print all paths if player can move in all four direction
        board[1][1]=true;
        printPathAllDir(0,0,board,"");
        System.out.println();
        //same as previous but this time print path also as grid
        int[][] grid={
                {0,0,0},
                {0,0,0},
                {0,0,0},};
        printMaze(0,0,board,grid,1);

    }

    static int countPaths(int row, int col){
        if(row==1) return 1;
        if(col==1) return 1;

        return countPaths(row-1,col)+ countPaths(row,col-1);
    }

    static void printPaths(int row, int col, String path){
        if(row==1 && col==1) System.out.print(path+" ");
        else if(row==1 || col==1){
            while(col!=1){
                path+="R";
                col--;
            }

            while(row!=1){
                path+="D";
                row--;
            }
            System.out.print(path+" ");
        }
        else{
            printPaths(row-1,col,path+"D");
            printPaths(row,col-1,path+"R");
        }
    }

    static void printPathsDia(int row, int col, String path){
        if(row==1 && col==1) System.out.print(path+" ");
        else if(row==1 || col==1){
            while(col!=1){
                path+="R";
                col--;
            }

            while(row!=1){
                path+="D";
                row--;
            }
            System.out.print(path+" ");
        }
        else{
            printPathsDia(row-1,col,path+"D");
            printPathsDia(row,col-1,path+"R");
            printPathsDia(row-1,col-1,path+"Dia");
        }
    }

    static void printPathsObs(int row, int col, String path){
        if(row==2 && col==2) return;
        if(row==1 && col==1) System.out.print(path+" ");
        else if(row==1 || col==1){
            while(col!=1){
                path+="R";
                col--;
            }

            while(row!=1){
                path+="D";
                row--;
            }
            System.out.print(path+" ");
        }
        else{
            printPathsObs(row-1,col,path+"D");
            printPathsObs(row,col-1,path+"R");
        }
    }

    static void printPathMaze(int r, int c, boolean[][] maze, String path){
        if(!maze[r][c]) return;
        if(r==maze.length -1&& c==maze[0].length-1){
            System.out.print(path+" ");
            return;
        }
        if(c!=maze[0].length-1) printPathMaze(r,c+1,maze,path+"R");
        if(r!=maze.length-1) printPathMaze(r+1,c,maze,path+"D");
    }

    static void printPathAllDir(int r, int c, boolean[][] maze, String path){
        if(!maze[r][c]) return;
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(path+" ");
            return;
        }
        maze[r][c]=false;
        if(c!=maze[0].length-1) printPathAllDir(r,c+1,maze,path+"R");
        if(r!=maze.length-1) printPathAllDir(r+1,c,maze,path+"D");
        if(c!=0) printPathAllDir(r,c-1,maze,path+"L");
        if(r!=0) printPathAllDir(r-1,c,maze,path+"U");
        maze[r][c]=true;
    }

    static void printMaze(int r, int c, boolean[][] maze, int[][] grid, int level){
        if(!maze[r][c]) return;
        if(r==maze.length-1 && c==maze[0].length-1){
            grid[r][c]=level;
            for(int[] i: grid) System.out.println(Arrays.toString(i));
            System.out.println();
            return;
        }
        maze[r][c]=false;
        grid[r][c]=level;
        if(c!=maze[0].length-1) printMaze(r,c+1,maze,grid,level+1);
        if(r!=maze.length-1) printMaze(r+1,c,maze,grid,level+1);
        if(c!=0) printMaze(r,c-1,maze,grid,level+1);
        if(r!=0) printMaze(r-1,c,maze,grid,level+1);
        maze[r][c]=true;
        grid[r][c]=0;
    }

}
