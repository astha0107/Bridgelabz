package oops;

public class ans6 {
    public static void main(String[] args) {
         CarRental rental = new CarRental("ram", "SUV", 4);
        rental.display();
    }
}
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 50.0; 

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
