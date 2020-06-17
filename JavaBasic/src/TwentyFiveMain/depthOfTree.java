package TwentyFiveMain;

public class depthOfTree {
	
	//function to return max of left subtree height or right subtree 
	
	static int findDepthRec(String tree,int n ,int index) {
		if(index>=n||tree.charAt(index)=='l') {
		return 0;
		}
		//calc height ofsubtree (in preorder left subtree is processed before right)
		index++;
		int left = findDepthRec(tree,n,index);
		index++;
		//calc of right
		int right = findDepthRec(tree,n,index);
		return Math.max(left, right)+1;
				}
	
	//Wrapper over findDepthRec()
	static int findDepth(String tree,int n) {
		int index=0;
		return(findDepthRec(tree,n,index));
	}

}
