package com.mrprk.recursion;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(getFactorial(1));
	}

	public static int getFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}
	}

}
