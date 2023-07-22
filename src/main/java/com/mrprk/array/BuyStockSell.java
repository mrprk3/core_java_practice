package com.mrprk.array;

// given array represents the stock price find maximum profit 
public class BuyStockSell {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 3, 3 };
		System.out.println(findMaxProfit(arr));
	}

	public static int findMaxProfit(int[] arr) {
		int minPrice = arr[0];
		int maxProfit = 0;
		for (int i = 1; i < arr.length; i++) {
			minPrice = Math.min(minPrice, arr[i]);
			maxProfit = Math.max(maxProfit, arr[i] - minPrice);
		}
		return maxProfit;
	}

}
