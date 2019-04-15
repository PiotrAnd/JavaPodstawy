package training.core.Threads.Exercie2;

import training.core.Threads.Exercie2.Counter;

public class ThreadPlus extends Thread{
    private Counter counter;
    public ThreadPlus(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int it = 0; it<10; it++){
            counter.increase();
            try{
                sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Plus - done!");
    }
}
