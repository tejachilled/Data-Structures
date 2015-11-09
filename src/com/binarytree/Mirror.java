package com.binarytree;

public class Mirror {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		Traversals.inOrder(root);
		mirror(root);
		System.out.println();
		Traversals.inOrder(root);
	}

	private static BinaryTree mirror(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null) return null;
		if(root.left!=null || root.right!= null){
			BinaryTree temp;
			mirror(root.left);
			mirror(root.right);
			BinaryTree left = root.left;
			BinaryTree right = root.right;
			temp = left;
			root.left = right;
			root.right = temp;
		}
		return root;
	}

}
