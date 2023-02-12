package hw5_Stack;

public class Stack {
	int[] data = new int[3];
	int top = 0;

	public void push(int num) throws StackFullException {

		if (top < data.length) {
			data[top] = num;
			top++;
		} else {
			throw new StackFullException();
		}

	}

	public void pop ()throws StackEmptyException{
		if (top > 0) {
			top--;
		}else {
			throw new StackEmptyException();
		}

	}
	public void getData() {
		for(int i =0;i<top;i++) {
			System.out.println(data[i]);
		}
	}
}
