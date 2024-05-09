import org.example.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTests {

    @Test
    public void testWithdrawCash() throws InterruptedException {

        Customer customer1 = new Customer("Amit");
        customer1.depositAmount(10);
        customer1.depositAmount(100);
        customer1.cashWithdraw(100);
        customer1.cashWithdraw(10);

        Thread.sleep(1000);
        Assertions.assertEquals(customer1.getBalanceAmount(), 0);
    }

    @Test()
    public void testWithdrawAmountNotValid() {
        Customer customer1 = new Customer("Gaurav");
        customer1.depositAmount(10);
        customer1.depositAmount(100);
        customer1.cashWithdraw(100);
        customer1.cashWithdraw(9);
        Assertions.assertNotEquals(customer1.getBalanceAmount(), 0);
    }

    @Test()
    public void testWithdrawAmountInsufficientFund() {
        Customer customer1 = new Customer("Nitin");
        customer1.depositAmount(10);
        customer1.depositAmount(100);
        customer1.cashWithdraw(100);
        customer1.cashWithdraw(200);
        Assertions.assertNotEquals(customer1.getBalanceAmount(), 0);
    }
}
