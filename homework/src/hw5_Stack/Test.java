package hw5_Stack;

public class Test {

	public static void main(String[] args) {
		Stack s = new Stack();
		try {
			s.push(0);
			s.push(0);
			s.getData();
			s.push(0);
			s.push(0);
		} catch (StackFullException e) {
			System.out.println("StackFullException");
		}
		try {
			s.pop();
			s.pop();
			s.getData();
			s.pop();
			s.pop();
		} catch (StackEmptyException e) {
			System.out.println("StackEmptyException");
		}

	}

}
