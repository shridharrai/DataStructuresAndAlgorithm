package trees;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
		public Node(int data, Node left, Node right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
		
		private Node root = null;
		private int size = 0;
		
		BinaryTree() {
			Scanner s = new Scanner(System.in);
			this.root = takeInput(s, null, false);
		}

		private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
			if (parent == null) {
				System.out.println("Enter the data for root node");
			} else {
				if (isLeftOrRight) {
					System.out.println("Enter the data for left child of "+parent.data);
				} else {
					System.out.println("Enter the data for right child of "+parent.data);
				}
			}
			
			int nodeData = s.nextInt();
			Node node = new Node(nodeData, null, null);
			this.size++;
			
			boolean choice = false;
			System.out.println("Do You have left child of "+node.data);
			choice = s.nextBoolean();
			
			if(choice) {
				node.left = takeInput(s, node, true);
			}
			
			choice = false;
			System.out.println("Do You have right child of "+node.data);
			choice = s.nextBoolean();
			
			if(choice) {
				node.right = takeInput(s, node, false);
			}
			
			return node;
		}
		
		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			String str = "";
			if(node.left != null) {
				str = str + node.left.data + "=>";
			} else {
				str = str + "End=>";
			}
			str = str + node.data;
			
			if(node.right != null) {
				str = str + "<=" +  node.right.data;
			} else {
				str = str + "<=End";
			}
			System.out.println(str);
			
			if (node.left != null) {
				this.display(node.left);
			}
			if (node.right != null) {
				this.display(node.right);
			}
		}
		
		public static void main(String[] args) {
			// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
			BinaryTree tree = new BinaryTree();
			tree.display();
		}
}
