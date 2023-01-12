package hw2;

public class Amstrong {

	public static void main(String[] args) {	
		System.out.print("Amstrong數有:");
		for (int i = 100; i <= 999; i++) {
			int h,t,d=0;
			int tmp=i;
			h=i/100;
			tmp-=h*100;
			t=tmp/10;
			tmp-=t*10;
			d=tmp/1;
			tmp-=d*1;
			if(Math.pow(h,3) + Math.pow(t,3) + Math.pow(d,3) ==i) {
				System.out.print(i+" ");
			}
		}
	}

}
