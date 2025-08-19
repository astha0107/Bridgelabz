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
public class one {
    public static void main(String[] args) {
        Car c1=new Car("xuv 500",2000);
        Car c2=new Car("dezire swift",2015);
        System.out.println("cars created are "+Car.numofcars);
    }
    
}
class Car{
    String model;
    int year;
    static int numofcars=0; //this will increment
    Car(String model, int year){
        this.model=model;
        this.year=year;
        numofcars++;
    }
}