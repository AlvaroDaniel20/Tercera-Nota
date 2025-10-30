package unidad4.actividad1;

public class Motorcycle extends Vehicle{
    private boolean helmet;

    public Motorcycle(String brand, int speed, boolean helmet) {
        super(brand, speed);
        this.helmet = helmet;
    }
    
    public void makeWheelie() {
        if (helmet) {
            System.out.println("Esta haciendo un wheelie con casco puesto!");
        } else {
            System.out.println("No es seguro hacer un wheelie sin casco!");
        }
    }

    @Override

     public void accelerate(int increment) {
        speed += increment;
        System.out.println("La moto " + brand + " acelera a: " + speed + "km/h");
    }

}
