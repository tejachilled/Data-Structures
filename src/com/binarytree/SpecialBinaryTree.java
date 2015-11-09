package com.binarytree;

public class SpecialBinaryTree {

	/**
	 * @param args
	 */
	//static BinaryTree root = new BinaryTree();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,10,40,30,28};
		
		BinaryTree temp= construct(a,0,a.length-1);
		Traversals.inOrder(temp);
	}

	private static BinaryTree construct( int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j) return null;
		
		int index = 0,max=0;
		for(int x=i;x<=j;x++){
			if(max <=a[x]) index = x; max = a[x];
		}	
		System.out.println("i : "+i + " j "+ j+ " index: "+index);
		BinaryTree root = new BinaryTree(a[index]);
		if(i==j) return root;
		root.left = construct(a,i,index-1);
		root.right =construct(a,index+1,j); 
		return root;
	}

}
