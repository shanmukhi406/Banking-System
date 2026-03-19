package service;

import model.Account;
import model.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class BankService {
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, List<Transaction>> logs = new HashMap<>();


    private FraudDetector fraudDetector = new FraudDetector();
    private AlertService alertService = new AlertService();

    public void createAccount(int accNo, double balance) {
        Account acc = new Account(accNo, balance);
        accounts.put(accNo, acc);
        logs.put(accNo, new ArrayList<>());
    }
    public void deposit(int accNo, double amount) {
        Account acc = accounts.get(accNo);
        acc.balance += amount;

        logs.get(accNo).add(new Transaction("DEPOSIT", amount));
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(int accNo, double amount) {

        Account acc = accounts.get(accNo);

        // 🚨 Large transaction check
        if (fraudDetector.isLargeTranscation(amount)) {
            System.out.println("🚨 Large transaction blocked!");
            alertService.sendAlert(accNo, "Attempted ₹" + amount);
            return;
        }

        // ⏱ Add timestamp
        acc.transcations.addLast(System.currentTimeMillis());

        // 🚨 Frequency check
        if (fraudDetector.isFrequentFraud(acc.transcations)) {
            System.out.println("🚨 Too many transactions!");
            alertService.sendAlert(accNo, "Multiple rapid transactions detected");
            return;
        }

        // 💸 Normal withdraw
        if (amount > acc.balance) {
            System.out.println("Insufficient balance!");
        } else {
            acc.balance -= amount;
            logs.get(accNo).add(new Transaction("WITHDRAW", amount));
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void showBalance(int accNo) {
        System.out.println("Balance: " + accounts.get(accNo).balance);
    }

    public void showTransactions(int accNo) {
        for (Transaction t : logs.get(accNo)) {
            System.out.println(t.type + " | " + t.amount + " | " + t.time);
        }
    }
}
