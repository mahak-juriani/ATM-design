package bank;

public class SBIService implements BankService {
    public boolean authenticate(String c, String p) { return p.equals("1234"); }
    public boolean withdraw(String c, int amt) { return true; }
    public boolean deposit(String c, int amt) { return true; }
    public String getMiniStatement(String c) { return "SBI Mini-statement"; }
    public boolean changePin(String c, String o, String n) { return true; }
}