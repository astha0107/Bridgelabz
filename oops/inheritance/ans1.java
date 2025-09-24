package oops.inheritance;

public class ans1 {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}