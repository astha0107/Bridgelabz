package oops;

public class ans2 {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.display();

        Circle customCircle = new Circle(5.5);
        customCircle.display();
    }
}
class Circle {
    double radius;

    
    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
    }
}
