package state;

import models.ATM;
import transaction.TransactionStrategy;

public class IdleState implements ATMState {
    public void insertCard(ATM atm, String cardNo) {
        atm.setCardNo(cardNo);
        atm.setState(new CardInsertedState());
        System.out.println("Card inserted.");
    }
    public void enterPin(ATM atm, String pin) { }
    public void selectTransaction(ATM atm, TransactionStrategy tx) { }
    public void ejectCard(ATM atm) { }
}