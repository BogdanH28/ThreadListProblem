package siit;

import java.util.List;

public class MyRunnable implements Runnable{

    public MyRunnable(List<Integer> numbers) {
        numbers.add((int)(Math.random() * 10 + 1));
    }

    public void run() {
    }

}
