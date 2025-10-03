package bank;

public class BankFactory {
    public BankService getService(String cardNo) {
        if (cardNo.startsWith("1")) return new SBIService();
        return new HDFCService();
    }
}