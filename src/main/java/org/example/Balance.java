package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Balance {
    public int balanceAmount;
    int sum;
    private final Lock lock = new ReentrantLock();

    public Balance() {

    }

    public void setDeposit(String accountName, int depositAmount, Balance balance) {
        lock.lock();
        try {
            balance.sum = balance.sum + depositAmount;
            System.out.printf("AccountOwner %s deposits $%-30s", accountName, depositAmount);
            System.out.printf("Balance: $%-10s\n", sum);
            balance.balanceAmount = sum;
        } finally {
            lock.unlock();
        }

    }

    public void getWithdrawal(String accountName, int withdrawalAmount) {
        lock.lock();
        try {
            if (withdrawalAmount % 10 != 0) {
                System.out.printf("AccountOwner %s withdraws $%-5s - amount - must be in multiples of 10.\n", accountName, withdrawalAmount);
            } else if (withdrawalAmount > this.sum) {
                System.out.printf("AccountOwner %s withdraws $%-5s - BLOCKED - Insufficient Funds.\n", accountName, withdrawalAmount);
            } else {
                this.sum = this.sum - withdrawalAmount;
                System.out.printf("AccountOwner %s withdraws $%-29s", accountName, withdrawalAmount);
                System.out.printf("Balance: $%-10s\n", this.sum);
                this.balanceAmount = this.sum;
            }
        } finally {
            lock.unlock(); // unlock this object
        }
    }
}