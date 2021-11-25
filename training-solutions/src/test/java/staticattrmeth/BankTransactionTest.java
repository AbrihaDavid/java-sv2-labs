package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    BankTransaction bankTransaction = new BankTransaction(100);
    BankTransaction bankTransaction_2 = new BankTransaction(1000);
    BankTransaction bankTransaction_3 = new BankTransaction(500);
    BankTransaction bankTransaction_4 = new BankTransaction(400);

    @Test
    void initTheDay() {
        BankTransaction.initTheDay();
        assertEquals(0L, bankTransaction.getTransactionValue());
    }

    @Test
    void getAverageOfTransaction() {
        assertEquals(500,BankTransaction.getAverageOfTransaction());
    }

    @Test
    void getCurrentMaxValueAfterInit() {
        BankTransaction.initTheDay();
        assertEquals(0,BankTransaction.getCurrentMaxValue());
    }

    @Test
    void getCurrentMaxValueAfterTransactions(){
        assertEquals(1000,BankTransaction.getCurrentMaxValue());
    }
}