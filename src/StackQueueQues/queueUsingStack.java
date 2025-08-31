package StackQueueQues;

import java.util.Stack;
//remove efficient queue using stack
public class queueUsingStack {
    Stack<Integer> data;
    public queueUsingStack() {
        data=new Stack<>();
    }

    public void push(int x) {
        if(empty()){
            data.push(x);
            return;
        }
        data=reverse(data);
        data.push(x);
        data=reverse(data);
    }

    public int pop() {
        return data.pop();
    }

    public int peek() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }

    public Stack<Integer> reverse(Stack<Integer> stack){
        Stack<Integer> rev= new Stack<>();
        while(stack.empty()){
            rev.push(stack.pop());
        }
        return rev;
    }
}
