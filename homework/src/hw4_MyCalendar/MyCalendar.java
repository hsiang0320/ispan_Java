package hw4_MyCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {
	static int input_year;
	static int input_month;

	public static int getnumofdays(int inputYear, int input_month) {
		if (input_month == 1 || input_month == 3 || input_month == 5 || input_month == 7 || input_month == 8
				|| input_month == 10 || input_month == 12) {
			return 31;
		} else if (input_month != 2) {
			return 30;
		} else {
			if (inputYear % 4 != 0) {
				// System.out.println(inputYear + "不是閏年");
				return 28;
			} else if (inputYear % 100 == 0 && inputYear % 400 != 0) {
				// System.out.println(inputYear + "不是閏年");
				return 28;
			} else if (inputYear == 0) {
				// System.out.println(inputYear + "不是閏年");
				return 28;
			} else {
				// System.out.println(inputYear + "是閏年");
				return 29;
			}
		}
	}

	public static void printFormat(int input_year, int input_month) {
		System.out.println(input_year + "年" + input_month + "月");
		System.out.println("日" + "\t" + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" + "\t");
	}

	public static void printData(int input_year, int input_month) {
		int days = getnumofdays(input_year, input_month);
		int n = 0;
		Calendar calendar = new GregorianCalendar(input_year, input_month - 1, 1);
		// System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
			System.out.print("\t");
			n++;
		}
		for (int i = 1; i <= days; i++) {
			System.out.print(i + "\t");
			n++;
			if (n > 6) {
				System.out.println();
				n = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入年份");
		input_year = scanner.nextInt();
		System.out.println("輸入月份");
		input_month = scanner.nextInt();
		printFormat(input_year, input_month);
		printData(input_year, input_month);
		scanner.close();

	}

}
