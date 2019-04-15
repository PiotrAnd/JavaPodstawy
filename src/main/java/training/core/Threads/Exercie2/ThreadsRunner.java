package training.core.Threads.Exercie2;

public class ThreadsRunner {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        System.out.println(counter.getCount());
        ThreadPlus threadPlus = new ThreadPlus(counter);
        ThreadMinus threadMinus = new ThreadMinus(counter);
        threadMinus.start();
        threadPlus.start();

        threadMinus.join();
        threadPlus.join();

        System.out.println(counter.getCount());
    }
}
