package hw1;

public class Electricity {

	public static void main(String[] args) {//
		boolean forBusiness = true;// 是否為營業用
		int kwh = 2000;// 用電度數
		int cost = 0;// 電費
		if (forBusiness == true) {// 營業用電
			if (kwh <= 330) {// 用電量<=330
				cost = (int) (kwh * 2.12);
			} else if (kwh > 330 && kwh <= 700) {// 用電量331~700
				cost = (int) (330 * 2.12);
				cost = (int) (cost + (kwh - 330) * 2.91);

			} else if (kwh > 700 && kwh <= 1500) {// 用電量701~1500
				cost = (int) (330 * 2.12);
				cost = (int) (cost + 370 * 2.91);
				cost = (int) (cost + (kwh - 700) * 3.44);

			} else if (kwh > 1500) {// 用電量>1500
				cost = (int) (330 * 2.12);
				cost = (int) (cost + 370 * 2.91);
				cost = (int) (cost + 800 * 3.44);
				cost = (int) (cost + (kwh - 1500) * 5.05);
			} else {
				System.out.println("錯誤");
			}
		} else {// 非營業用電
			if (kwh <= 120) {
				cost = (int) (kwh * 1.63);
			} else if (kwh > 121 && kwh <= 330) {
				cost = (int) (120 * 1.63);
				cost = (int) (cost + (kwh - 120) * 2.10);

			} else if (kwh > 330 && kwh <= 500) {
				cost = (int) (120 * 1.63);
				cost = (int) (cost + 210 * 2.10);
				cost = (int) (cost + (kwh - 330) * 2.89);

			} else if (kwh > 500 && kwh <= 700) {
				cost = (int) (120 * 1.63);
				cost = (int) (cost + 210 * 2.10);
				cost = (int) (cost + 170 * 2.89);
				cost = (int) (cost + (kwh - 500) * 3.94);

			} else if (kwh > 700 && kwh <= 1000) {
				cost = (int) (120 * 1.63);
				cost = (int) (cost + 210 * 2.10);
				cost = (int) (cost + 170 * 2.89);
				cost = (int) (cost + 200 * 3.94);
				cost = (int) (cost + (kwh - 700) * 4.60);
			} else if (kwh > 1000) {
				cost = (int) (120 * 1.63);
				cost = (int) (cost + 210 * 2.10);
				cost = (int) (cost + 170 * 2.89);
				cost = (int) (cost + 200 * 3.94);
				cost = (int) (cost + 300 * 4.60);
				cost = (int) (cost + (kwh - 1000) * 5.03);
			} else {
				System.out.println("錯誤");
			}
		}
		System.out.println(cost);
	}
}
