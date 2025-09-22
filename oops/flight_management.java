package oops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class flight_management {
    public static void main(String[] args) {
        
    }
}
class Flights{
    private String flight_id;
    private String source;
    private String destination;
    private Date date;
    private int capacity;
    List<Bookings>booking;

    Flights( String flight_id,
    String source,
    String destination,
    Date date,
    int capacity){
        this.flight_id=flight_id;
        this.source=source;
        this.destination=destination;
        this.date=date;
        this.capacity=capacity;
        this.booking=new ArrayList<>();
    }
    public String getflight_id(){
        return flight_id;
    }
    public String getdestination(){
        return destination;
    }
    public Date getdate(){
        return date;
    }
    public int capacity(){
        return capacity;
    }
    public void addbooking(Bookings b){
        booking.add(b);
    }
}
class Bookings{
    private String booking_id;
    private String flight_id;
    private String passenger_id;
    Bookings(String booking_id,
     String flight_id,
     String passenger_id){
        this.booking_id=booking_id;
        this.flight_id=flight_id;
        this.passenger_id=passenger_id;
    }
    public String getbooking_id(){
        return booking_id;
    }
    public String getflight_id(){
        return flight_id;
    }
    public String getpassenger_id(){
        return passenger_id;
    }
}

class Passengers{
    private String passenger_id;
    private String name;
    List<Bookings>booking;
    Passengers(String passenger_id,String name){
        this.passenger_id=passenger_id;
        this.name=name;
        this.booking=new ArrayList<>();
    }
    public String getpassenger_id(){
        return passenger_id;
    }
    public String getname(){
        return name;
    }

    public void addbooking(Bookings b){
        booking.add(b);
    }
    public int bookingcount(){
        return booking.size();
    }
}

class Reservationsys{
    List<Flights>flights=new ArrayList<>();
    List<Passengers>passengers=new ArrayList<>();
    List<Bookings>bookings=new ArrayList<>();

    //flight add
    public void addflight(Flights flight){
        flights.add(flight);
    }
    //add passenger
    public void addpassen(Passengers passenger){
        passengers.add(passenger);
    }

    //booking
public void book(String booking_id, Flights flight, Passengers passenger) {
    Bookings booking = new Bookings(booking_id, flight.getflight_id(), passenger.getpassenger_id());
    bookings.add(booking);
    flight.addbooking(booking);
    passenger.addbooking(booking);
}

// 1. list flight with passengers booked
public void flightwithpassengercnt(){
    for(Flights f : flights){
        System.out.println("flight " + f.getflight_id() + " booked: " + f.booking.size());
    }
}
//2. show flight with zero booking
    public void zerobooking(){
        for(Flights f:flights){
            if(f.booking.size()==0){
                System.out.println("flight "+f.getflight_id());
            }
        }
    }

}