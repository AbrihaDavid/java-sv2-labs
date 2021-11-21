package algorithmsdecision.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw (int amount){
        balance = balance - amount;
    }

    public void deposit (int amount){
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}
