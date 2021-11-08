package com.problems.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String arg[]) throws InterruptedException {
		CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
			public void run() {
				System.out.println("Barrier is activated");
			}
		});

		Random random = new Random();
		for (int i = 0; i < 10; ++i) {
			int r = random.nextInt(3);
			Thread.sleep(r * 1000);
			new Thread(new MyTask(i, barrier)).start();
		}

	}

}

class MyTask implements Runnable {

	private int name;
	private CyclicBarrier barrier;

	public MyTask(int name, CyclicBarrier barrier) {
		this.name = name;
		this.barrier = barrier;
	}

	public void run() {
		System.out.println("Thread activated " + name);
		try {
			barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
