package com.lcpan.mx;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.println("今天是" + year + "/" + (month+1) + "/" + day);
		System.out.println("今天是星期" + (day_of_week-1));
		System.out.println("時間是" + hour + ":" + minute + ":" + second);

	}
}
