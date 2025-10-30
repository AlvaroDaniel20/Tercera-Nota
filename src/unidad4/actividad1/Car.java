package unidad4.actividad1;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
    super(brand, speed);
    this.doors = doors;

    }


    public void opendoors() {
        System.out.println("El carro " + brand + " abre sus: " + doors + " puertas");

    }

    @Override

     public void accelerate(int increment) {
        speed += increment;
        System.out.println("El carro " + brand + " acelera a: " + speed + "km/h");
    }
}
