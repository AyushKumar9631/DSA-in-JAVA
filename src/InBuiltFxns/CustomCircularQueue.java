package InBuiltFxns;

public class CustomCircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    protected int size=0;

    public CustomCircularQueue(int size) {
        data=new int[size];
    }
    public CustomCircularQueue(){
        data=new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item) throws Stackexception{
        if(isFull()) throw new Stackexception("cannot insert to full queue");
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Stackexception{
        if(isEmpty()) throw  new Stackexception("cannot remove from empty queue");
        int rev=data[front++];
        front=front%data.length;
        size--;
        return rev;
    }

    public int front() throws Stackexception{
        if(isEmpty()){
            throw new Stackexception("Cannot remove from empty stack");
        }
        return data[front];
    }

    public void display(){
        int i=front;
        do{
            System.out.print(data[i]+"<- ");
            i=(i+1)% data.length;
        }while(i!=end);
        System.out.println("END");
    }

}
