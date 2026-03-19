package service;

public class AlertService {
    public void  sendAlert(int accNo, String message){
        System.out.println("📩 ALERT [Account" + accNo+ "]");
        System.out.println("👉"+message);
        System.out.println("👉 Please Contact Bank Support.\n");
    }
}
