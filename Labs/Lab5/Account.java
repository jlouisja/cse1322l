package Labs.Lab5;
public class Account {
    // 3 fields
    public int accountNumber;
    static int nextNumber = 1001;
    public double accountBalance;

    // contructors
    public Account() {
        this.accountNumber = nextNumber++;
        this.accountBalance = 0.0;
    }

    public Account(double accountBalance) {
        this.accountNumber = nextNumber++;
        this.accountBalance = accountBalance;
    }

    // mutators - setters
    public double withdraw(double amount) {
        this.accountBalance -= amount;
        return this.accountBalance;
    }

    public double deposit(double amount) {
        this.accountBalance += amount;
        return this.accountBalance;
    }

    // accessors - getters
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    // toString override method
    public String toString() {
        return "Account Number: " + this.accountNumber + ", Account Balance: " + this.accountBalance;
    }

}
