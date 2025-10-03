import models.ATM;
import transaction.ChangePinStrategy;
import transaction.DepositStrategy;
import transaction.StatementStrategy;
import transaction.WithdrawStrategy;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard("123456");          
        atm.enterPin("1234");
        atm.selectTransaction(new WithdrawStrategy(500));
        atm.selectTransaction(new StatementStrategy());
        atm.ejectCard();

        atm.insertCard("987654");          
        atm.enterPin("4321");
        atm.selectTransaction(new DepositStrategy(1000));
        atm.selectTransaction(new ChangePinStrategy("4321", "1111"));
        atm.ejectCard();
    }
}

