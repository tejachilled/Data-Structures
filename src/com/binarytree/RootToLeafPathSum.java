package com.binarytree;

public class RootToLeafPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		find(root,8,new int[5],0);
	}

	private static void find(BinaryTree root, int target, int[] arr,int index) {
		// TODO Auto-generated method stub
		if(root == null) return ;
		arr[index] = root.data;
		if(target - root.data == 0){
			for(int j : arr){
				System.out.print( j+" ");
			}			
		}
		find(root.left,target-root.data,arr,index+1);
		find(root.right,target-root.data,arr,index+1);
	}

}
