package hw4;

public class Verifier {
	static void f1() {
		for (int i = 0; i < 4; i++) {
			System.out.print((int) (Math.random() * 10));
		}
		System.out.println();
	}

	static void f2() {
		boolean error = true;
		int[] check = new int[4];
		int n = 0;
		do {
			if (n == 0) {
				check[n] = (int) (Math.random() * 10);
				n++;
			} else {
				check[n] = (int) (Math.random() * 10);
				for (int i = 0; i < n; i++) {
					if (check[i] != check[n]) {
						error = false;
					} else {
						error = true;
						break;
					}
				}
				if (error == false) {
					n++;
				}
			}

		} while (n < 4);
		for (int i = 0; i < check.length; i++) {
			System.out.print(check[i]);
		}
		System.out.println();
	}

	static void f3() {
		char[] ans = new char[6];
		int index = 0;
		int e = 0, n = 0;
		int ascii = 60;
		while (index <= 5) {
			ascii = 60;
			while (ascii >= 58 && ascii <= 64) {
				ascii = (int) (Math.random() * (90 - 48 + 1) + 48);
			}
			if (ascii >= 48 && ascii <= 57) {
				ans[index] = (char) ascii;
				n++;
				index++;
			} else {
				ans[index] = (char) ascii;
				e++;
				index++;
			}
			if (index == 6 && (e == 0 || n == 0)) {
				index = 0;
			}
		}
		// System.out.println(e);
		// System.out.println(n);
		// System.out.println(index);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		f1();// 第一題
		f2();// 第二題
		f3();
		// System.out.print((char)66);
	}

}
