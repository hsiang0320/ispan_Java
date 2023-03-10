package hw4;

import java.util.Scanner;

public class IDGenerator {
	static int getRegionCode(String region) {
		char region_code = 0;
		switch (region) {
		case "台北市":
			region_code = 10;
			break;
		case "臺北市":
			region_code = 10;
			break;
		case "台中市":
			region_code = 11;
			break;
		case "臺中市":
			region_code = 11;
			break;
		case "基隆市":
			region_code = 12;
			break;
		case "台南市":
			region_code = 13;
			break;
		case "臺南市":
			region_code = 13;
			break;
		case "高雄市":
			region_code = 14;
			break;
		case "新北市":
			region_code = 15;
			break;
		case "宜蘭縣":
			region_code = 16;
			break;
		case "桃園市":
			region_code = 17;
			break;
		case "嘉義市":
			region_code = 34;
			break;
		case "新竹縣":
			region_code = 18;
			break;
		case "苗栗縣":
			region_code = 19;
			break;
		case "南投縣":
			region_code = 21;
			break;
		case "彰化縣":
			region_code = 22;
			break;
		case "新竹市":
			region_code = 35;
			break;
		case "雲林縣":
			region_code = 23;
			break;
		case "嘉義縣":
			region_code = 24;
			break;
		case "屏東縣":
			region_code = 27;
			break;
		case "花蓮縣":
			region_code = 28;
			break;
		case "台東縣":
			region_code = 29;
			break;
		case "臺東縣":
			region_code = 29;
			break;
		case "金門縣":
			region_code = 32;
			break;
		case "澎湖縣":
			region_code = 30;
			break;
		case "連江縣":
			region_code = 33;
			break;
		case "台中縣":
			region_code = 20;
			break;
		case "臺中縣":
			region_code = 20;
			break;
		case "台南縣":
			region_code = 25;
			break;
		case "臺南縣":
			region_code = 25;
			break;
		case "高雄縣":
			region_code = 26;
			break;
		case "陽明山管理局":
			region_code = 31;
			break;

		default:
			System.out.print("無此縣市");
			break;
		}
		return region_code;
	}

	static int getSexCode(String sex) {
		int sex_code = 0;
		switch (sex) {
		case "M":
			sex_code = 1;
			break;
		case "m":
			sex_code = 1;
			break;
		case "F":
			sex_code = 2;
			break;
		case "f":
			sex_code = 2;
			break;

		default:
			break;
		}
		return sex_code;
	}

	static void randomID(int region_code, int sex_code) {
		int[] id = new int[9];
		int count = 0;
		int num = 8;
		id[0] = sex_code;
		for (int i = 1; i < id.length - 1; i++) {
			id[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < id.length - 1; i++) {
			count += id[i] * num;
			num--;
		}
		count += (region_code / 10) * 1;
		count += (region_code % 10) * 9;
		if ((count % 10) == 0) {
			id[8] = 0;
		} else {
			id[8] = 10 - (count % 10);
		}

		switch (region_code) {
		case 10:
			System.out.print("A");
			break;
		case 11:
			System.out.print("B");
			break;

		case 12:
			System.out.print("C");
			break;

		case 13:
			System.out.print("D");
			break;

		case 14:
			System.out.print("E");
			break;

		case 15:
			System.out.print("F");
			break;

		case 16:
			System.out.print("G");
			break;

		case 17:
			System.out.print("H");
			break;

		case 34:
			System.out.print("I");
			break;

		case 18:
			System.out.print("J");
			break;

		case 19:
			System.out.print("K");
			break;
		case 21:
			System.out.print("M");
			break;

		case 22:
			System.out.print("N");
			break;
		case 35:
			System.out.print("O");
			break;

		case 23:
			System.out.print("P");
			break;
		case 24:
			System.out.print("Q");
			break;

		case 27:
			System.out.print("T");
			break;
		case 28:
			System.out.print("U");
			break;

		case 29:
			System.out.print("V");
			break;
		case 32:
			System.out.print("W");
			break;

		case 30:
			System.out.print("X");
			break;
		case 33:
			System.out.print("Z");
			break;
		case 20:
			System.out.print("L");
			break;
		case 25:
			System.out.print("R");
			break;
		case 26:
			System.out.print("S");
			break;
		case 31:
			System.out.print("Y");
			break;

		default:
			break;
		}
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i]);
		}

	}

	public static void main(String[] args) {
		String region = new String();
		String sex = new String();
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入地區");
		region = scanner.next();
		System.out.println("請輸入性別(M or F)");
		sex = scanner.next();
		randomID(getRegionCode(region), getSexCode(sex));
		scanner.close();

	}

}
