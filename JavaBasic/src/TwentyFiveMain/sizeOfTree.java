package TwentyFiveMain;

public class sizeOfTree {
	Node root;
	//given a binary tree .prints its nodes in level order using array for implementing queue
	int size() {
		return size(root);
	}
	
	//computes number of nodes in tree
	int size(Node node) {
		if(node==null) {
			return 0;
		}else {
			return(size(node.left)+1+size(node.right));
		}
	}

}
