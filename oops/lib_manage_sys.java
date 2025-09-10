package oops;

import java.util.ArrayList;

public class lib_manage_sys {
    public static void main(String[] args) {
        Book book1 = new Book("The Diary of Anne Frank", "Anne Frank");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library1 = new Library("City Central Library");
        Library library2 = new Library("University Library");

        
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);
        library1.displayBooks();
        library2.displayBooks();

        System.out.println("Independent book:");
        book3.displayBook();
    }
}
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}


class Library {
    String name;
    ArrayList<Book> books;

    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}
