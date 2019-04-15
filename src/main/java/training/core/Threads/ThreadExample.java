package training.core.Threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {
    //AtomicInteger integer;
    //AtomicBoolean aBoolean;

    public static void main(String[] args) {


            new Thread(new Runnable() {
                @Override
                public void run() {
                    displayNumbers(100);// forma overrride
                }
            }).start();
        new Thread(() ->
                displayNumbers(110), "Bzee").start();// forma lambda

        displayNumbers(50);
        }

    private static void displayNumbers(int sleep) {
        for (int i =0; i<100;i++){
            String name = Thread.currentThread().getName();
            System.out.println(name + " : " +i);
            try {
                Thread.sleep(sleep);
            }catch (InterruptedException e){
                e.printStackTrace();
        }
    }
}
}
