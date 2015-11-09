package com.binarytree;

public class Leftview {

	/**
	 * @param args
	 */
	static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree node = new BinaryTree().getData();
		leftView(node,1);
	}
	private static void leftView(BinaryTree node,int level) {
		// TODO Auto-generated method stub
		if(node == null) return;
		if(level>max ){
			System.out.println(node.data);
			max = level;
		}
		leftView(node.left,level+1);
		leftView(node.right, level+1);
	}

}
