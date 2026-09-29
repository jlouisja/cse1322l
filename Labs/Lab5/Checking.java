
public class Checking extends Account {
    // Starts empty
    public Checking(double accountBalance) {
        super(accountBalance);
    }
    public double withdraw(double amount) {
        if (this.accountBalance - amount < 0) {
            System.out.println("Charging an overdraft fee of $20 because this account is below $0.");
            this.accountBalance -= amount;
            this.accountBalance -= 20;
        } else {
            this.accountBalance -= amount;
        }
        return this.accountBalance;
    }   
    public String toString() {
        return "Account Number: " + this.accountNumber + ", Account Balance: " + this.accountBalance;
    }
	// Allows unlimited deposits and withdrawals for free.
	// Provides no interest payments.
	// If the account balance drops below $0, the customer is charged a $20 overdraft fee every time they try to withdraw.
    
}
