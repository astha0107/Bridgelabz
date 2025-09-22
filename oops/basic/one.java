package oops.basic;

public class one {
    public static void main(String[] args) {
        student s1=new student("alice", 22, 45.9);
        s1.display();

    }
}
class student{
    String name;
    int rollno;
    double marks;
    //parameterised constructor
    student(String name, int rollno, double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public void display(){
        System.out.println("name is "+name+" roll no. is "+rollno+" marks are "+marks);
    }
}