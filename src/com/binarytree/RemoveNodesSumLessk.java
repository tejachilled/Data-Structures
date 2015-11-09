package com.binarytree;

public class RemoveNodesSumLessk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		//root.left.left.left = new BinaryTree(1);
		Traversals.inOrder(root);		
		System.out.println();
		removeNodes(root,0,9);
		System.out.println();
		Traversals.inOrder(root);
	}

	private static BinaryTree removeNodes(BinaryTree root,int sum,int target) {
		// TODO Auto-generated method stub
		if(root == null) return null; 
		sum+=root.data;
		
		root.left = removeNodes(root.left,sum,target);
		root.right = removeNodes(root.right,sum,target);
		if(root.right == null && root.left == null){
	        if(sum < target) return null;
	        else return root;
	    }
		return root;
	}

}
