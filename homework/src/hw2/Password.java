package hw2;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String passward = new String("123");
		String inputPassward = new String("");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		do {
			if(count==3) {
				System.out.println("密碼輸入超過3次");
				System.exit(0);//System.exit(0) ： 将整个虚拟机里的内容都关掉，内存都释放掉！正常退出程序。
			}
			System.out.println("請輸入密碼：");
			inputPassward = scanner.next();
			count++;
		} while (!inputPassward.equals(passward));
		scanner.close();
		System.out.print("密碼輸入正確，歡迎使用本系統");
	}
}