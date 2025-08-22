package OOP.ArrayList_implementation;
//we will take input on T format and since we cant make an object of T class
// we will store data in object class and type cast to return in any of the function

public class CustomGenArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList(){
        this.data= new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()) resize();
        data[size++]=num;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void resize(){
        Object[] temp= new Object[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public T remove(){
        return (T)(data[--size]);
    }

    public T get(int index){
        if(index>=size || index<0) {
            System.out.println("Arrays out of bound");
            return (T)(null);
        }
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int num){
        if(index>=size || index<0) {
            System.out.println("Arrays out of bound");
            return;
        }
        data[index]=num;
    }
}
