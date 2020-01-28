package stackAndQueue;

public class DynamicQueue extends QueueUsingArrays {

	public DynamicQueue() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}
	
	@Override
	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			
			for (int i = 0; i < this.size(); i++) {
				arr[i] = this.data[(this.front + i)%this.data.length];
			}
			this.data = arr;
			this.front = 0;
		}
		
		super.enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
			queue.display();
		}
		queue.dequeue();
		queue.dequeue();
		queue.display();
		
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();
		queue.enqueue(80);
		queue.enqueue(90);
		queue.display();
		
		queue.dequeue();
		queue.display();
	}

}
