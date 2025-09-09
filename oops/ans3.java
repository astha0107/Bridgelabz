package oops;

public class ans3 {
    public static void main(String[] args) {
        Person original = new Person("Alia", 45);
        Person copy = new Person(original);

        original.display();
        copy.display();
    }
}
class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
