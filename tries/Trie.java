package tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	private class Node {
		char data;
		HashMap<Character, Node> children;
		boolean isTerminal;
		
		Node(char data, boolean isTerminal) {
			this.data = data;
			this.children = new HashMap<>();
			this.isTerminal = isTerminal;
		}
	}
	
	private int numWords;
	private Node root;
	
	Trie() {
		this.root = new Node('\0', false);
		this.numWords = 0;
	}
	
	public int numWords() {
		return this.numWords;
	}
	
	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node parent, String word) {
		// TODO Auto-generated method stub
		if (word.length() == 0) { //base Case
			if (parent.isTerminal) {
				//Word already exists in dictionary
			} else {
				parent.isTerminal = true;
				this.numWords++;
			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}
		
		this.addWord(child, ros);
	}
	 
	public void display() {
		display(this.root, "");
	}

	private void display(Node node, String osf) {
		// TODO Auto-generated method stub
		if (node.isTerminal) { //baseCase
			String todisplay = osf.substring(1) + node.data;
			System.out.println(todisplay);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + node.data);
		}
	}
	
	public boolean search(String word) {
		return this.search(this.root, word);
	}

	private boolean search(Node parent, String word) {
		// TODO Auto-generated method stub
		if (word.length() == 0) {
			if (parent.isTerminal) {
				return true;
			} else {
				return false;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			return false;
		}
		
		return this.search(child, ros);
	}
}
