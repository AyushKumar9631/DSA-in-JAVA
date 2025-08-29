package InBuiltFxns;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;

    public CustomQueue(int size) {
        data=new int[size];
    }
    public CustomQueue(){
        data=new int[DEFAULT_SIZE];
    }

    protected boolean isFull(){
        return end==data.length;
    }
    protected boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item) throws Stackexception{
        if(isFull()) throw new Stackexception("cannot insert to full queue");
        data[end++]=item;
        return true;
    }

    public int remove() throws Stackexception{
        if(isEmpty()){
          throw new Stackexception("Cannot remove from empty stack");
        }
        int val=data[0];
        for(int i=1; i<data.length; i++){
            data[i-1]=data[i];
        }
        end--;
        return val;
    }

    public int front() throws Stackexception{
        if(isEmpty()){
            throw new Stackexception("Cannot remove from empty stack");
        }
        return data[0];
    }

    public void display(){
        for(int i: data){
            System.out.print(i+"<- ");
        }
        System.out.println("END");
    }

}
