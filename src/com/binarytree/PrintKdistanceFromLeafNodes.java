package com.binarytree;

public class PrintKdistanceFromLeafNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		print(root,1,0);
	}
	static int[] list = new int[20]; static boolean[] bool = new boolean[20];
	private static void print(BinaryTree root,int target,int index) {
		// TODO Auto-generated method stub
		if(root== null) return ;
		list[index] = root.data;
		bool[index] = false;
		index++;
		if(root.left==null && root.right==null && bool[index - target-1] ==false){
			bool[index - target-1] =true;
			System.out.println(list[index-target-1]);
			return ;
		}
		print(root.left,target,index);
		print(root.right,target,index);
	}

}
