package model;

public class Transaction {
    public String type;
    public double amount;
    public long time;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = System.currentTimeMillis();
    }
}
