package staticattrmeth;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10000000;
    private static long countOfTransactions = 0;
    private static long sumOfTransactions = 0;
    private static long currentMinValue = 10000000;
    private static long currentMaxValue = 1;

    private long transactionValue;

    public BankTransaction(long transactionValue){
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE){
            throw new IllegalArgumentException("Transaction value is not between 1 and 10_000_000");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (transactionValue < currentMinValue){
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue){
            currentMaxValue = transactionValue;
        }
    }

    public static void initTheDay(){
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 10000000;
        currentMaxValue = 1;
    }

    public static long getAverageOfTransaction(){
        return countOfTransactions == 0 ? 0 : sumOfTransactions/countOfTransactions;
    }

    public static long getCurrentMinValue(){
        return countOfTransactions == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue(){
        return countOfTransactions == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTransactions(){
        return  sumOfTransactions;
    }

    public long getTransactionValue(){
        return transactionValue;
    }

}
