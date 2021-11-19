package algorithmscount;

import java.util.List;

public class TransactionCounter {

    public int testCountEntryLessThan(List<Transaction> transactionList, int maxAmount){
        int counter = 0;
        for (Transaction t: transactionList){
            if (t.getTransactionType() == TransactionType.CREDIT && t.getAmount() < maxAmount){
                counter++;
            }
        }
        return counter;
    }
}
