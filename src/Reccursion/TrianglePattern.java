package Reccursion;

public class TrianglePattern {
    public static void main(String[] args) {
        int n=6;
        tp(n,0);
    }

    static void tp(int n, int col){
        if(n==0) return;
        if(col<n){
            System.out.print("* ");
            tp(n,++col);
        }
        else {
            System.out.println();
            tp(n-1, 0);
        }
    }
}
