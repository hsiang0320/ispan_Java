package hw2;


public class Expression {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum2=0;
		boolean positive = true;
		//i+1平方-i平方=2i+1
		 for (int i = 2; i < 50; i += 2)
		  { 
			 sum += i + (i + 1); 
			 }
		  System.out.println(1 + sum - Math.pow(50, 2));
		//i+1平方-i平方=2i+1

		for (int j = 1; j <= 50; j++) {
			if (positive) {
				sum2 += Math.pow(j, 2);
				positive = false;
			} else {
				sum2 -= Math.pow(j, 2);
				positive = true;
			}
		}
		System.out.println(sum2);

		
		

	

}}

