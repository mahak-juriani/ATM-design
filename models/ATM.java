package models;

import bank.BankFactory;
import bank.BankService;
import state.*;
import transaction.TransactionStrategy;

public class ATM {
    private ATMState state = new IdleState();
    private String cardNo;
    private BankService bankService;
    private final BankFactory bankFactory = new BankFactory();

    public void setState(ATMState s) { state = s; }
    public void setCardNo(String c) { cardNo = c; }
    public String getCardNo() { return cardNo; }
    public void setBankService(BankService s) { bankService = s; }
    public BankService getBankService() { return bankService; }
    public BankFactory getBankFactory() { return bankFactory; }
    public void reset() { state = new IdleState(); cardNo=null; bankService=null; }

    // delegate to state
    public void insertCard(String c) { state.insertCard(this, c); }
    public void enterPin(String p) { state.enterPin(this, p); }
    public void selectTransaction(TransactionStrategy tx) { state.selectTransaction(this, tx); }
    public void ejectCard() { state.ejectCard(this); }
}
