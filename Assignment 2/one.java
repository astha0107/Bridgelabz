// public class one{
//     public static void main(String[] args) {
//         Car c1=new Car();
//         c1.model="xuv 500";
//         c1.year=2000;
//         System.out.println("model of car is "+c1.model+" and year is "+c1.year);
//         // System.out.println("num of cars created are "+Car.numofcars);
//     }
// }

// class Car{
//     String model;
//     int year;
//     // static int numofcars=0;
//     // Car(String model,int year){
//     //     this.model=model;
//     //     this.year=year;
//     //     numofcars++;
//     // }
// }

// ques 2
// public class one {
//     public static void main(String[] args) {
//         Car c1=new Car("xuv 500",2000);
//         Car c2=new Car("dezire swift",2015);
//         System.out.println("cars created are "+Car.numofcars);
//     }
    
// }
// class Car{
//     String model;
//     int year;
//     static int numofcars=0; //this will increment
//     Car(String model, int year){
//         this.model=model;
//         this.year=year;
//         numofcars++;
//     }
// }

// ques 3
// public class one{
//     public static void main(String[] args) {
//         Demo d= new Demo();
//         d.check();
//     }
// }
// class Demo{
//     void check(){
//         int a=20; //local variable
//         System.out.println("local variable is "+a);
//     }
// }

// ques 4
// public class one{
//     public static void main(String[] args) {
//         Student s1=new Student("Astha", 50);
//         Student s2=new Student("Asha", 40);
//         System.out.println("Name of student 1 is "+s1.name+" marks scored are "+s1.marks);
//         System.out.println("Name of student 2 is "+s2.name+" marks scored are "+s2.marks);


//     }
// }

// class Student{
//     String name;
//     int marks;
//     Student(String name, int marks){
//         this.name=name;
//         this.marks=marks;
//     }
// }

// ques 5
// public class one {

//     public static void main(String[] args) {
//         New n1=new New();
//         n1.a=20;
//         New n2=new New();
//         System.out.println("n2 sees count as: "+n2.a);
//     }
// }
// class New{
//      static int a=0;
// }


// ques 6
// public class one{
//     public static void main(String[] args) {
//         Demo d=new Demo();
//         d.setvalue(56);
//         d.show();
//     }
// }
// class Demo{
//     int value;
//     void setvalue(int value){
//         this.value=value;
//     }
//     void show(){
//         System.out.println("instance variable is "+value);
//     }
// }

// ques 7
// public class one {
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.x=20;
//     }
// }
// class Test{
//     final int x=80;
// }
// //here compilation problem is that final feild Test.x cannot be resolved.

// ques 8
// class Demo{
//     static int x;
//     static{
//         x=89;
//         System.out.println("static block is executed");
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         System.out.println("value of x "+Demo.x);
//     }
// }


// ques 9
// class Acc{
//     String accHolder;
//     double balance;
// }
// public class one{
//     public static void main(String[] args) {
//         Acc a=new Acc();
//         System.out.println("Holder: "+a.accHolder);
//         System.out.println("balance: "+a.balance);
//     }
// }


// ques 10
// class Variables{
//     int instancevar=20;
//     static int staticvar=40;
//     void show(){
//         int local=90;
//         System.out.println("instancevar: "+instancevar);
//         System.out.println("staticvar: "+staticvar);
//         System.out.println("local: "+local);
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         Variables v=new Variables();
//         v.show();
//     }
// }


// ques 11
// class Test{
//     static int x;
// }
// public class one{
//     public static void main(String[] args) {
//         System.out.println("before value "+Test.x);
//         Test.x=90;
//         System.out.println("after value "+Test.x);
//     }
// }


// ques12
// class Demo{
//     final int userid;
//     Demo(int id){
//         userid=id;
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         Demo d=new Demo(100);
//         System.out.println("user id is "+d.userid);
//     }
// }


// ques 13
// class A{
//     static int x=90;
// }
// class B{
//     void change(){
//         A.x=89;
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         B b=new B();
//         b.change();
//         System.out.println(A.x);
//     }
// }


// ques 14
// class Test{
//     String name;
//     void check(String name){
//         this.name=name;
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         Test t =new Test();
//         t.check("astha");
//         System.out.println("name is "+t.name);
//     }
// }


// ques 15
// class Demo{
//     int val;
//     void setVal(int v){
//         val =v;
//     }
//     void showVal(){
//         System.out.println("value "+val);
//     }
// }
// public class one{
//     public static void main(String[] args) {
//         Demo d=new Demo();
//         d.setVal(78);
//         d.showVal();
//     }
// }


// ques 16
public class one{
    public static void main(String[] args){
        int x;
        System.out.println(x);
    }
}