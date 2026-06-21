// Base Class
class BankAccounts {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccounts(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount: ₹" + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Check Balance Method
    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccounts {
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Apply Interest Method
    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: ₹" + interest);
    }

    // Display Account Details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main Class
public class BankAccount {
    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(101, "Bhawna", 10000, 5);

        account.displayDetails();

        account.deposit(2000);
        account.withdraw(1500);

        account.checkBalance();

        account.applyInterest();

        account.checkBalance();
    }
}