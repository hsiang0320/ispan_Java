package hw2;

public class Interest {

	public static void main(String[] args) {
		int money1=100000;
		int money2=100000;
		int year=0;
		while(money2<=money1) {
			year++;
			money1=(int) (100000*(1+0.1*year));
			money2=(int) (100000*Math.pow(1.05, year));
		}
		System.out.print("需要多少年:"+year);
	}

}
