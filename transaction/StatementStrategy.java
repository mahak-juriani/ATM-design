package transaction;

import models.ATM;

public class StatementStrategy implements TransactionStrategy {
    @Override
    public void execute(ATM atm) {
        System.out.println(atm.getBankService().getMiniStatement(atm.getCardNo()));
    }
}