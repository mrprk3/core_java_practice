package com.mrprk.array;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
//		int[] arr = { 8, 10, 12, 14, 15, 17, 20, 1, 2, 4, 6 };
//		// int[] arr = { 20, 1, 2, 4, 6 }; 6, 10
//		int res = search(arr,12);
//		System.out.println(res);
		
	     // SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");

		
		 Format f = new SimpleDateFormat("MM/dd/yy");
	      String strDate = f.format(new Date());
	      System.out.println(getCurrentDate());

	}
	
	  public static Date getCurrentDate() {
		    final Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.DATE,0);
		    return cal.getTime();
		}

	public static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] >= arr[0]) {
				if (target >= arr[mid] && target <= arr[mid]) {
					high = mid;
				} else {
					low = mid + 1;
				}
			} else {
				if (target >= arr[mid] && target <= arr[high]) {
					low = mid;
				}
			}
		}
		return 0;
	}

}
