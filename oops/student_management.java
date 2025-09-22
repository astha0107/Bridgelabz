package oops;

import java.util.List;
import java.util.ArrayList;

public class student_management {
    public static void main(String[] args) {
        
    }
}
//this is class for course all bout it and we have accessed them using getter and returned them after using parametrised constructor;
class Course{
    private String courseId;
    private String courseName;
    private int credit;

    public Course(String courseId, String courseName, int credit){
        this.courseId=courseId;
        this.courseName=courseName;
        this.credit=credit;
    }
    public String getcourseId(){
        return courseId;
    }
    public String getcourseName(){
        return courseName;
    }
    public int getcredit(){
        return credit;
    }
}
// enrollment
class enrollment{
    private Course course;
    private double grade;

    public enrollment(Course course, double grade){
        this.course=course;
        this.grade=grade;
    }
    public Course getcourse(){
        return course;
    }
    public double getgrade(){
        return grade;
    }
}
// student class
class student{
    private String studentId;
    private String name;
    private List<enrollment>enrollments;

    public student(String studentId, String name){
        this.studentId=studentId;
        this.name=name;
        this.enrollments=new ArrayList<>();
    }
    public String getstudentId(){
        return studentId;
    }
    public String getname(){
        return name;
    }
    public void enroll(Course course, double grade){
        enrollments.add(new enrollment(course, grade));
    }
    public List<enrollment>getenrollments(){
        return enrollments;
    }

    //gpa calculation
    public double calculateGPA(){
        if(enrollments.isEmpty()) return 0.0;
        double totalPoints=0;
        double totalCredit=0;
        for(enrollment e:enrollments){
            totalPoints+=e.getgrade()*e.getcourse().getcredit();
            totalCredit+=e.getcourse().getcredit();
        }
        return totalPoints/totalCredit;
    }

    //transcript
    public void printTranscript() {
        System.out.println("Transcript for " + name + ":");
        for (enrollment e : enrollments) {
            System.out.println("Course: " + e.getcourse().getcourseName() +
                               ", Grade: " + e.getgrade());
        }
        System.out.println("GPA: " + calculateGPA());
    }
}

//undergrad subclass
class Undergrad extends student{
    public Undergrad(String studentId, String name) {
        super(studentId, name);
        
    }
    @Override
    public double calculateGPA(){
        double totalPoints = 0;
        double totalCredits = 0;
    }
}