package question17;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BookAuthorPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        return Double.compare(book2.getPrice(), book1.getPrice());
    }
}


public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 7.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 11.99));

        Collections.sort(books, new BookAuthorPriceComparator());

        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getPrice());
        }
    }
}

