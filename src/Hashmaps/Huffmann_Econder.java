package Hashmaps;

import Trees.Heap.Heap; //created previously in heap lectures
import java.util.*;

public class Huffmann_Econder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable <Node> {
        char data;
        int cost;
        Node left;
        Node right;

        Node(char data, int cost){
            this.data=data;
            this.cost=cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost-o.cost;
        }
    }

    public Huffmann_Econder(String feeder) throws Exception{

        //create frequency map
        HashMap<Character, Integer> fMap= new HashMap<>();
        for(int i=0; i<feeder.length(); i++){
            char ch= feeder.charAt(i);
            fMap.put(ch, fMap.getOrDefault(ch,0)+1);
        }

        //create a min heap
        Heap<Node> minHeap= new Heap<>();
        for(Character i: fMap.keySet()){
            Node node =new Node(i,fMap.get(i));
            minHeap.insert(node);
        }

        //construct tree
        while(minHeap.size()!=1){
            Node first= minHeap.remove();
            Node second= minHeap.remove();
            Node newNode= new Node('\0', first.cost+ second.cost);
            newNode.left=first;
            newNode.right=second;
            minHeap.insert(newNode);
        }

        Node root=minHeap.remove();
        this.encoder= new HashMap<>();
        this.decoder= new HashMap<>();
        fillEncodeDecoder(root,"");
    }

    private void fillEncodeDecoder(Node node, String output){
        if(node==null) return;

        if(node.data!='\0'){
            encoder.put(node.data, output);
            decoder.put(output, node.data);
        }

        fillEncodeDecoder(node.left,output+"0");
        fillEncodeDecoder(node.right, output+"1");
    }

    public String encode(String s){
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            ans.append(encoder.get(s.charAt(i)));
        }
        return ans.toString();
    }

    public String decode(String s){
        StringBuilder ans= new StringBuilder();
        String key="";
        for(int i=0; i<s.length(); i++){
            key+=s.charAt(i);
            if(decoder.containsKey(key)){
                ans.append(decoder.get(key));
                key="";
            }
        }
        return ans.toString();
    }
}
