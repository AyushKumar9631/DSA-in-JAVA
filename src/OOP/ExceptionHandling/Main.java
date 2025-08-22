package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            //int c=a/b;
            //divide(a,b);
            //throw new Exception("just for fum");
            throw new Myexception("my exception");
        }catch(Myexception | ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Please don't divide with 0");
        return a/b;
    }
}
