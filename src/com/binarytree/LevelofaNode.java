package com.binarytree;

public class LevelofaNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		System.out.println(getLevel(root,4,1));
	}

	private static int getLevel(BinaryTree root, int node,int level) {
		// TODO Auto-generated method stub
		if(root== null) return 0;
		if(root.data == node) return level;
		int temp = getLevel(root.left,node,level+1);
		if(temp!= 0 )return temp;
		temp = getLevel(root.right,node,level+1);
		return temp;
	}

}
