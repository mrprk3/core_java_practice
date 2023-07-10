package com.mrprk;

public class Test7 {
	public static void getSomething(String... name) {
		for (String n : name) {
			System.out.println(n);
		}
	}

	public static int checkOccourance(int number, int digit) {
		int count = 0;
		while (number != 0) {
			int rem = number % 10;
			if (rem == digit) {
				count = count + 1;
			}
			number = number / 10;
		}
		return count;
	}

	public static int checkDigit(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count = count+1;
		}
		return count;
	}

	public static boolean checkArmstrongNumber(int num) {
		int occ = checkDigit(num);
		
		int temp = num;
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res = res + (rem * rem * rem * rem);
			num = num / 10;
		}
		if (res == temp) {
			return true;
		}
		return false;
	}

	public static int printAmstrong() {
		for (int i = 100; i < 10000; i++) {
			boolean res = checkArmstrongNumber(i);
			if (res == true) {
				System.out.println(i);
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.println(checkDigit(236));
		printAmstrong();
		System.out.println(checkArmstrongNumber(153));
		int res = checkOccourance(21343, 3);
		System.out.println(res);
		getSomething("Atim", "Deepak");
	}

}
