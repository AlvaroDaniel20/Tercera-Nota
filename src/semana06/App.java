package semana06;

import java.util.ArrayList;
import java.util.HashMap;

import semana06.utils.Product;
import semana06.utils.Student;
import semana06.utils.Employee;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("PC Power", 5200));
        products.add(new Product("Mouse Gamer", 125));
        products.add(new Product("Teclado Gamer RGB", 280));
        products.add(new Product("Monitor 24\"", 799));
        products.add(new Product("Silla Ergonomica", 950));

        System.out.println("Productos:");
        for (Product p : products) {
            p.showInfo();
        }

        System.out.println();


        



    }
}
