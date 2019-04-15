package training.core.Threads.Exercie2;

public class Counter {
    private int count;

    private Object lock1;
    private Object lock2;

    public  void increase() {
        synchronized (lock1) {
            count++;
        }
    }
    public void decrease(){
            synchronized (lock1){
                count--;
            }
        }
    public int getCount(){
        return count;
    }
    }


