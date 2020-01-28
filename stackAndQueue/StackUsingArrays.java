package stackAndQueue;

public class StackUsingArrays {
	protected int[] data;
	protected int top;
	public static final int DEFAULT_CAPACITY = 10;
	
	public StackUsingArrays(int capacity) throws Exception {
		if(capacity < 1) {
			throw new Exception("Invalid Capacity");
		}
		
		this.data = new int[capacity];
		this.top = -1;
	}
	
	public StackUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return this.top + 1;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void push(int value) throws Exception {
		if(this.size() == this.data.length) {
			throw new Exception("Stack is Full");
		}
		
		this.top++;
		this.data[this.top] = value;
	}
	
	public int pop() throws Exception {
		if(this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rv;
	}
	
	public int top() throws Exception {
		if(this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.top];
		return rv;
	}
	
	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + ",");
		}
		System.out.println("END");
	}
	
	
	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		// TODO Auto-generated method stub
		if (stack.isEmpty()) {     //BaseCase
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index+1);
		helper.push(item);
		
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
//		StackUsingArrays stack = new StackUsingArrays(5);
//		for (int i = 1; i <= 5; i++) {
//			stack.push(i*10);
//			stack.display();
//		}
////		stack.push(60);
//		System.out.println(stack.top());
//		
//		while (!stack.isEmpty()) {
//			stack.display();
//			stack.pop();
//		}
//		stack.pop();
		
		//Reverse A Stack
		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i*10);
		}
		stack.display();
		
		StackUsingArrays helper = new StackUsingArrays(5);
		reverseStack(stack, helper, 0);
		stack.display();
	}

	
}
