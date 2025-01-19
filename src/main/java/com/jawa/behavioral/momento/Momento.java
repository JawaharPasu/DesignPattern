package com.jawa.behavioral.momento;

public class Momento {
    private int balance;

    public Momento(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Momento{" +
                "balance=" + balance +
                '}';
    }
}
