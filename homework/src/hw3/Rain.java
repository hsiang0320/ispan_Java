package hw3;

import java.util.Scanner;

public class Rain {

	public static void main(String[] args) {// 5*4*3
		int year, season = 0, month;
		double ans = 0;
		double[][][] rainRec = {
				{ { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 } },
				{ { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 } },
				{ { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 } },
				{ { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 } },
				{ { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 }, { 60.5, 50.2, 89.2 } } };
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入all、year、season、month\n");
		String selectType = scanner.next();
		if (!selectType.equals("all") && !selectType.equals("year") && !selectType.equals("season")
				&& !selectType.equals("month")) {// 輸入錯誤判斷
			System.out.print("error");
			System.exit(0);
		} else if (selectType.equals("all")) {// ------------------all計算
			for (int i = 0; i < rainRec.length; i++) {// 這裡做all
				for (int j = 0; j < rainRec[i].length; j++) {
					for (int z = 0; z < rainRec[i][j].length; z++) {
						ans += rainRec[i][j][z];
					}
				}
			}
			System.out.print("all" + ans);
		} // ------------------------------------------------------------all計算
		else {
			System.out.print("輸入一個正整數指定年/季/月\n");
			if (selectType.equals("year")) {// -------------------------年雨量計算
				year = scanner.nextInt();
				if (year > 5 || year < 1) {
					System.out.print("年 輸入錯誤");
				} else {
					for (int i = 0; i < rainRec[year - 1].length; i++) {
						for (int j = 0; j < rainRec[year - 1][i].length; j++) {
							ans += rainRec[year - 1][i][j];
						}
					}
					System.out.print("第" + year + "年雨量:" + ans);
				}
			} // ----------------------------------------------------------年雨量計算
			else if (selectType.equals("season")) {// -----------季雨量計算
				season = scanner.nextInt();
				if (season > 4 || season < 1) {
					System.out.print("季 輸入錯誤");
				} else {
					for (int i = 0; i < rainRec.length; i++) {
						for (int j = 0; j < rainRec[i][season - 1].length; j++) {
							ans += rainRec[i][season - 1][j];
						}
					}
					System.out.print("第" + season + "季總雨量:" + ans);
				} // ---------------------季雨量計算
			} else if (selectType.equals("month")) {// --------月雨量計算
				month = scanner.nextInt();
				if (month > 12 || month < 1) {
					System.out.print("月 輸入錯誤");
				} else {
					System.out.print("第" + month + "月總雨量為:");
					if (month >= 1 && month <= 3) {
						season = 0;
					} else if (month >= 4 && month <= 6) {
						season = 1;
					} else if (month >= 7 && month <= 9) {
						season = 2;
					} else if (month >= 10 && month <= 12) {
						season = 3;
					}
					if (month % 3 != 0) {
						month =(month %3)-1;
					} else {
						month = 2;
					}
					for (int i = 0; i < rainRec.length; i++) {
						//System.out.print(i+" "+season+" "+month);
						ans += rainRec[i][season][month];
					}
				}
				System.out.print(ans);
			} // --------------------------月雨量計算
			
		}
		scanner.close();
	}

}
