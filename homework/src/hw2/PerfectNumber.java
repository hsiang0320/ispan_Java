package hw2;


public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		System.out.print("1~100的完美數有:");
		for (int i = 1; i <= 100; i++) {
			sum = 0;
			for (int j = 1; j <= i/2; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}
}
