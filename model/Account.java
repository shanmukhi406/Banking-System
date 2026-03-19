package model;

import java.util.*;

public class Account {
    public int accNo;

    public double balance;

    public Deque<Long> transcations = new ArrayDeque<>();

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    
}