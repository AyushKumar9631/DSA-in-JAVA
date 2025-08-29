package InBuiltFxns;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int pointer=-1;
    public CustomStack(){
        data= new int[DEFAULT_SIZE];
    }
    public CustomStack(int size){
        data= new int[size];
    }

    public boolean push(int Data) throws Stackexception{
        if(isFull()){
            throw new Stackexception("cannot push to full stack");
        }
        data[++pointer]=Data;
        return true;
    }

    protected boolean isFull(){
        return pointer==data.length-1;
    }

    protected boolean isEmpty(){
        return pointer==-1;
    }

    public int pop() throws Stackexception{
        if(isEmpty()) throw new Stackexception("Cannot pop from empty stack");
        int rev=data[pointer--];
        return rev;
    }

    public int peek() throws Stackexception{
        if(isEmpty()) throw new Stackexception("Cannot peek from empty stack");
        int rev=data[pointer];
        return rev;
    }

}
