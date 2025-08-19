public class one{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.model="xuv 500";
        c1.year=2000;
        System.out.println("model of car is "+c1.model+" and year is "+c1.year);
    }
}

class Car{
    String model;
    int year;
}