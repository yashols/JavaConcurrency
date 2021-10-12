package com.problems;

/**
 * This class creates 4 thread and each thread prints its own number
 * T1 - 1
 * T2 - 2
 * T3 - 3
 * T4 - 4
 * T1 - 5
 * T2 - 6
 * ETC
 *
 * @author Yashol
 */
public class CountingPrint
{
	public static final Object lock = new Object();


	public static void main(String arg[])
	{
		Counter counter = new Counter(1);
		Thread t1 = new Thread(new CounterPrinter(0, counter));
		Thread t2 = new Thread(new CounterPrinter(1, counter));
		Thread t3 = new Thread(new CounterPrinter(2, counter));
		Thread t4 = new Thread(new CounterPrinter(3, counter));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class CounterPrinter implements Runnable
{
	private final int threadNumber;
	private volatile Counter counter;


	public CounterPrinter(int threadNumber, Counter counter)
	{
		this.threadNumber = threadNumber;
		this.counter = counter;
	}


	public void run()
	{
		synchronized (CountingPrint.lock)
		{
			while (counter.getCount() <= 20)
			{
				try
				{
					if (counter.getCount() % 4 != threadNumber)
					{
						CountingPrint.lock.wait();
					}
					else
					{
						Thread.sleep(300);
						System.out.println("Printed by Thread " + threadNumber + " counter - " + counter.getCount());
						counter.setCount(counter.getCount() + 1);
						CountingPrint.lock.notifyAll();
					}
				}
				catch (Exception ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
}

class Counter
{
	private volatile int count;


	public Counter(int count)
	{
		this.count = count;
	}


	public int getCount()
	{
		return count;
	}


	public void setCount(int count)
	{
		this.count = count;
	}
}