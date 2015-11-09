package com.binarytree;

public class IdenticalTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root1 = new BinaryTree().getData();
		BinaryTree root2 = new BinaryTree().getData();
		System.out.println(check(root1,root2));
	}

	private static boolean check(BinaryTree root1, BinaryTree root2) {
		// TODO Auto-generated method stub
		if(root1!=null && root2!=null){
			if(root1.data == root2.data){
				
			check(root1.left,root2.left);check(root1.right,root2.right);
			return true;}
			else
				return false;
		}
		return true;
	}

}
