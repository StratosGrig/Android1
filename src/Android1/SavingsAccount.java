package Android1;

public class SavingsAccount extends Account {

    private double chargingThreshold;

    public SavingsAccount(String accountNumber, double initialBalance, double chargingThreshold) {
        super(accountNumber, initialBalance);
        this.chargingThreshold = chargingThreshold;
    }

    @Override
    public double getWithdrawCost(double amount) {
        if (getBalance() > chargingThreshold)
            return 0.1;
        else
            return amount * 0.047;
    }
}
