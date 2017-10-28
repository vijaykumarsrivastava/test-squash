package com.vijay.test.squash;

/**
 * 
 * @author vijay
 *
 */
public class BinarySearch {

	public int search(final int[] array, final int search, final int start, final int end) {
		final int middle = start + (end - search) >> 1;
		if (search == array[middle])
			return middle;
		else if (search > array[middle])
			return search(array, search, middle + 1, end);
		System.out.println("Search into first half");
		return search(array, search, start, middle - 1);
	}
	
	private void display() {
		System.out.println("Display");
	}
}
