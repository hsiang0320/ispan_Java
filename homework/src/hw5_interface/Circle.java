package hw5_interface;

public class Circle implements Shape {
	private double radius;
	public Circle(int radius) {
		this.radius = radius;
	}

	public void computeArea() {
		System.out.println("面積:"+Math.round(radius*radius*Math.PI));
	}

	public void computeCircumference() {
		System.out.println("周長:"+Math.round(radius*2*Math.PI));
	}
}
