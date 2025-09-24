package oops.inheritance;

public class ans2 {
    public static void main(String[] args) {
        Employee m = new Manager("Aditi", 101, 80000, 10);
        Employee d = new Developer("Bobby", 102, 60000, "Java");
        Employee i = new Intern("Chirag", 103, 20000, "6 months");
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager - Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer - Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    String duration;

    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    @Override
    void displayDetails() {
        System.out.println("Intern - Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + duration);
    }
}