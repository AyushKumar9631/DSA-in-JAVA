package InBuiltFxns;

public class Main {
    public static void main(String[] args) throws Stackexception{
//        DynamicStack stack= new DynamicStack(5);
////        CustomStack stack= new CustomStack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        CustomCircularQueue queue= new CustomCircularQueue(5);
//        CustomQueue queue= new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(6);
        queue.display();

    }
}
