package Semana01;

public class App {


    
    public static class BankAccount {
        // Atributos
        private String owner;
        private String accountNumber;
        private double balance;

        // Metodos
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposito: " + amount + "  | nuevo balance: " + balance);
            System.out.println();

            
        }

        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro: " + amount + "  | nuevo balance: " + balance);
                System.out.println();
            } else {
                System.out.println("No tiene fondos suficientes!");
            }
        }

        void showBalance() {
            System.out.println("Su balance es de: " + balance);
        }

    }



    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.owner = "Alvaro";
        account1.accountNumber = "004020";
        account1.balance = 2000000;

       


        System.out.println("Bienvenido " + account1.owner);
        System.out.println("Numero de cuenta: " + account1.accountNumber);
        System.out.println("Balance: " + account1.balance);
        System.out.println();

        account1.deposit(5000000);

        account1.withdraw(40000);
        
        account1.showBalance();
    }
}