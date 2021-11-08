package com.problems;

public final class MillionNumbers {

	public static void main(String args[]) throws InterruptedException {
		for (int number = 1; number <= 1000000; ++number) {
			System.out.println(number);
			// Thread.sleep(1);
		}
	}

}
