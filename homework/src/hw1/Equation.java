package hw1;

public class Equation {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 2;
		double ans1;
		double ans2;
		if (Math.pow(b, 2) - 4 * a * c > 0) {
			System.out.println("有兩個不相等實根");
			ans1= (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			ans2= (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			System.out.println("ans1:"+ans1+" ans2:"+ans2);
		} else if (Math.pow(b, 2) - 4 * a * c == 0) {
			System.out.println("有兩個相等實根");
			ans1= (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			System.out.println("ans:"+ans1);
		} else if (Math.pow(b, 2) - 4 * a * c < 0) {
			System.out.println("沒有實根");
		}
	}

}
