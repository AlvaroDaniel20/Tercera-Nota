package unidad4.actividad1;

public class Main {
    public static void main(String[] args) {
        Car carro1 = new Car("Lambargambar", 150, 2);
        Motorcycle moto1 = new Motorcycle("BMW", 100, false);

        carro1.accelerate(60);
        carro1.opendoors();
        carro1.brake();

        System.out.println();

        moto1.accelerate(80);
        moto1.makeWheelie();
        moto1.brake();
    }
}
