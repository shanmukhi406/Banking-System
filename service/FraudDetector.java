package service;

import java.util.Deque;


public class FraudDetector {
    private  static  final long WINDOW_TIME = 60000;
    private  static final  int MAX_TXN = 3;

    public  boolean isFrequentFraud(Deque<Long> queue){
        long now = System.currentTimeMillis();
        while(!queue.isEmpty() && now-queue.peekFirst() > WINDOW_TIME){
            queue.removeFirst();
        }
        return queue.size() > MAX_TXN;
    }
    public boolean isLargeTranscation(double amount){
        return amount > 50000;
    }
}
