package generics;

public class LinkedListGeneric<T> {
	//Inner class
	private class Node {
		T data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	// O(n)
	public void display() {
		System.out.println("-----------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("-----------------------");
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	//O(1)
	public void addLast(T item) {
		//Create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//attach the node in LinkedList
		if(this.size >= 1) {
			this.tail.next = nn;
		}
		
		//Updation of summary Object
		if (this.size == 0) { //When list is empty
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}
	
	//O(1)
	public void addFirst(T item) {
		//Create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//Attach
		if (this.size >= 1) {
			nn.next = head;
		}
		
		//Summary Object update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}
	
	// O(1)
	public T getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		return this.head.data;
	}
	
	//O(1)
	public T getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		return this.tail.data;
	}
	
	//O(n)
	public T getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	//O(n)
	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		
		return temp;
	}
	
	//O(1)
	public void addAt(T item, int idx) throws Exception {
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid Index");
		}
		
		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {
			//create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			
			//attach
			Node nm1 = getNodeAt(idx-1);
			Node np1 = nm1.next;
			nm1.next = nn;
			nn.next = np1;
			
			//summary update
			this.size++;
		}
	}
	
	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		T rv = this.head.data;
		
		if (this.size == 1) {  //only one node is present in list
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		
		return rv;
	}
	
	// O(n)
	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		T rv = this.tail.data;
		
		if (this.size == 1) { //only one node is present in list
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = getNodeAt(this.size - 2);
			this.tail = sizem2;
			this.tail.next = null;
			this.size--;
		}
		
		return rv;
	}
	
	public T removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size-1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			
			nm1.next = np1;
			
			this.size--;
			
			return n.data;
		}
	}

}
