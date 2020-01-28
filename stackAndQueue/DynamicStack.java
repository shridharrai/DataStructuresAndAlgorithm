package stackAndQueue;

public class DynamicStack extends StackUsingArrays {

	public DynamicStack() throws Exception {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}
    public DynamicStack(int capacity) throws Exception {
		// TODO Auto-generated constructor stub
    	super(capacity);
	}
    
    @Override
    public void push(int item) throws Exception {
    	if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			
			for (int i = 0; i < this.size(); i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
    	
    	super.push(item);
    }
    
    public static void main(String[] args) throws Exception {
    	StackUsingArrays stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i*10);
			stack.display();
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.display();
		System.out.println(stack.top());
		
		while (!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}
//		stack.pop();
	}

}
