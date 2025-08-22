package OOP.ArrayList_implementation;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) resize();
        data[size++]=num;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void resize(){
        int[] temp= new int[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        if(index>=size || index<0) {
            System.out.println("Arrays out of bound");
            return 0;
        }
        return data[index];
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
