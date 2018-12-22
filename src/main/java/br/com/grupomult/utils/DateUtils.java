package br.com.grupomult.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;

public final class DateUtils {

	/**
	 * ISO 8601 Complete Date: yyyy-MM-dd.
	 */
	public static final String ISO8601_COMPLETE_DATE = "yyyy-MM-dd";
	public static final String ISO8601_COMPLETE_DATE_TIME = "yyyy-MM-dd HH:mm";


	private DateUtils() {
	}

	public static Date stringToDate(String date, String pattern) {
		try {
			return new SimpleDateFormat(pattern).parse(date);
		} catch (Exception e) {
			return null;
		}
	}

	public static String dateToString(LocalDate date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static String dateTimeToString(OffsetDateTime date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	public static LocalDate dateToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

}
