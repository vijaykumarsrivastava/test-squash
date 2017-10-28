package com.vijay.test.squash;

/**
 * 
 * @author vijay
 *
 */
public class Fibonacci {

	public int[] getSeries(final int n) {
		final int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = getFibonacci(i);
		}
		return array;
	}

	private int getFibonacci(final int number) {
		if (number == 0 || number == 1)
			return 1;
		return getFibonacci(number - 2) + getFibonacci(number - 1);
	}
}
