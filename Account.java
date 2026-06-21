import java.util.ArrayList;

class Accounts {
    int accountNumber;
    String accountHolder;
    double balance;

    Accounts(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    ArrayList<Accounts> accounts = new ArrayList<>();

    void addAccount(Accounts acc) {
        accounts.add(acc);
    }

    void deposit(int accountNumber, double amount) {
        for (Accounts acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    void withdraw(int accountNumber, double amount) {
        for (Accounts acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    void displayAccounts() {
        for (Accounts acc : accounts) {
            acc.display();
            System.out.println();
        }
    }
}

public class Account {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addAccount(new Accounts(101, "Bhawna", 10000));
        bank.addAccount(new Accounts(102, "Angel", 15000));

        bank.deposit(101, 2000);
        bank.withdraw(102, 3000);

        System.out.println("\nAccount Details:");
        bank.displayAccounts();
    }
}