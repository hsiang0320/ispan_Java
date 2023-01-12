package hw1;

public class Refund {

	public static void main(String[] args) {
		int payableAmount = 2000;
		int paidAmount = 3528;
		int dif = 0;// 差額
		if (payableAmount == paidAmount) {
			System.out.println("不必找錢");
		} else if (paidAmount < payableAmount) {
			System.out.println("金額不足");
		} else if (paidAmount > payableAmount) {
			dif = paidAmount - payableAmount;
			System.out.println("差額為:" + dif + "元");
			if (dif >= 1000) {
				System.out.print(dif / 1000 + "張1000元紙鈔 ");
				dif = dif % 1000;
			}
			if (dif >= 500) {
				System.out.print(dif / 500 + "張500元紙鈔 ");
				dif = dif % 500;
			}
			if (dif >= 100) {
				System.out.println(dif / 100 + "張100元紙鈔 ");
				dif = dif % 100;
			}
			if (dif >= 50) {
				System.out.print(dif / 50 + "枚50元硬幣 ");
				dif = dif % 50;
			}
			if (dif >= 10) {
				System.out.print(dif / 10 + "枚10元硬幣 ");
				dif = dif % 10;
			}
			if (dif >= 5) {
				System.out.print(dif / 5 + "枚5元硬幣 ");
				dif = dif % 5;
			}
			if (dif >= 1) {
				System.out.println(dif / 1 + "枚1元硬幣");
				dif = dif % 1;
			}
		}

	}

}
