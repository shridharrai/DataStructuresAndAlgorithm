package stackAndQueue;

public class QUSEnqueueEfficient {
	private DynamicStack primary;
	private DynamicStack secondary;
	
	public QUSEnqueueEfficient() throws Exception {
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public int size() {
		return this.primary.size();
	}
	
	// O(1)
	public void enqueue(int data) throws Exception {
		this.primary.push(data);
	}
	
	// O(n)
	public int dequeue() throws Exception {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}
		int rv = primary.pop();
		
		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
		
		return rv;
	}
	
	public int front() throws Exception {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}
		int rv = primary.top();
		
		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
		
		return rv;
	}
	
	public void display() throws Exception {
		reverseStack(primary, secondary, 0);
		primary.display();
		reverseStack(primary, secondary, 0);
	}
	
	public static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
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
		QUSEnqueueEfficient queue = new QUSEnqueueEfficient();
		
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
		}
		
		queue.display(); //10 20 30 40 50
		
		System.out.println(queue.dequeue()); //10
		queue.display(); //20 30 40 50
		
		System.out.println(queue.front()); //20
	}
}
