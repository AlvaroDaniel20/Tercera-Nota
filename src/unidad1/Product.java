package unidad1;

public class Product {

    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
    }

    void sell(int amount) {
        System.out.println();
        if (quantity >= amount) {
             quantity -= amount;
            System.out.println("Producto: " + name + " | Cantidad: " + amount + " | Precio unitario: " + price + " | Precio total: " + price * amount);
        } else {
            System.out.println("No tenemos esa cantidad de producto disponible, tenemos: " + quantity + " " +  name);
        }
       
    }

    void restock (int amount) {
        System.out.println();
        quantity += amount;
        System.out.println("Cantidad añadida: " + amount + " | Cantidad Total: " + quantity);
    }

    public void showProduct() {
        System.out.println();
        System.out.println("----- Informacion del producto-----");
        System.out.println("Nombre: " + name);
        System.out.println("Precio: " + price);
        System.out.println("Cantidad: " + quantity);
        System.out.println();
    }
}
