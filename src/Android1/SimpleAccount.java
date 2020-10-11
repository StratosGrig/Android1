package Android1;

public class SimpleAccount extends Account {

    private double cost;

    public SimpleAccount(String accountNumber, double initialBalance, double cost) {
        super(accountNumber, initialBalance);
        this.cost = cost;
    }

    @Override
    public double getWithdrawCost(double amount) {
        return cost;
    }
}
