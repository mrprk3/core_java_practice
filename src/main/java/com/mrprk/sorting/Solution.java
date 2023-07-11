package com.mrprk.sorting;

import java.util.*;

class Solution {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int arr[] = { 7, 4, 6, 5, 3, 1, 2};
		System.out.println("Before sorting array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Solution.mergeSort(arr, 0, n - 1);
		System.out.println("After sorting array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid); // left half
		mergeSort(arr, mid + 1, high); // right half
		merge(arr, low, mid, high); // merging sorted halves
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		// if elements on the left half are still left
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		// if elements on the right half are still left 
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		// transfer all elements from temporary to list
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

}
