package TwentyFiveMain;



public class creatingBinaryTree {

	public static void main(String[] args) {
		
		
		BinaryTree tree = new BinaryTree();
		 /*create root*/
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		System.out.println(tree);
		//print2D(tree); 

	}
	
	

}
