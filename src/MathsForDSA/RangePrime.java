//to calculate prime numbers in given range
package MathsForDSA;

public class RangePrime {
    public static void main(String[] args) {
        int a=-10; //start of range
        int b=40; // end of range

        if(a<=1) a=2;
        if(b<=1) return;
        boolean [] map= new boolean[b+1]; //hashmap

        for(int i=a; i*i<=b ; i++){ //checking only till sqrt of b
            if(map[i]) continue;

            if(!isPrime(i)) map[i]=true;

            int nums=i+i;
            while(nums<=b){
                map[nums]=true;
                nums+=i;
            }
        }

        for(int i=a; i<=b; i++){
            if(!map[i]) System.out.print(i+" ");
        }
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
