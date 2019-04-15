package training.core.Threads.Exercie1;

public class ThreadRunner {
    public static void main(String[] args) {
        MyRunnable myR = new MyRunnable();

        Thread t_m = new Thread(myR);
        //myR.run();
        t_m.start();


        for (int i = 0 ; i <1000; i++){
            System.out.println(i);
        }
    }
}
