package stackAndQueue;

import recursion.Question;

public class QUSDequeueEfficient {
	private DynamicStack primary;
	private DynamicStack secondary;
	
	public QUSDequeueEfficient() throws Exception {
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public int size() {
		return this.primary.size();
	}
	
	// O(n)
	public void enqueue(int data) throws Exception {
		while (primary.size() != 0) {
			secondary.push(primary.pop());
		}
		primary.push(data);
		
		while (secondary.size() != 0) {
			primary.push(secondary.pop());
		}
	}
	
	// O(1)
	public int dequeue() throws Exception {
		return this.primary.pop();
	}
	
	// O(1)
	public int front() throws Exception {
		return this.primary.top();
	}
	
	// O(n)
	public void display() {
		this.primary.display();
	}
	
	public static void main(String[] args) throws Exception {
		QUSDequeueEfficient queue = new QUSDequeueEfficient();
		
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
		}
		queue.display(); //10 20 30 40 50
		
		System.out.println(queue.dequeue()); //10
		queue.display(); //20 30 40 50
		System.out.println(queue.front()); //20
	}
}
