package state;
import bank.BankService;
import models.ATM;
import transaction.TransactionStrategy;

public class CardInsertedState implements ATMState {
    public void insertCard(ATM atm, String cardNo) { }
    public void enterPin(ATM atm, String pin) {
        BankService bank = atm.getBankFactory().getService(atm.getCardNo());
        if (bank.authenticate(atm.getCardNo(), pin)) {
            atm.setBankService(bank);
            atm.setState(new AuthenticatedState());
            System.out.println("PIN correct, authenticated.");
        } else {
            System.out.println("Wrong PIN.");
            atm.setState(new IdleState());
        }
    }
    public void selectTransaction(ATM atm, TransactionStrategy tx) { }
    public void ejectCard(ATM atm) { atm.reset(); }
}