package algorithmscount;

public class Transaction {

    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(TransactionType transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}
