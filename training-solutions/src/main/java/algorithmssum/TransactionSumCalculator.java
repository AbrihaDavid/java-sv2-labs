package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions){

        int sum = 0;
        for (Transaction s: transactions){
            if (s.getTransactionOperation().equals(TransactionOperation.CREDIT)){
                sum += s.getAmount();
            }
        }
        return sum;
    }
}
