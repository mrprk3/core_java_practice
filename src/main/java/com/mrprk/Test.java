package com.mrprk;

//import java.time.temporal.ChronoUnit;
//public class Test {
//
//	public static void main(String[] args) {
//		String date1 = "09/27/2023";
//		String date2 = "08/10/2023";
//		
//		System.out.println(ChronoUnit.DAYS.between(date1, date2));
//		
//	}
//
//
//}

/*public class StringToDateConverter {
    public static void main(String[] args) {
        String dateString = "2023-06-28"; // Date string in yyyy-MM-dd format

        LocalDate date = convertStringToDate(dateString);
        System.out.println("Converted date: " + date);
    }

    public static LocalDate convertStringToDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateString, formatter);
    }*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
	public static void main(String[] args) {
		String d1 = "07/15/2023";
		String d2 = "09/27/2023";
		System.out.println(calculateDaysDifference(d1, d2));

	}

	public static long calculateDaysDifference(String d1, String d2) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return ChronoUnit.DAYS.between(LocalDate.parse(d1, formatter), LocalDate.parse(d1, formatter));
	}
}
