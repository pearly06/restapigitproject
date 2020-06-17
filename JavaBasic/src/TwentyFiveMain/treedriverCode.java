package TwentyFiveMain;

public class treedriverCode {

	public static void main(String[] args) {
		String tree = "nlnnlll";
		int n = tree.length();
		depthOfTree dot = new depthOfTree();
		System.out.println(dot.findDepth(tree,n));
		
		///
		sizeOfTree tree1 = new sizeOfTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		System.out.println(tree1.size());
		System.out.println(tree1);

	}

}
