package state;
import models.ATM;
import transaction.TransactionStrategy;

public class AuthenticatedState implements ATMState {
    public void insertCard(ATM atm, String cardNo) { }
    public void enterPin(ATM atm, String pin) { }
    public void selectTransaction(ATM atm, TransactionStrategy tx) {
        tx.execute(atm);
    }
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.reset();
    }
}