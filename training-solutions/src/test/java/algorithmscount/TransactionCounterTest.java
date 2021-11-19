package algorithmscount;

import org.junit.jupiter.api.Test;
import training.Tr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCountEntryLessThan() {

        List<Transaction> transactionList = Arrays.asList(
                new Transaction(TransactionType.DEBIT,300),
                new Transaction(TransactionType.CREDIT,150),
                new Transaction(TransactionType.DEBIT,10),
                new Transaction(TransactionType.CREDIT,200));

        assertEquals(1,new TransactionCounter().testCountEntryLessThan(transactionList,200));
    }
}