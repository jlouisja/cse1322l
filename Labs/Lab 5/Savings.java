public class Savings extends Account {
    // integer field to keep track of the number of deposits made
    private int numberOfDeposits = 0;
    
    // overloaded constructor
    public Savings(double accountBalance) {
        super(accountBalance);
    }

    //. withdraw override method
    public double withdraw(double amount) {
        if (this.accountBalance - amount < 500) {
            System.out.println("Charging a $10 fee because this account is below $500.");
            this.accountBalance -= amount;
            this.accountBalance -= 10;
        } else {
            this.accountBalance -= amount;
        }
        return this.accountBalance;
    }

    // deposit override method
    public double deposit(double amount) {
        this.numberOfDeposits++;
        System.out.println("This is deposit number " + this.numberOfDeposits + " to this account.");
        if (this.numberOfDeposits > 5) {
            System.out.println("Charging a $10 fee because this is your 6th deposit.");
            this.accountBalance += amount;
            this.accountBalance -= 10;
        } else {            
            this.accountBalance += amount;
        }
        return this.accountBalance;
    }
    public double addInterest() {
        double interest = this.accountBalance * 0.015;
        System.out.println("Customer has earned $" + interest + " of interest.");
        this.accountBalance += interest;
        return this.accountBalance;
    }
    
    public String toString() {
        return "Account Number: " + this.accountNumber + ", Account Balance: " + this.accountBalance;
    }
    
    // 	Starts with a balance of $500
	// 	Must maintain a $500 balance at all times. Anytime the customer tries to withdraw, if the resulting balance is below $500, they are charged $10.
	// Earns 1.5% interest every year
	// The first 5 deposits are free, after that there is a fee of $10 per deposit.
}
