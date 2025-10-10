package semana06.utils;

public class Employee {
    String role;

    public Employee(String role) {
        this.role = role;
    }

    public void showResponsabilities() {
        switch (role) {
            case "Manager":
                System.out.println("Maneja el equipo");
                break;
            case "Developer":
                System.out.println("Programa y Testea");
                break;
            case "Desing":
                System.out.println("Diseña UI/UX");
                break;
            default:
            System.out.println("NO conocido");
                break;
        }
    }
    
}