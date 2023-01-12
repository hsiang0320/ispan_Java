package hw2;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個整數：");
		num = scanner.nextInt();
		System.out.print(num + "的因數為");
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.print(num);
		scanner.close();
	}

}
