package transaction;

import models.ATM;

public class ChangePinStrategy implements TransactionStrategy {
    private final String oldPin, newPin;
    public ChangePinStrategy(String oldPin, String newPin) {
        this.oldPin = oldPin; this.newPin = newPin;
    }
    public void execute(ATM atm) {
        if (atm.getBankService().changePin(atm.getCardNo(), oldPin, newPin)) {
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("PIN change failed.");
        }
    }
}