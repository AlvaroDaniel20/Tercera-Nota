

public class Employee {
    public String name;
    private double salary;
    protected String role;


    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("¡El salario no puede ser inferior o igual a 0!");
        }
        
    }

    public double getSalary() {
        return salary;
    }

}
