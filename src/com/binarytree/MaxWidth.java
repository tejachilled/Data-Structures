package com.binarytree;

public class MaxWidth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		int maxHeight = findWidth(root,Depth.findDepth(root));
		System.out.println(maxHeight);
	}

	private static int findWidth(BinaryTree root,int height) {
		// TODO Auto-generated method stub
		int[] count = new int[height];
		findNumOfNodesEachLevel(root,count,0);
		int max = 0;
		for(int i : count){
			if(i>max)max = i;
		}
		return max;
	}


	private static void findNumOfNodesEachLevel(BinaryTree root, int[] count,int level) {
		// TODO Auto-generated method stub
		if(root!=null){
			count[level]++;
			findNumOfNodesEachLevel(root.left,count,level+1);
			findNumOfNodesEachLevel(root.right,count,level+1);
		}
		
	}

}
