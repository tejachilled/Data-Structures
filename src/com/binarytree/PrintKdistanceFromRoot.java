package com.binarytree;

public class PrintKdistanceFromRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		print(root,1);
	}

	private static void print(BinaryTree root, int i) {
		// TODO Auto-generated method stub
		if(root == null) return;
		if(i==0) System.out.println(root.data);
		print(root.left,i-1);
		print(root.right,i-1);
	}

}
