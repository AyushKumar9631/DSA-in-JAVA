package OOP.Comaprators;

public class Student implements Comparable<Student> {
    int roll_no;
    float marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        //return difference
        //also this function is used in arrays.sort()
        int diff= (int)(this.marks-o.marks);
        return diff;
    }

    public String toString(){
        return marks+" "+roll_no;
    }
}
