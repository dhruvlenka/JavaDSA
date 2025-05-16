package CollectionFramework.List.ComparableComparator;

import java.util.*;

// Book class implements Comparable interface
class Books implements Comparable<Books> {
    final private String title;
    final private String author;
    final private double price;

    // Constructor
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Implement compareTo to sort books by price
    @Override
    public int compareTo(Books book) {
        return this.title.compareTo(book.title);
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return title + " by " + author + " - ₹" + price;
    }
}

public class ComparableSortByString {
    public static void main(String[] args) {
        List<Books> books = new ArrayList<>();

        books.add(new Books("Atomic Habits", "James Clear", 499));
        books.add(new Books("The Alchemist", "Paulo Coelho", 299));
        books.add(new Books("Deep Work", "Cal Newport", 399));
        books.add(new Books("Zero to One", "Peter Thiel", 599));

        System.out.println("Before Sorting:");
        for (Books book : books) {
            System.out.println(book);
        }

        Collections.sort(books); // Uses compareTo method

        System.out.println("\nAfter Sorting by Price (Low to High):");
        for (Books book : books) {
            System.out.println(book);
        }
    }
}