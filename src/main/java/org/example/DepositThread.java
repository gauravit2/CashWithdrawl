package org.example;

public class DepositThread implements Runnable {

    int depositAmount;
    String accountName;
    Balance balance;


    public DepositThread(String name, Balance balance, int amount) {
        this.accountName = name;
        this.balance = balance;
        this.depositAmount = amount;
    }

    public void run() {
        balance.balanceAmount = depositAmount;
        balance.setDeposit(accountName, depositAmount, balance);
    }
}