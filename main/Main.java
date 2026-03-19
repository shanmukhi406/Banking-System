package main;

import service.BankService;

public class Main {
    public static void main(String[] args) {

        BankService bank = new BankService();

        bank.createAccount(1, 100000);

        bank.deposit(1, 10000);

        bank.withdraw(1, 10000);
        bank.withdraw(1, 10000);
        bank.withdraw(1, 10000);
        bank.withdraw(1, 10000); // fraud

        bank.withdraw(1, 60000); // large fraud

        bank.showBalance(1);
        bank.showTransactions(1);
    }
}