package OOP;

public class InnerClass {
    class Dynamictest{
        String  name;
        public Dynamictest(String name){
            this.name=name;
        }
    }

    static class Statictest{
        String  name;
        public Statictest(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        //doesnt need object of the class
        Statictest a= new Statictest("Ayush");
        Statictest b= new Statictest("Kumal");
        //However this doesnt mean tha values of a and b will be same as class being static means
        // that class statictest will not be bothered by objects of class interface
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
