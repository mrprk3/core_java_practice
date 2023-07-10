package com.mrprk.array;

public class MinMax {
	int min;
	int max;

	public static MinMax findMinMax(int arr[], int low, int high) {
		MinMax minmax = new MinMax();
		if (low == high) {
			minmax.min = arr[low];
			minmax.max = arr[low];
		}

		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				minmax.min = arr[high];
				minmax.max = arr[low];
			} else {
				minmax.min = arr[low];
				minmax.max = arr[high];
			}
		}

		int mid = (low + high) / 2;
		MinMax left = findMinMax(arr, 0, mid);
		MinMax right = findMinMax(arr, mid + 1, high);

		if (left.min < right.min) {
			minmax.min = left.min;
		} else {
			minmax.min = right.min;
		}

		if (left.max > right.max) {
			minmax.max = left.max;
		} else {
			minmax.max = right.max;
		}

		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6 };
		MinMax findMinMax = findMinMax(arr, 0, 4);
		System.out.println("Min : " + findMinMax.min + " Max : " + findMinMax.max);
	}

}
