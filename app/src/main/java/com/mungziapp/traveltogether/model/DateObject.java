package com.mungziapp.traveltogether.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DateObject {
	private LocalDateTime dateTime;

	public static LocalDate stringToLocalDate(String strDate) {
		String[] strDates = strDate.split("\\.");

		if (strDates.length == 3) {
			int year = Integer.valueOf(strDates[0]);
			int month = Integer.valueOf(strDates[1]);
			int dayOfMonth = Integer.valueOf(strDates[2]);

			return LocalDate.of(year, month, dayOfMonth);
		}

		return null;
	}

	public DateObject() {
		dateTime = LocalDateTime.now();
	}

	public static long getEpochTime(LocalDateTime dateTime) {
		return dateTime.toEpochSecond(ZoneOffset.UTC);
	}

	public static LocalDateTime getLocalDateTime(long seconds) {
		return LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
	}

	public int getYear() { return dateTime.getYear(); }
	public int getMonth() { return dateTime.getMonth().getValue(); }
	public int getDayOfMonth() { return dateTime.getDayOfMonth(); }
	public int getHour() { return dateTime.getHour(); }
	public int getMinute() { return dateTime.getMinute(); }

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDate(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
}