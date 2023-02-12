package hw5_interface;

public class Rectangle implements Shape {
	private double R_lengh, R_weight;

	public Rectangle(int R_lengh, int R_width) {
		this.R_lengh = R_lengh;
		this.R_weight = R_width;
	}

	public void computeArea() {
		System.out.println("面積"+R_lengh*R_weight);
	}

	public void computeCircumference() {
		System.out.println("周長"+(R_lengh+R_weight)*2);
	}
}
