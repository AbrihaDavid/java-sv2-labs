package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify the name of the owner: ");
        String owner = sc.nextLine();

        System.out.println("Please specify the owner's account number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Please specify the account's balance: ");
        int balance = sc.nextInt();

        BankAccount account = new BankAccount(accountNumber,owner,balance);


        System.out.println(account.getInfo());

        System.out.println("Please specify how much money would you like to deposit: ");
        account.deposit(sc.nextInt());
        System.out.println("Your balance has changed to: " + account.getBalance());

        System.out.println("Please specify how much money would you like to withdraw: ");
        account.withdraw(sc.nextInt());
        System.out.println("Your balance has changed to: " + account.getBalance());




    }

}
