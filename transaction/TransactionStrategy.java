package transaction;

import models.ATM;

public interface TransactionStrategy {
    void execute(ATM atm);
}
