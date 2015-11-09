package com.binarytree;

public class LeafNodeCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		System.out.println(countLeafNodes(root));
	}

	private static int countLeafNodes(BinaryTree root) {		
		if(root== null) return 0;
		if(root.left== null && root.right == null) return 1;
		return countLeafNodes(root.left)+countLeafNodes(root.right);
	}

}
