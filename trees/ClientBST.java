package trees;

public class ClientBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {10, 20, 30, 40, 50, 60, 70};
		BST bst = new BST(in);
		bst.display();
		System.out.println(bst.find(10));
		System.out.println(bst.max());
		bst.add(55);
		bst.display();
		
		bst.remove(55);
		bst.display();
		
		bst.remove(40);
		bst.display();
		
		bst.remove(80);
		bst.display();
	}

}
