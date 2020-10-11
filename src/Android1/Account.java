package Android1;

public abstract class Account {

    private String accountNumber;
    private double balance;

    public Account(String accNumber) {

        accountNumber = accNumber;
        balance = 0;

    }

    public Account() {
        accountNumber = "abc " + Math.random();
        balance = 0;
    }

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        double cost = getWithdrawCost(amount);
        System.out.println("Withdraw cost = " + cost);

        amount = amount + cost;
        if (balance >= amount) {
            balance -= amount;

        }

        System.out.println("WITHDRAW OF " + amount + ". New balance = " + balance);

    }

    public abstract double getWithdrawCost(double amount);

    @Override
    public String toString() {
        return "Account No " + accountNumber + " Current balance = " + balance;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Account) {
            Account other = (Account) obj;
            if (this.hashCode() == other.hashCode()) ;
        }
        return false;
    }
}
