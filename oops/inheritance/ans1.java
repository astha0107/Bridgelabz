package oops.inheritance;

public class ans1 {
    public static void main(String[] args) {
        
    }
}
class Animal{
    private String name;
    private int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getString(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void  makeSound(){
        System.out.println("make sound by different animals ");
    }
}