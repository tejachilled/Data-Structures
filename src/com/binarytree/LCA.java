package com.binarytree;

public class LCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree node  = new BinaryTree().getData();
		Traversals.inOrder(node);System.out.println();
		System.out.println(findLCA(node,6,7).data);
	}

	private static BinaryTree findLCA(BinaryTree node, int i, int j) {
		// TODO Auto-generated method stub
		if(node == null) return null;
		if(i==node.data || j== node.data){
			return node;
		}
		BinaryTree left = findLCA(node.left, i, j);
		BinaryTree right = findLCA(node.right, i, j);
		
		if(left!=null && right!=null){
			return node;
		}
		return (left!=null ? left: right);
	}

}
