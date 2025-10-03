package bank;

public interface BankService {
    boolean authenticate(String cardNo, String pin);
    boolean withdraw(String cardNo, int amount);
    boolean deposit(String cardNo, int amount);
    String getMiniStatement(String cardNo);
    boolean changePin(String cardNo, String oldPin, String newPin);
}