package bank;

public class HDFCService implements BankService {
    public boolean authenticate(String c, String p) { return p.equals("4321"); }
    public boolean withdraw(String c, int amt) { return true; }
    public boolean deposit(String c, int amt) { return true; }
    public String getMiniStatement(String c) { return "HDFC Mini-statement"; }
    public boolean changePin(String c, String o, String n) { return true; }
}