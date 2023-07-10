package com.mrprk;

public class Pattern {
	public static void pattern1(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				if (col <= row) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if ((j >= n - i) && (j <= n + i)) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern4() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 4; j++) {
				if ((j > 2 - i) && (j < i + 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern1(5);
	}
}
