package com.problems.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String arg[]) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        Random random = new Random();
        for(int i=0; i<5; ++i){
            int r = random.nextInt(4);
            Thread.sleep(r * 1000);
            new Thread(new MyTask(i, countDownLatch)).start();
        }

        countDownLatch.await();
        System.out.println("All Start");
    }

}

class MyTask implements Runnable {

    private int id;
    private CountDownLatch latch;

    public MyTask(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Starting " + id);
            Thread.sleep(4 * 1000);
            System.out.println("Thread " + id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }
}