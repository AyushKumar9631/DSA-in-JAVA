package OOP;

public class Students {
    String name;
    int roll;
    public Students(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    public String toString(){
        return "name:"+ name+"\n"+"Roll no."+roll;
    }

}

 class driver{
     public static void main(String[] args) {
         Students ayush= new Students("Ayush", 9631);
         System.out.println(ayush);
     }
}
