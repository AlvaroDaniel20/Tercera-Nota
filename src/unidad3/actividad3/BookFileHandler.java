package unidad3.actividad3;

import java.io.*;
import java.util.*;

public class BookFileHandler {
    private static final String FILE_NAME = "books.txt";

    public void saveBooks(List<Book> books) {
        // try-with-resources automatically closes streams
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
            System.out.println("Libros guardados de manera correcta");
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error escribiendo en el archivo: " + e.getMessage());
            System.out.println();
        } finally {
            System.out.println("Operacion terminada (Guardar libros)");
            System.out.println();
        }
    }

    public void readBooks() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.err.println("Archivo no encontrado: " + FILE_NAME);
            System.out.println();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Libros leidos de archivo:");
            System.out.println();
            while ((line = reader.readLine()) != null) {
                Book book = Book.fromString(line);
                if (book != null) {
                    System.out.println("Titulo: " + book.getTitle() + " | Autor: " + book.getAuthor() + " | Precio: $" + book.getPrice());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Operation finished (readBooks).");
        }
    }
}
