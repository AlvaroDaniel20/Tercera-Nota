package semana06.utils;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Nombre producto: " + name + " | Precio: " + price);
    }
}

