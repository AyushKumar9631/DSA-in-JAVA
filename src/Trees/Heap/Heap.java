package Trees.Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list= new ArrayList<>();
    }

    public Heap(ArrayList<T> data){
        list=data;
        for(int i=list.size()/2+1; i>0; i--){
            downheap(i);
        }
    }

    private void swap(int i, int j){
        T temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    private int parent(int i){
        return (i-1)/2;
    }
    private int left(int i){
        return 2*i+1;
    }
    private int right(int i){
        return 2*i+2;
    }

    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }
    private void upheap(int cur){
        if(cur==0) return;
        int p=parent(cur);
        if(list.get(cur).compareTo(list.get(p))<0){
            swap(cur,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()) throw new Exception("Can't remove from empty Heap");
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if(!list.isEmpty()){
           list.set(0,last);
           downheap(0);
        }
        return temp;
    }
    public void downheap(int in){
        int min=in;
        int l=left(in);
        int r=right(in);
        if(l<list.size() && list.get(min).compareTo(list.get(l))>0) min=l;
        if(r<list.size() && list.get(min).compareTo(list.get(r))>0) min=r;

        if(min!=in){
            swap(min,in);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data= new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
