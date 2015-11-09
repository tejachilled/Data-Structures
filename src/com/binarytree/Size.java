package com.binarytree;

public class Size {


	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		System.out.println(findSize(root));
		
	}

	private static int findSize(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		else
			return 1+findSize(root.left)+findSize(root.right);
	}

}
