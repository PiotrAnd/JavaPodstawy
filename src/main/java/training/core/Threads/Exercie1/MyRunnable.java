package training.core.Threads.Exercie1;

public class MyRunnable implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Run Forest, Run!!!");
    }
}
