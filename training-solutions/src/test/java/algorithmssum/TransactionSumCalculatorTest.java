package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void sumAmountOfCreditEntriesTest() {

        Transaction transaction = new Transaction("12-2",TransactionOperation.CREDIT,200);
        Transaction transaction_two = new Transaction("12-22",TransactionOperation.DEBIT,1);
        Transaction transaction_three = new Transaction("12-222",TransactionOperation.CREDIT,200);
        assertEquals(400, new TransactionSumCalculator().sumAmountOfCreditEntries(Arrays.asList(transaction,transaction_two,transaction_three)));
    }
}