package org.example;

public class WithdrawalThread implements Runnable {

    int WithdrawalAmount;
    String accountOwner;
    Balance balance;

    public WithdrawalThread(String name, Balance balance, int amount) {
        accountOwner = name;
        this.balance = balance;
        this.WithdrawalAmount = amount;
    }

    public void run() {
        balance.balanceAmount = WithdrawalAmount;
        balance.getWithdrawal(accountOwner, WithdrawalAmount);
    }
}