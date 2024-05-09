package org.example;
public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Amit");
        customer1.depositAmount(10);
        customer1.depositAmount(100);
        customer1.depositAmount(500);
        customer1.depositAmount(1000);
        customer1.depositAmount(500);
        customer1.cashWithdraw(500);
        customer1.cashWithdraw(100);
        customer1.cashWithdraw(10);


        Customer customer2 = new Customer("Gaurav");
        customer2.depositAmount(10);
        customer2.depositAmount(100);
        customer2.depositAmount(500);
        customer2.depositAmount(1000);
        customer2.depositAmount(500);
        customer2.cashWithdraw(500);
        customer2.cashWithdraw(1000);
        customer2.cashWithdraw(500);
        customer2.cashWithdraw(100);
        customer2.cashWithdraw(9);
        customer2.cashWithdraw(10);


        Customer customer3 = new Customer("Nitin");
        customer3.depositAmount(10);
        customer3.depositAmount(100);
        customer3.depositAmount(500);
        customer3.depositAmount(1000);
        customer3.depositAmount(500);
        customer3.cashWithdraw(500);
        customer3.cashWithdraw(1000);
        customer3.cashWithdraw(500);
        customer3.cashWithdraw(100);
        customer3.cashWithdraw(200);
        customer3.cashWithdraw(10);
    }
}