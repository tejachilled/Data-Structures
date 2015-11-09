package com.binarytree;

public class RootToLeafPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		printPaths(root, new int[7],0);
	}

	private static void printPaths(BinaryTree root, int[] arr,int index) {
		if(root == null){
			return;
		}
		arr[index] = root.data;
		index++;
		if(root.left ==null && root.right==null){
			for(int a: arr){
				System.out.print(a + " ");
			}
			System.out.println();
		}else{		
			printPaths(root.left, arr,index);
			printPaths(root.right, arr,index);
		}
	}

}
