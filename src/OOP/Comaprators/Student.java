package OOP.Comaprators;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student( int roll_no, float marks) {
        this.marks = marks;
        this.roll_no = roll_no;
    }

    public String toString(){
        return roll_no+" "+marks;
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }
}
