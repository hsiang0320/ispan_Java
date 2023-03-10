package hw4;

import java.util.Scanner;

public class CheckID {
	static boolean isID(String id) {
		int reg = 0;
		int check = 0;
		int num = 8;
		if (id.length() != 10) {
			return false;
		}
		if (!((id.charAt(0) >= 65 && id.charAt(0) <= 90))) {
			return false;
		}
		if (id.charAt(1) != 49 && id.charAt(1) != 50) {
			return false;
		}
		for (int i = 2; i <= 9; i++) {
			if (id.charAt(i) < 48 || id.charAt(i) > 57) {
				return false;
			}
		}
		if (id.charAt(0) >= 65 && id.charAt(0) <= 72) {
			reg = id.charAt(0) - 55;
		} else if (id.charAt(0) == 73) {// I
			reg = 34;
		} else if (id.charAt(0) >= 74 && id.charAt(0) <= 78) {
			reg = id.charAt(0) - 56;
		} else if (id.charAt(0) == 79) {// O
			reg = 35;
		} else if (id.charAt(0) >= 80 && id.charAt(0) <= 86) {
			reg = id.charAt(0) - 57;
		} else if (id.charAt(0) == 87) {// W
			reg = 32;
		} else if (id.charAt(0) >= 88 && id.charAt(0) <= 90) {
			reg = id.charAt(0) - 58;
		}
		for (int i = 1; i < 9; i++) {
			check += (id.charAt(i) - 48) * num;
			// System.out.println("num:" + num + " i:" + i);
			num--;
		}
		check += (reg % 10) * 9;
		check += (reg / 10) * 1;
		System.out.println(check);
		check = check % 10;
		if (10 - check != id.charAt(9) - 48) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = new String();
		System.out.println("請輸入身分證字號");
		id = scanner.next();
		// System.out.println(id.charAt(0)>=66);
		System.out.print(isID(id));
		scanner.close();
	}

}
