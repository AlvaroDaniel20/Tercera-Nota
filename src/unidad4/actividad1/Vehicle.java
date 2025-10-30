package unidad4.actividad1;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " acelera a: " + speed + "km/h");
    }

    public void brake() {
        speed = 0;
        System.out.println(brand + " frena hasta detenerse");
    }
}


