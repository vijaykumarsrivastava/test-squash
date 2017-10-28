package com.vijay.test.squash;

/**
 * 
 * @author vijay
 *
 */
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello");
		print("Print method.");
	}
	
	private static void print(final String msg) {
		System.out.println(msg);
	}
}
