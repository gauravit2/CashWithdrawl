package org.example;

public class Customer {
    private final String name;
    private final Balance balance = new Balance();

    public Customer(String name) {
        this.name = name;
    }

    public void depositAmount(int amount) {
        new Thread(new DepositThread(name, balance, amount)).start();
    }

    public void cashWithdraw(int amount) {
        new Thread(new WithdrawalThread(name, balance, amount)).start();
    }

    public int getBalanceAmount() {
        return balance.balanceAmount;
    }


}
