package siit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        MyRunnable r1 = new MyRunnable(numbers);
        MyRunnable r2 = new MyRunnable(numbers);
        MyRunnable r3 = new MyRunnable(numbers);
        MyRunnable r4 = new MyRunnable(numbers);
        MyRunnable r5 = new MyRunnable(numbers);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {}

        System.out.println(numbers);
    }
}
