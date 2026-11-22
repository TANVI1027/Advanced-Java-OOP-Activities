
class BankAccount {
    String name;
    double balance;

    // Default constructor
    BankAccount() {
        name = "Tanvi";
        balance = 0;
    }

    // Parameterized constructor
    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    // Method overloading
    void deposit(double amount) {
        balance += amount;
    }

    void deposit(double amount, String type) {
        balance += amount;
        System.out.println("Deposit Type: " + type);
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Tanvi", 5000);

        b.deposit(1000);
        b.deposit(500, "Cash");

        b.display();
    }
}

