package Semana03.Company.hr;

import java.security.PublicKey;

public class Employee {
    public String name;
    private double salary;
    private double amount;
    protected String role;
    


    public void showInfo() {
        System.out.println("Empleado: " + name);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Ingrese un nombre!");
        }
    }

    public String getName() {
        return name;
    }

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

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary = salary += amount;
        } else {
            System.out.println("Ingrese un monto positivo!");
        }
    }

    public void setRole(String role) {
        if (role != null) {
            this.role = role;
        } else {
            System.out.println("Ingresa un rol!");
        }
    }

    public String getRole() {
        return role;
    }

}
