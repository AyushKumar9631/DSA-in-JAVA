package Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_Chain <K,V>{

    ArrayList<LinkedList<Entity>> list;
    private int size=0;
    private float lf=0.5f;

    public HashMap_Chain(){
        list= new ArrayList<>();
        for(int i=0;i<10; i++){
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int hash= Math.abs(key.hashCode()% list.size());

        LinkedList<Entity> entities= list.get(hash);
        for(Entity E:entities){
            if(E.key.equals(key)){
                E.val=value;
                return;
            }
        }

        if((float)(size)/ list.size()>lf){
            reHash();
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old= list;
        list= new ArrayList<>();
        size=0;
        for(int i=0; i<old.size(); i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> LL: old){
            for(Entity E: LL){
                this.put(E.key,E.val);
            }
        }
    }

    public V get(K key){
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities= list.get(hash);
        for(Entity E: entities){
            if(E.key.equals(key)) return E.val;
        }
        return null;
    }

    public void remove(K key){
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities= list.get(hash);
        for(Entity E: entities){
            if(E.key.equals(key)){
                entities.remove(E);
                break;
            }
        }
        size--;
    }

    public boolean containsKey(K key){
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities= list.get(hash);
        for(Entity E: entities){
            if(E.key.equals(key)) return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder builder= new StringBuilder();
        builder.append("[");
        for(LinkedList<Entity> LL:list){
            for(Entity E:LL){
                builder.append(" ");
                builder.append(E.key);
                builder.append("=");
                builder.append(E.val);
                builder.append(",");
            }
        }
        builder.replace(builder.length()-1,builder.length()," ]");
        return builder.toString();
    }

    private class Entity{
        K key;
        V val;
        public Entity(K key, V val){
            this.key=key;
            this.val=val;
        }
    }
}
