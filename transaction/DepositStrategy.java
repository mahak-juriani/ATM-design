package transaction;

import models.ATM;

public class DepositStrategy implements TransactionStrategy {
    private final int amount;
    public DepositStrategy(int amt) { this.amount = amt; }
    @Override
    public void execute(ATM atm) {
        if (atm.getBankService().deposit(atm.getCardNo(), amount)) {
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Deposit failed.");
        }
    }
}