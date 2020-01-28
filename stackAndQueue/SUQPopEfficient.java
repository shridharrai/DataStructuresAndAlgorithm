package stackAndQueue;

public class SUQPopEfficient {
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public SUQPopEfficient() throws Exception {
		this.primary = new DynamicQueue();
		this.secondary = new DynamicQueue();
	}
	
	public int size() {
		return this.primary.size();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	// O(n)
	public void push(int data) throws Exception {
		while (this.primary.size() != 0) {
			this.secondary.enqueue(this.primary.dequeue());
		}
		this.primary.enqueue(data);
		
		while(this.secondary.size() != 0) {
			this.primary.enqueue(this.secondary.dequeue());
		}
	}
	
	// O(1)
	public int pop() throws Exception {
		return this.primary.dequeue();
	}
	
	//O(1)
	public int top() throws Exception {
		return this.primary.front();
	}
	
	// O(n)
	public void display() {
		this.primary.display();
	}
	
	public static void main(String[] args) throws Exception {
		SUQPopEfficient stack = new SUQPopEfficient();
		
		for (int i = 1; i <= 6; i++) {
			stack.push(i*10);
		}
		stack.display(); // 60 50 40 30 20 10
		
		System.out.println(stack.top());  //60
		System.out.println(stack.pop());  //60
		stack.display();  // 50 40 30 20 10
		
		System.out.println(stack.size());  //5
	}
}
