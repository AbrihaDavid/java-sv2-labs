package algorithmssum;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }
}
