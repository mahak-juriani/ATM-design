package transaction;

import models.ATM;

public class WithdrawStrategy implements TransactionStrategy {
    private final int amount;
    public WithdrawStrategy(int amt) { this.amount = amt; }
    @Override
    public void execute(ATM atm) {
        if (atm.getBankService().withdraw(atm.getCardNo(), amount)) {
            System.out.println("Dispensed " + amount);
        } else {
            System.out.println("Withdraw failed.");
        }
    }
    
}