package hw1;

public class LeapYear {

	public static void main(String[] args) {
		int inputYear = 1509;
		if (inputYear % 4 != 0) {
			System.out.println(inputYear + "不是閏年");
		} else if (inputYear % 100 == 0 && inputYear % 400 != 0) {
			System.out.println(inputYear + "不是閏年");
		} else if (inputYear == 0) {
			System.out.println(inputYear + "不是閏年");
		} else {
			System.out.println(inputYear + "是閏年");
		}
	}

}
