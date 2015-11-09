package com.binarytree;

public class PrintKdistancefromNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		printAll(root,2,2);
	}

	private static int printAll(BinaryTree root, int target, int k) {
		// TODO Auto-generated method stub
		if(root ==null || k<0) return -1;
		if(root.data == target){
			printDownNodes(root,k);
			return 0;
		}
		int ld = printAll(root.left,target,k);
		if(ld!=-1){
			if(ld+1==k){
				System.out.println(root.data);
			}else{
				printDownNodes(root.right,k-2-ld);
			}				
				return ld+1;
		}
		int rd = printAll(root.right, target, k);
		if(rd!=-1){
			if(rd+1==k){
				System.out.println(root.data);
			}else{
				printDownNodes(root.left,k-2-rd);
			}
				return rd+1;
		}
		return -1;		
	}

	private static void printDownNodes(BinaryTree root, int k) {
		// TODO Auto-generated method stub
		if(root == null) return;
		if(k==0){
			System.out.println(root.data); return;
		}
		printDownNodes(root.left,k-1);
		printDownNodes(root.right,k-1);
	}

}
