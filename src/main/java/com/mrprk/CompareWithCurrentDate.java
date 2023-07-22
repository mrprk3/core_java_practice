package com.mrprk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareWithCurrentDate {

	public static void main(String[] args) {
		System.out.println(isLessThanOrEqualsCurrentDate("07/19/2023")); // isLesser than current ?
	}

	public static int compare2Dates(String d1, String d2, String dateFormat) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

			Date date1 = sdf.parse(d1);
			Date date2 = sdf.parse(d2);

			if (date1.compareTo(date2) > 0) {
				return 1; // d1 is after d2
			} else if (date1.compareTo(date2) < 0) {
				return -1;// d1 is before d2
			} else if (date1.compareTo(date2) == 0) {
				return 0;// d1 is equal d2
			}
		} catch (ParseException e) {
		}
		return 0;
	}

	public static boolean isLessThanOrEqualsCurrentDate(String date) {
		String currentDate = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		System.out.println(currentDate);
		return (Test.compare2Dates(currentDate, date, "MM/dd/yyyy") < 0);
	}

}
