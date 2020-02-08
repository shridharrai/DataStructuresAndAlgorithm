package trees;

public class BST {
	private class Node {
		int data;
		Node right;
		Node left;
	}
	
	private Node root;

	public BST(int[] arr) {
		super();
		// TODO Auto-generated constructor stub
		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {  //Base Case
			return null;
		}
		//Find mid
		int mid = (lo+hi)/2;
		
		//Create a new Node
		Node nn = new Node();
		nn.data = arr[mid];
		
		nn.left = construct(arr, lo, mid-1);
		nn.right = construct(arr, mid+1, hi);
		
		return nn;
	}
	
	public void display() {
		System.out.println("----------------");
		display(this.root);
		System.out.println("----------------");
	}
	
	private void display(Node node) {
		if (node == null) { //Base Case
			return;
		}
		
		//Self Work
		String str = "";
		
		if(node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		
		str += " -> " + node.data + " <- ";
		
		if(node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		
		System.out.println(str);
		
		//left subtree
		display(node.left);
		//right subtree
		display(node.right);
	}
	
	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) { //Base Case
			return false;
		}
		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}
	
	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if(node.right == null) {
			return node.data;
		}
		
		return max(node.right);
	}
	
	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node node, int item) {
		if (item > node.data) {
			if (node.right == null) {
				//Create new node
				Node nn = new Node();
				nn.data = item;
				//Attach the new node
				node.right = nn;
			} else {
				add(node.right, item);
			}
		} else {
			if (node.left == null) {
				//Create new node
				Node nn = new Node();
				nn.data = item;
				//Attach the new node
				node.left = nn;
			} else {
				add(node.left, item);
			}
		}
	}
	
	public void remove(int item) {
		remove(this.root, null, false, item);
	}

	private void remove(Node node, Node parent, boolean ilc, int item) {
		//If required node not present
		if (node == null) {
			return;
		}
		if (item > node.data) {
			remove(node.right, node, false, item);
		} else if (item < node.data) {
			remove(node.left, node, true, item);
		} else {
			//I. If it is leaf node to remove
			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			//II case
			else if (node.left == null && node.right != null) {
				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			}
			//III case
			else if (node.left != null && node.right == null) {
				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			}
			//IV case
			else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, true, max);
			}
		}
	}
}



