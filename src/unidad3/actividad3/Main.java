package unidad3.actividad3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("El Señor de los Anillos", "Alguien", 10.99));
        books.add(new Book("1984", "George Orwell", 8.99));
        books.add(new Book("Como Cocinar Espagueti", "The Cooking Show", 12.50));

        BookFileHandler handler = new BookFileHandler();

        System.out.println();
        handler.saveBooks(books);
        handler.readBooks();
        System.out.println();
    }
}
