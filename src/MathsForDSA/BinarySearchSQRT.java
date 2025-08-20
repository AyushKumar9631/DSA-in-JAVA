//finding sqrt of a number up to two decimal place
package MathsForDSA;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        System.out.println(sqrt(n));
    }

    public static  double sqrt(int n){
        if(n<=0) return -1;
        else if(n==1) return 1;

        //integer val
        int start=2;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int x=mid*mid;
            if(x>n) end=mid-1;
            else if(x==n) return mid;
            else start=mid+1;
        }

        //single precision
        double num=end+0.1;
        while(num*num<n) num+=0.1;
        if(num*num==n) return num;

        //double precision
        num=num-0.1+.01;
        while(num*num<n) num+=0.01;
        return num;
    }

}


