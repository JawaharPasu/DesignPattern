package com.jawa.structural.command;

public class BankAccount {
    private int balance;
    private int withdrawalLimit = -500;

    public void deposit(int amount){
        balance +=amount;
        System.out.println("Deposited : "+ amount
                + " and the remaining balance is: " + balance );
    }

    public boolean withdrawal(int amount) {
        if(balance - amount >=withdrawalLimit) {
            balance -=amount;
            System.out.println("Withdrew : "+ amount
                    + " and the remaining balance is: " + balance );
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", withdrawalLimit=" + withdrawalLimit +
                '}';
    }
}
