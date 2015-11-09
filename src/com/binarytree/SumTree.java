package com.binarytree;


public class SumTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getSumTreeData();
		System.out.println(sumTree(root));
	}

	

	static boolean sumTree(BinaryTree n)
	{		
		if(n == null) return true;
		if(n.left == null && n.right == null) return true;
		
		if(sumTree(n.left) && sumTree(n.right)){
			int ls = 0,rs = 0;
			if(n.left == null) ls =0;
			else if(isLeaf(n.left)) ls = n.left.data;
			else ls = 2* n.left.data;
			
			if(n.right == null) rs =0;
			else if(isLeaf(n.right)) rs = n.right.data;
			else rs = 2* n.right.data;
			
			if(n.data == ls+rs) return true;
		}
		return false;
	}

	private static boolean isLeaf(BinaryTree root) {
		if(root == null || (root.left == null && root.right == null)) return true;
		return false;
	}
}
