package hw2;

public class Stars {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 9; i += 2) {
			System.out.println();
			for (int j = 0; j < (int) ((9 - i) / 2); j++) {
				System.out.print(" ");
			}
			for(int z=0 ;z<=i;z++) {
				System.out.print("*");
			}
			
		}

	}
}
