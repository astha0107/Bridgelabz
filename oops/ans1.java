package oops;
public class ans1 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.display();

        Book paramBook = new Book("1984", "George Orwell", 9.99);
        paramBook.display();
    }
    
}
class Book {
    String title;
    String author;
    double price;

    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}
