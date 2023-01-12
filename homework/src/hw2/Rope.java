package hw2;

public class Rope {

	public static void main(String[] args) {
		int length=3000;
		int count=0;
		while(length>=5) {
			length/=2;
			count++;
		}
		System.out.print("第"+count+"天繩子長度小於5公尺");
	}

}
