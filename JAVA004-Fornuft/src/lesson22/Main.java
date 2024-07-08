package lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", 45.00, 2008));
        books.add(new Book("Clean Code", "Robert C. Martin", 50.00, 2008));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 55.00, 1999));
        books.add(new Book("Design Patterns", "Erich Gamma", 40.00, 1994));

        Collections.sort(books);

        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }

        books.sort(new PriceAndYearComparator());

        System.out.println("\nBooks sorted by price and publication year:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class PriceAndYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int priceComparison = Double.compare(b1.getPrice(), b2.getPrice());
        if (priceComparison == 0) {
            return Integer.compare(b1.getPublicationYear(), b2.getPublicationYear());
        } else {
            return priceComparison;
        }
    }
}

//.