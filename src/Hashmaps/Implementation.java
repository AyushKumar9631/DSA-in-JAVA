package Hashmaps;

import javax.swing.text.html.parser.Entity;

public class Implementation {
    private Entity[] entities;

    public Implementation(){
        entities= new Entity[100];
    }

    public void put(String key, String val){
        int hash= Math.abs(key.hashCode()%entities.length);
        entities[hash]= new Entity(key,val);
    }

    public String get(String key){
        int hash= Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)) return entities[hash].value;
        return null;
    }

    public void remove(String key){
        int hash= Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)) entities[hash]=null;
    }

    private class Entity{
        String key;
        String value;
        public Entity(String key, String val){
            this.key=key;
            value=val;
        }
    }
}
