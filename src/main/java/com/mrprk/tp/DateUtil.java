package com.mrprk.tp;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * @author Girmiti software
 */
public final class DateUtil {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat();
	private static String startTime = " 00:00:00";
	private static String endTime = " 23:59:59";

	/**
	 * * Method to get Current Timestamp
	 * 
	 * @return
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	public static Timestamp convertLongToTimestamp(Long dateinMs) {
		try {
			return new Timestamp(dateinMs);
		} catch (Exception e) {
		}
		return null;

	}

	public static Time convertLongToTime(Long timeinMs, String pattern) {

		Date date = new Date(timeinMs);
		dateFormat.applyPattern(pattern);
		String dateText = dateFormat.format(date);
		return toTime(dateText, pattern);

	}

	public static String getDayOfWeek(Long dateinMs) {
		String dayOfWeek = null;
		Date date = new Date(dateinMs);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1:
			dayOfWeek = "sun";
			break;
		case 2:
			dayOfWeek = "mon";
			break;
		case 3:
			dayOfWeek = "tue";
			break;
		case 4:
			dayOfWeek = "wed";
			break;
		case 5:
			dayOfWeek = "thu";
			break;
		case 6:
			dayOfWeek = "fri";
			break;
		case 7:
			dayOfWeek = "sat";
			break;
		}
		return dayOfWeek;
	}

	public static String convertLongToStringDate(Long dateinMs, String pattern) {

		Date date = new Date(dateinMs);
		dateFormat.applyPattern(pattern);
		String dateText = dateFormat.format(date);
		return dateText;

	}

	public static Date toDate(Date date, String pattern) {
		dateFormat.applyPattern(pattern);
		return new Date(date.getTime());

	}

	public static java.sql.Date sqlDate(Date date, String pattern) {
		dateFormat.applyPattern(pattern);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;

	}

	public static Time toTime(String time, String pattern) {

		try {
			dateFormat.applyPattern(pattern);
			return new Time(dateFormat.parse(time).getTime());

		} catch (ParseException e) {
		}
		return null;
	}

	/**
	 * Method to get Date as string from given date time stamp and pattern
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String toDateStringFormat(Timestamp date, String pattern) {
		if (null != date) {
			try {
				dateFormat.applyPattern(pattern);
				return dateFormat.format(date);
			} catch (Exception e) {

			}
		}
		return null;
	}

	/**
	 * Method to get Date as string from given date Date and pattern
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String toDateStringFormatDate(Date date, String pattern) {
		if (null != date) {
			dateFormat.applyPattern(pattern);
			return dateFormat.format(date);
		} else {
			return null;
		}
	}

	/**
	 * Method to get Current Day's EOD Timestamp
	 * 
	 * @return
	 */
	public static Timestamp getCurrentDayEODTimestamp() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 1);
		return new Timestamp(calendar.getTimeInMillis());
	}

	public static Timestamp getStartDayTimestamp(String date, String pattern) {
		try {
			dateFormat.applyPattern(pattern);
			Date date2 = dateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date2);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);

			return new Timestamp(calendar.getTimeInMillis());
		} catch (ParseException e) {
		}
		return null;
	}

	public static Timestamp getStartDayTimestampInmillis(String date, String pattern) {
		try {
			dateFormat.applyPattern(pattern);
			Date date2 = dateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date2);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 1);
			return new Timestamp(calendar.getTimeInMillis());
		} catch (ParseException e) {
		}
		return null;
	}

	public static Timestamp getEODTimestampInmillis(String date, String pattern) {
		try {
			dateFormat.applyPattern(pattern);
			Date date2 = dateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date2);
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			calendar.set(Calendar.MILLISECOND, 999);
			return new Timestamp(calendar.getTimeInMillis());
		} catch (ParseException e) {
		}
		return null;
	}

	/**
	 * Method to get java.sql.Timestamp from given date string and pattern
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Timestamp getEndDayTimestamp(String date, String pattern) {
		try {
			dateFormat.applyPattern(pattern);
			Date date2 = dateFormat.parse(date);

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date2);
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			return new Timestamp(calendar.getTimeInMillis());
		} catch (ParseException e) {
		}
		return null;
	}

	public static String convertTime(long time) {
		long dividend = time / 60;
		long remainder = time % 60;
		long journeyDay = dividend / 24;

		long hour = dividend % 24;
		long min = remainder;

		String mins = String.valueOf(min);
		String hours = String.valueOf(hour);

		if (min / 10 == 0 || min == 0) {
			mins = "0" + mins;
		}
		if (hour / 10 == 0 || hour == 0) {
			hours = "0" + hours;
		}
		String timeString = hours + ":" + mins;

		if (journeyDay != 0) {
			timeString = timeString + ". Arrives Next day";
		}
		return timeString;
	}

	public static String converToTime(long time) {
		long timeReminder = time % 60;
		long timeQuotient = time / 60;
		long hour = timeQuotient % 24;
		String endParameter = (hour > 12) ? " pm" : " am";
		hour = (hour > 12) ? hour - 12 : hour;
		return String.valueOf(hour) + ":" + ((timeReminder < 10) ? "0" : "") + timeReminder + endParameter;
	}

	public static String getValidDates(String dates, String pat, String oldFormat) throws ParseException {
		DateFormat originalFormat = new SimpleDateFormat(oldFormat);
		DateFormat targetFormat = new SimpleDateFormat(pat);
		Date date = originalFormat.parse(dates);
		return targetFormat.format(date);
	}

	public static String getValidSysDate(String dates, String pat, String oldFormat) {
		if (oldFormat.indexOf(".") > -1) {
			oldFormat = oldFormat.replace(".", "/");
			dates = dates.replace(".", "/");
		}
		String formattedDate = null;
		try {
			DateFormat originalFormat = new SimpleDateFormat(oldFormat);
			DateFormat targetFormat = new SimpleDateFormat(pat);
			Date date = originalFormat.parse(dates);
			formattedDate = targetFormat.format(date);

		} catch (ParseException DPE) {
			System.out.println("Error DateUtil::getValidSysDate()" + DPE.getMessage());
		}
		return formattedDate;
	}

	/**
	 * This method used for formated the current date and time.
	 * 
	 * @return String
	 */
	public String getFormattedTime() {
		StringBuilder formattedTime = new StringBuilder();
		// CCYYMMDDHHMMSS
		DecimalFormat formatter = new DecimalFormat("00");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		formattedTime.append(c.get(Calendar.YEAR));
		formattedTime.append(formatter.format(c.get(Calendar.MONTH) + 1));
		formattedTime.append(formatter.format(c.get(Calendar.DATE)));
		formattedTime.append(formatter.format(c.get(Calendar.HOUR_OF_DAY)));
		formattedTime.append(formatter.format(c.get(Calendar.MINUTE)));
		formattedTime.append(formatter.format(c.get(Calendar.SECOND)));
		return formattedTime.toString();
	}

	

	public static boolean isLessThanOrEqualsCurrentDate(String date) {
		String currentDate = new SimpleDateFormat(PrepaidConstants.DATE_FORMAT).format(new Date());
		return (DateUtil.compare2Dates(currentDate, date, PrepaidConstants.DATE_FORMAT) < 0);
	}

	public static java.sql.Date converStringtoDate(String dateData, String pattern) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			Date parsed = sdf.parse(dateData);
			return new java.sql.Date(parsed.getTime());
		} catch (ParseException e) {

		}
		return null;
	}

	public static String todayDateToYYYYMMdd(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("yyyyMMdd");
		return monthDayformatter.format(date);
	}

	public static String convertDateFormatToYYYYSMMSdd(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("MM/dd/yyyy");
		return monthDayformatter.format(date);
	}

	public static String convertDateFormatToddMMyyyy(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("dd/MM/yyyy");
		return monthDayformatter.format(date);
	}

	public static String dateToMMddYYYY(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("MMddyyyy");
		return monthDayformatter.format(date);
	}

	public static String dateToYYYY(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("yyyy");
		return monthDayformatter.format(date);
	}

	public static String dateToMMdd(String dateFormat) {
		Date date = converStringtoDate(dateFormat, "MM/dd/yyyy");
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("MMdd");
		return monthDayformatter.format(date);

	}

	public static String dateToMM(String dateFormat) {
		Date date = converStringtoDate(dateFormat, "MM/dd/yyyy");
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("MM");
		return monthDayformatter.format(date);
	}

	public static String dateToString(Date date, String format) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat(format);
		return monthDayformatter.format(date);
	}

	public static String dateToYYYY(String dateFormat) {
		Date date = converStringtoDate(dateFormat, "MM/dd/yyyy");
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("yyyy");
		return monthDayformatter.format(date);
	}

	/**
	 * Method to validate Date Format in request
	 * 
	 * @param dateFormat
	 * @return
	 */
	public static Boolean dateFormatValidatorMMddyyyy(String dateFormat) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			date = sdf.parse(dateFormat);
			if (!dateFormat.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		if (date == null) {
			return false;
		} else {
			return true;
		}
	}

	public static String dateToMMddyy(String date) {
		if (date != null) {
			String formatdate = "" + date.substring(0, date.length() - 4) + date.charAt(date.length() - 2)
					+ date.charAt(date.length() - 1);
			return formatdate;
		}
		return null;

	}

	/**
	 * Method to append Time to date value at the end
	 * 
	 * @param date
	 * @return
	 */
	public static String appendFromTime(String date) {

		if (null != date) {
			if (date.contains(startTime.trim())) {
				// DO nothing
			} else {
				date += startTime;
			}
		}
		return date;

	}

	/**
	 * Method to append Time to date value at the end
	 * 
	 * @param date
	 * @return
	 */
	public static String appendToTime(String date) {

		if (null != date) {
			if (date.contains(endTime.trim())) {
				// DO nothing
			} else {
				date += endTime;
			}
		}
		return date;

	}

	// Method to get transmission date and time MMDDhhmmss Format
	public static String getTransmissionDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMDDhhmmss");
		simpleDateFormat.setLenient(false);
		return simpleDateFormat.format(new Date());
	}

	public static Timestamp dateToTimestamp(Date d) {
		Timestamp timeStampDate = new Timestamp(d.getTime());
		return timeStampDate;
	}

	public static Timestamp calenderToTimestamp(Calendar cal) {
		Date date = new Date(cal.getTimeInMillis());
		Timestamp timeStampDate = new Timestamp(date.getTime());
		return timeStampDate;
	}

	public static Calendar setCalendarBOD(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 1);

		return cal;
	}

	public static Calendar setCalendarEOD(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);

		return cal;
	}

	public static Timestamp startTimestampForSystemReport() {
		Calendar startTime = Calendar.getInstance();
		int dayOfWeek = startTime.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == 7) {
			startTime.add(Calendar.DATE, -1);
		} else if (dayOfWeek == 1) {
			startTime.add(Calendar.DATE, -2);
		}
		startTime.set(Calendar.HOUR_OF_DAY, 0);
		startTime.set(Calendar.MINUTE, 0);
		startTime.set(Calendar.SECOND, 0);
		startTime.set(Calendar.MILLISECOND, 0);

		return new Timestamp(startTime.getTimeInMillis());
	}

	public static String getReconFileDate(String fileName) {
		try {
			Calendar cal = Calendar.getInstance();
			fileName = fileName.substring(1, 7);
			String date = "20".concat(fileName.substring(0, 2)) + "/" + fileName.substring(2, 4) + "/"
					+ fileName.substring(4);
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Date startDate = df.parse(date);
			cal.setTimeInMillis(startDate.getTime());
			cal.add(Calendar.DAY_OF_MONTH, 1);
			date = convertLongToStringDate(cal.getTimeInMillis(), "YYMMdd");
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String startDayOfMonth(String monthYear) {
		if (null == monthYear) {
			return monthYear;
		}
		String fromDate = null;
		try {
			String[] temp = monthYear.split("/");
			String month = temp[0];
			int value = Integer.parseInt(month);
			String year = temp[1];

			switch (value) {
			case 1:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 2:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 3:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 4:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 5:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 6:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 7:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 8:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 9:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 10:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 11:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			case 12:
				fromDate = appendFromTime(month + "/01/" + year);
				break;
			}
		} catch (Exception e) {

		}
		return fromDate;
	}

	public static String endDayOfMonth(String monthYear) {
		if (null == monthYear) {
			return monthYear;
		}
		String toDate = null;
		try {
			String[] temp = monthYear.split("/");
			String month = temp[0];
			int value = Integer.parseInt(month);
			String year = temp[1];

			switch (value) {
			case 1:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 2:
				if (isLeapYear(year))
					toDate = appendToTime(month + "/29/" + year);
				else
					toDate = appendToTime(month + "/28/" + year);
				break;
			case 3:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 4:
				toDate = appendToTime(month + "/30/" + year);
				break;
			case 5:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 6:
				toDate = appendToTime(month + "/30/" + year);
				break;
			case 7:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 8:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 9:
				toDate = appendToTime(month + "/30/" + year);
				break;
			case 10:
				toDate = appendToTime(month + "/31/" + year);
				break;
			case 11:
				toDate = appendToTime(month + "/30/" + year);
				break;
			case 12:
				toDate = appendToTime(month + "/31/" + year);
				break;
			}
		} catch (Exception e) {

		}
		return toDate;
	}

	private static boolean isLeapYear(String input) {
		int year = Integer.parseInt(input);
		boolean isLeapYear = false;

		if (year % 400 == 0) {
			isLeapYear = true;
		} else if (year % 100 == 0) {
			isLeapYear = false;
		} else if (year % 4 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}

	public static String startDayOfYear(String year) {
		return appendFromTime("01/01/" + year);
	}

	public static String endDayOfYear(String year) {
		return appendToTime("12/31/" + year);
	}

	public static String getMMM(String month) {
		if (null == month) {
			return month;
		}
		int value = Integer.parseInt(month);
		switch (value) {
		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Apr";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "Jun";
			break;
		case 7:
			month = "Jul";
			break;
		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		}
		return month;
	}

	public static String getCSTTime(Timestamp time) {
		StringBuffer date = new StringBuffer();
		return date.append(toDateStringFormat(time, "EE MMM dd HH:mm:ss")).append(" CST ")
				.append(toDateStringFormat(time, "yyyy")).toString();
	}

	public static int getDayOfMonth(int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int month = cal.get(Calendar.MONTH);
		switch (month + 1) {
		case 1:
			return day;
		case 2:
			return (day > 28) ? 28 : day;
		case 3:
			return day;
		case 4:
			return (day > 30) ? 30 : day;
		case 5:
			return day;
		case 6:
			return (day > 30) ? 30 : day;
		case 7:
			return day;
		case 8:
			return day;
		case 9:
			return (day > 30) ? 30 : day;
		case 10:
			return day;
		case 11:
			return (day > 30) ? 30 : day;
		case 12:
			return day;
		default:
			return -1;
		}
	}

	public static int getDayOfMonthAsInt() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_MONTH);
	}

	// validate MM-dd-yyyy
	public static boolean validatePattern(String date) {
		if (date.matches("(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])-\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	// validate MM/dd/yyyy
	public static boolean validatePattern2(String date) {
		if (date.matches("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	// convert MM/dd/yyyy to MM-dd-yyyy
	public static String convertFormat(String dateFormat) {
		Date date = DateUtil.converStringtoDate(dateFormat, "MM/dd/yyyy");
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("MM-dd-yyyy");
		return monthDayformatter.format(date);

	}

	public static String extApiDateToddmonyy(String date) throws ParseException {
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		Date dateFormat = format1.parse(date);
		return format2.format(dateFormat);
	}

	public static String dateToyyyyMM(Date date) {
		SimpleDateFormat monthDayformatter = new SimpleDateFormat("yyyyMM");
		return monthDayformatter.format(date);
	}

	public static String datetoWeekDay(String date1) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		Date date = formatter.parse(date1);
		String strDateFormat = "EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		String[] ar = formatter.format(date).split("-");
		return sdf.format(date) + "," + getMMMM(ar[0]) + "," + ar[1] + "," + ar[2];
	}

	public static String getMMMM(String month) {
		if (null == month) {
			return month;
		}
		int value = Integer.parseInt(month);
		switch (value) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "Decmber";
			break;
		}
		return month;
	}

	public static String getUploadFundMontheDate(String pattern) {
		dateFormat.applyPattern(pattern);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		Date result = cal.getTime();
		String datestring = dateFormat.format(result);
		return datestring;
	}

	public static String getUploadFundDate(String pattern, int numberOfDay) {
		dateFormat.applyPattern(pattern);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -numberOfDay);
		Date result = cal.getTime();
		String datestring = dateFormat.format(result);
		return datestring;
	}

	public static String getUploadFundCurrentDate(String pattern) {
		dateFormat.applyPattern(pattern);
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public static int getDayValue() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	/**
	 * Used to get date in yyyy-MM-dd format
	 * 
	 * @param dob
	 * @return
	 * @throws ParseException
	 */

	/**
	 * 
	 * @return Day beging time ex : 11/22/2016 00:00:00.001
	 */
	public static String getDayBegingTime() {
		Calendar cal = DateUtil.setCalendarBOD(Calendar.getInstance());
		Timestamp dayBegingTime = new Timestamp(cal.getTimeInMillis());
		return DateUtil.toDateStringFormat(dayBegingTime, "MM/dd/yyyy HH:mm:ss.SSS");
	}

	/**
	 * 
	 * @return Day ending time ex : 11/22/2016 23:59:59.999
	 */
	public static String getDayEndingTime() {
		Calendar cal = DateUtil.setCalendarEOD(Calendar.getInstance());
		Timestamp dayEndingTime = new Timestamp(cal.getTimeInMillis());
		return DateUtil.toDateStringFormat(dayEndingTime, "MM/dd/yyyy HH:mm:ss.SSS");
	}

	/**
	 * 
	 * @return Month beging time ex : 11/01/2016 00:00:00.001
	 */
	public static String getMonthBegingTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		DateUtil.setCalendarBOD(cal);
		return dateToString(cal.getTime(), "MM/dd/yyyy HH:mm:ss.SSS");
	}

	/**
	 * 
	 * @return Month ending time ex : 11/30/2016 23:59:59.999
	 */
	public static String getMonthEndingTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		DateUtil.setCalendarEOD(cal);
		return dateToString(cal.getTime(), "MM/dd/yyyy HH:mm:ss.SSS");
	}

	public static String getNumericMonth(String month) {
		String nummericMonth = null;
		try {
			Date date = new SimpleDateFormat("MMM").parse(month);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int monthNumber = cal.get(Calendar.MONTH) + 1;
			if (monthNumber < 10) {
				nummericMonth = "0" + String.valueOf(monthNumber);
			} else {
				nummericMonth = String.valueOf(monthNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nummericMonth;
	}


	public static String subDaysFromCurrentDate(int noOfDays, String pattern) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new java.util.Date());
		cal.add(Calendar.DATE, -noOfDays); // minus number would decrement the days
		return dateToString(cal.getTime(), pattern);

	}

	public static long compareTwoTimeStamps(java.sql.Timestamp currentTime, java.sql.Timestamp oldTime) {
		long milliseconds1 = oldTime.getTime();
		long milliseconds2 = currentTime.getTime();

		long diff = milliseconds2 - milliseconds1;
		long diffMinutes = diff / (60 * 1000);

		return diffMinutes;
	}

	public static Timestamp convertCalenderToGmtTimeStamp(Calendar c) {
		Date date = c.getTime();
		TimeZone tz = TimeZone.getDefault();
		Date ret = new Date(date.getTime() - tz.getRawOffset());

		if (tz.inDaylightTime(ret)) {
			Date dstDate = new Date(ret.getTime() - tz.getDSTSavings());
			if (tz.inDaylightTime(dstDate)) {
				ret = dstDate;
			}
		}
		return new Timestamp(ret.getTime());
	}

	public static boolean isValidDateFormat(String format, String value) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(value);
			if (!value.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException ex) {
			// ex.printStackTrace();
		}
		return date != null;
	}

	public static Date stringtoDate(String dateString, String pattern) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			Date parsed = sdf.parse(dateString);
			Date date = new Date(parsed.getTime());
			return date;
		} catch (ParseException e) {

		}
		return null;
	}

	// CI-744 - UTDOC - NUCC Debit Cards - Wrong API Date Format Coming From
	// Cashless
	public static String convertDateFormatString(String dateString, String fromPattern, String toPattern) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(fromPattern);
			Date parsed = sdf.parse(dateString);
			Date date = new Date(parsed.getTime());

			SimpleDateFormat toDateformatter = new SimpleDateFormat(toPattern);
			return toDateformatter.format(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String diffTimestamp(Timestamp startTime, Timestamp endTime) {

		// get time difference in seconds
		long milliseconds = endTime.getTime() - startTime.getTime();
		int seconds = (int) milliseconds / 1000;
		return String.valueOf(seconds == 0 ? "00" : seconds) + " Secs";
	}

	// date format correction method to single digit month and date value
	// return 2 digit month and date
	// Quick fix given to sprint 40
	public static final String correctDateFormat(String dateString) {

		if (dateString.contains("/")) {
			String[] dateArr = dateString.split("/");
			String month = dateArr[0];
			String date = dateArr[1];
			String year = dateArr[2];

			month = month.length() == 2 ? month : "0" + month;
			date = date.length() == 2 ? date : "0" + date;

			dateString = month + "/" + date + "/" + year;

		}

		return dateString;
	}

	public static boolean isDOBEquals(String requestDOB, java.sql.Date dbDOB) throws ParseException {
		requestDOB = requestDOB.contains("/") ? requestDOB.replaceAll("/", "-") : requestDOB;
		SimpleDateFormat formatter = new SimpleDateFormat(PrepaidConstants.DATE_FORMAT_WITH_HYPHEN);
		Date dtDob = formatter.parse(requestDOB);
		String reqDOB = formatter.format(dtDob);
		String dbDate = DateUtil.toDateStringFormat(new Timestamp(dbDOB.getTime()),
				PrepaidConstants.DATE_FORMAT_WITH_HYPHEN);
		return reqDOB.compareTo(dbDate) == 0;
	}

	public static boolean isCustomerDOBEquals(String requestDOB, Date dbDOB) throws ParseException {
		requestDOB = requestDOB.contains("/") ? requestDOB.replaceAll("/", "-") : requestDOB;
		SimpleDateFormat formatter = new SimpleDateFormat(PrepaidConstants.DATE_FORMAT_WITH_HYPHEN);
		Date dtDob = formatter.parse(requestDOB);
		String reqDOB = formatter.format(dtDob);
		String dbDate = DateUtil.toDateStringFormatDate(dbDOB, PrepaidConstants.DATE_FORMAT_WITH_HYPHEN);
		return reqDOB.compareTo(dbDate) == 0;
	}

	public static boolean isDateForamtCorrect(String requestDOB) {
		// MM/dd/yyyy
		if (requestDOB.length() != 10) {
			return false;
		}

		if (Integer.valueOf(requestDOB.substring(0, 2)) < 1 || Integer.valueOf(requestDOB.substring(0, 2)) > 12) {
			return false;
		}

		if (Integer.valueOf(requestDOB.substring(3, 5)) < 1 || Integer.valueOf(requestDOB.substring(3, 5)) > 31) {
			return false;
		}

		return true;
	}

	public static String getPreviousMonthAndYear() {
		Calendar c = new GregorianCalendar();
		c.setTime(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM YYYY");
		c.add(Calendar.MONTH, -1); // One month ago
		return sdf.format(c.getTime());
	}

	/**
	 * @param createdDate
	 * @return
	 */
	public static java.sql.Date getHoldExpirationDatePerCreatedDate(String createdDate) {

		DateFormat dateFormat = new SimpleDateFormat(PrepaidConstants.DATE_TIME_SEC_FORMAT);
		java.util.Date date = null;
		try {
			date = dateFormat.parse(createdDate);
		} catch (ParseException e) {
		}

		return addDays(date, 3);
	}

	/**
	 * add days to date in java
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static java.sql.Date addDays(java.util.Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		if (cal.get(Calendar.HOUR) >= 03 && cal.get(Calendar.MINUTE) >= 02) {
			cal.add(Calendar.DATE, 1);
			cal.set(Calendar.HOUR_OF_DAY, 03);
			cal.set(Calendar.MINUTE, 01);
			cal.set(Calendar.SECOND, 01);
		}

		return new java.sql.Date(cal.getTime().getTime());
	}

	/**
	 * @param firstLoadDate
	 * @param currDate
	 * @param interval
	 * @return
	 */
	public static String calculateStartDateForFreeLoad(String firstLoadDate, String currDate, Long interval) {
		SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");

		try {
			Date firstLoad = myFormat.parse(firstLoadDate);
			Date curr = myFormat.parse(currDate);
			long diff = curr.getTime() - firstLoad.getTime();
			Long s = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			Long i = s / interval;
			Long p = i * interval;
			Long x = s - p;
			Calendar cal = Calendar.getInstance();
			cal.setTime(curr);
			cal.add(Calendar.DATE, -x.intValue());
			Date dateBefore30Days = cal.getTime();
			return myFormat.format(dateBefore30Days);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getFirstDateOfPreviousMonth() {
		Calendar aCalendar = Calendar.getInstance();
		// add -1 month to current month
		aCalendar.add(Calendar.MONTH, -1);
		// set DATE to 1, so first date of previous month
		aCalendar.set(Calendar.DATE, 1);
		return convertDateFormatToYYYYSMMSdd(aCalendar.getTime());
	}

	public static String getLastDateOfPreviousMonth() {
		Calendar aCalendar = Calendar.getInstance();
		// add -1 month to current month
		aCalendar.add(Calendar.MONTH, -1);
		// set actual maximum date of previous month
		aCalendar.set(Calendar.DATE, aCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return convertDateFormatToYYYYSMMSdd(aCalendar.getTime());
	}

	public static Calendar getCalender(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	public static Date getYesterdayDate() {
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}

	public static Date getCurrentDate() {
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		return cal.getTime();
	}

	// TO find the offset time difference in seconds from UTC to CST/CDT
	public static int getOffsetTimeOfCST() {

		Calendar calendar = Calendar.getInstance();
		int timeZOneOffset = -(calendar.get(Calendar.ZONE_OFFSET) + (calendar.get(Calendar.DST_OFFSET))) / (60 * 1000);

		return timeZOneOffset;
	}

	public static String validateAndSetDateFormat(String dob) {

		String day;
		String month;
		String[] dd;
		dd = dob.split("/");
		if (dd[0].length() == 1) {
			day = "0";
			day = day.concat(dd[0]);
		} else {
			day = dd[0];
		}
		if (dd[1].length() == 1) {
			month = "0";
			month = month.concat(dd[1]);
		} else {
			month = dd[1];
		}
		dob = day + "/" + month + "/" + dd[2];
		return dob;
	}

	/**
	 * @param days
	 * @return
	 */
	public static Timestamp getTimeStampBeforeDays(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -days);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return new Timestamp(calendar.getTimeInMillis());
	}

	public static java.sql.Date getSqlDateFromTimeStamp(Timestamp date, String pattern) {
		dateFormat.applyPattern(pattern);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;
	}

	public static java.sql.Date getDateAfterCurrentDate(Long days) {
		LocalDate localDate = LocalDate.now().plusDays(days);
		return java.sql.Date.valueOf(localDate);
	}

	public static String setTimeForDate(java.sql.Date date, String pattern) {
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		Date utilDate = new Date(cal.getTime().getTime());
		return dateFormat.format(utilDate);
	}

	public static String toDateStringHoldExpiryDate(Timestamp date, String pattern) {
		if (null != date) {
			try {
				Date datee = new Date(date.getTime());
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTime(datee);
				cal.set(Calendar.HOUR_OF_DAY, 23);
				cal.set(Calendar.MINUTE, 59);
				cal.set(Calendar.SECOND, 59);
				Date utilDate = new Date(cal.getTime().getTime());
				dateFormat.applyPattern(pattern);
				return dateFormat.format(utilDate);
			} catch (Exception e) {

			}
		}
		return null;
	}

	public static String getJulianDate(String inDate) {
		try {
			inDate = (new Timestamp(System.currentTimeMillis()).getYear() + 1900) + inDate;
			DateFormat srcFormat = new SimpleDateFormat("yyyyMMdd");
			Date date = srcFormat.parse(inDate);
			DateFormat destFormat = new SimpleDateFormat("yyDDD");
			return destFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getYear() {
		Date date = new Date();
		return String.valueOf(date.getYear() + 1900);
	}

	public static String getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Integer month = calendar.get(Calendar.MONTH) + 1;
		return String.valueOf(month);
	}

	public static String getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Integer month = calendar.get(Calendar.YEAR) + 1900;
		return String.valueOf(month);
	}

	public static long daysDifferenceFromCurrentDate(String date) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.parse(date, ((DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
		return ChronoUnit.DAYS.between(date1, date2);
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

}
