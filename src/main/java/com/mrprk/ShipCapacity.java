package com.mrprk;

public class ShipCapacity {
	// find out the least capacity of ship to load all weights. which max days
	// should be n
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 1 };
		System.out.println(findLeastCapacityRequiredShip(arr, 4));

	}
	// int[] weight = { 1, 2, 3, 4, 5, 6, 7 };
	// minimum capacity will be max weight which max weight from given array which
	// is 7
	// and max capacity may be all sum of all weight 28 (if ship capacity 28 then
	// all can load in 1 day)
	// now let find the answer

	public static int findLeastCapacityRequiredShip(int[] weight, int days) {
		int start = getMinCapacityRequired(weight);
		int end = getMaxCapacityRequired(weight);
		int ans = 0;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			int day = calculateRequiredDays(weight, mid);
			if (day <= days) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	// Here calculation total days required to load into ship
	public static int calculateRequiredDays(int[] weight, int shipCapacity) {
		int days = 1;
		int load = 0;
		for (int i = 0; i < weight.length; i++) {
			if (load + weight[i] > shipCapacity) {
				days = days + 1;
				load = weight[i];
			} else {
				load = load + weight[i];
			}
		}
		return days;
	}

	public static int getMinCapacityRequired(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int getMaxCapacityRequired(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = max + arr[i];
		}
		return max;
	}

}
