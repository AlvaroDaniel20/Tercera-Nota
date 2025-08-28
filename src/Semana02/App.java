package Semana02;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("Zapatos", 9.99, 10);
        Product product2 = new Product("Tenis", 25.00, 5);


        System.out.println();

        product1.sell(30);
        
        product1.sell(5);

        product1.restock(50);

        product2.sell(40);

        product2.sell(2);

        product2.restock(30);

        product1.showProduct();

        product2.showProduct();

        System.out.println();
    }
}
