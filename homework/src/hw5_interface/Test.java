package hw5_interface;

public class Test {

	public static void main(String[] args) {
		Shape r1 = new Rectangle(5, 10);
		r1.computeArea();
		r1.computeCircumference();
		Shape c1 = new Circle(10);
		c1.computeArea();
		c1.computeCircumference();
		
	}

}
