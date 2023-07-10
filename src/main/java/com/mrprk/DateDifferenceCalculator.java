package com.mrprk;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {
	public static void main(String[] args) {
		String d2 = "2023-06-30";
		System.out.println(daysDifferenceFromCurrentDate(d2));
	}

	public static long daysDifferenceFromCurrentDate(String date) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.parse(date, ((DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
		return ChronoUnit.DAYS.between(date1, date2);
	}
}