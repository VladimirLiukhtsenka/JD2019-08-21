package by.it.liukhtenko.training.threads.locks;

import java.util.concurrent.TimeUnit;

public class PaymentLockRuner {
    public static void main(String[] args) {
        final PaymentLock payment = new PaymentLock();
        new Thread(()->payment.doPayment()).start();
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        payment.init();
        System.out.println("END");
    }
}
