package Semana03.Company.Main;

import Semana03.Company.hr.Employee;

public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName("Carlos");
        employee1.setSalary(1400000);
        employee1.setRole("Auxiliar");

        employee2.setName("Alvaro");
        employee2.setSalary(2300000);
        employee2.setRole("Chef");

        System.out.println();
        System.out.println("Nombre Empleado 1: " + employee1.getName());
        System.out.println("Salario Empleado 1: " + employee1.getSalary());
        System.out.println("Rol Empleado 1: " + employee1.getRole());

        System.out.println();

        System.out.println("Nombre Empleado 2: " + employee2.getName());
        System.out.println("Salario Empleado 2: " + employee2.getSalary());
        System.out.println("Rol Empleado 2: " + employee2.getRole());
        System.out.println();

        employee2.increaseSalary(2000000);
        
        System.out.println("Salario Empleado 2 Acrualizado: " + employee2.getSalary());
    }
}
