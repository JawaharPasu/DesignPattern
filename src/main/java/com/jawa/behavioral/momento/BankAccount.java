package com.jawa.behavioral.momento;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public Momento deposit(int amount) {
        balance += amount;
        return new Momento(balance);
    }

    public void restore(Momento m) {
        balance = m.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
