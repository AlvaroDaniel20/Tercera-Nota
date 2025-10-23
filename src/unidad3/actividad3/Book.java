package unidad3.actividad3;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return title + "," + author + "," + price;
    }



    public static Book fromString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            String title = parts[0];
            String author = parts[1];
            double price = Double.parseDouble(parts[2]);
            return new Book(title, author, price);
        }
        return null;
    }
}
