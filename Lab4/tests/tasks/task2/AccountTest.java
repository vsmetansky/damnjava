package tasks.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private final Account a = new Account();
    private final double sum = 1000;

    @Test
    public void incomeSuccessTest() {
        assertTrue(a.receiveIncome(sum));
    }

    @Test
    public void incomeNegativeTest() {
        assertFalse(a.receiveIncome(-sum));
    }

    @Test
    public void withdrawalNegativeTest() {
        assertFalse(a.performWithdrawal(-sum));
    }

    @Test
    public void withdrawalExceedsTest() {
        assertFalse(a.performWithdrawal(sum * 2));
    }

    @Test
    public void withdrawalSuccessTest() {
        assertTrue(a.performWithdrawal(sum / 2));
    }


    @Test
    public void paymentNegativeTest() {
        assertFalse(a.performPayment(-sum));
    }


    @Test
    public void paymentExceedsTest() {
        assertFalse(a.performPayment(sum * 2));
    }

    @Test
    public void paymentSuccessTest() {
        assertTrue(a.performPayment(sum / 2));
    }

    @Test
    public void balanceTest() {
        assertEquals(0, a.getBalance());
    }
}
