package Linear_search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={18,12,9,176,98,1};
        System.out.println(findnumbers(arr));
    }

    static int findnumbers(int[] arr){
        int count=0;
        for(int i: arr){
            if(i<0) i=i*-1;
             int digits=0;
            while(i>0){
                digits++;
                i=i/10;
            }
            if(digits%2==0) count++;
        }
        return count;
    }
}
