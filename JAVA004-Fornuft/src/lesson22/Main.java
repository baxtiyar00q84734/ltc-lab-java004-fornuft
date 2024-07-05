package lesson22;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", 45.00));
        books.add(new Book("Clean Code", "Robert C. Martin", 50.00));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 55.00));
        books.add(new Book("Design Patterns", "Erich Gamma", 40.00));

        System.out.println("Books before sorting:");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books);

        System.out.println("\nBooks after sorting:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
