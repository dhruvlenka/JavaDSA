package CollectionFramework.List.ComparableComparator;

import java.util.*;

// Book class implements Comparable interface
class Book implements Comparable<Book> {
    final private String title;
    final private String author;
    final private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter for price (used in compareTo)
    public double getPrice() {
        return price;
    }

    // Implement compareTo to sort books by price
    @Override
    public int compareTo(Book book) {
        return Double.compare(this.price, book.price);
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return title + " by " + author + " - ₹" + price;
    }
}

public class ComparableSortByInt {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Atomic Habits", "James Clear", 499));
        books.add(new Book("The Alchemist", "Paulo Coelho", 299));
        books.add(new Book("Deep Work", "Cal Newport", 399));
        books.add(new Book("Zero to One", "Peter Thiel", 599));

        System.out.println("Before Sorting:");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books); // Uses compareTo method

        System.out.println("\nAfter Sorting by Price (Low to High):");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}