package semana05;

public class Car {
    String brand;
    int year;
    
    public Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void ShowInfo() {
        System.out.println("La marca es: " + brand + " El año es: " + year);
    }
}

