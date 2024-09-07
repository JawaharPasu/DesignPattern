package com.jawa.structural.command;

public class BankAccountCommand implements Command{
    private BankAccount bankAccount;
    private Action action;
    private int amount;
    private boolean succeeded;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }


    @Override
    public void call() {
        switch (action) {
            case DEPOSIT -> {
                succeeded = true;
                bankAccount.deposit(amount);
            }
            case WITHDRAW -> succeeded = bankAccount.withdrawal(amount);
        }
    }

    @Override
    public void undo() {
        if (!succeeded) return;
        switch (action) {
            case WITHDRAW -> bankAccount.deposit(amount);
            case DEPOSIT -> bankAccount.withdrawal(amount);
        }
    }


}
