class BankAccount {
    public int accountNumber;       // Public
    protected String accountHolder; // Protected
    private double balance;         // Private

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for private balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// Subclass demonstrating access
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        // Accessing public (accountNumber) and protected (accountHolder)
        System.out.println("Savings Account No: " + accountNumber + ", Holder: " + accountHolder +
                           ", Interest Rate: " + interestRate + "%");
    }
}
