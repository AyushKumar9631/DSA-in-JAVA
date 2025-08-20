package MathsForDSA;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(37));
    }
    static double sqrt(double n){
        double x=n;
        while(true){
            double root=0.5*(x+(n/x));
            double error=Math.abs(x-root);
            if(error<0.5){
                return root;
            }
            x=root;
        }
    }
}
