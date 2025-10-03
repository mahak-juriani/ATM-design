package state;

import models.ATM;
import transaction.TransactionStrategy;

public interface ATMState {
    void insertCard(ATM atm, String cardNo);
    void enterPin(ATM atm, String pin);
    void selectTransaction(ATM atm, TransactionStrategy tx);
    void ejectCard(ATM atm);
}