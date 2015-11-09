package com.binarytree;

public class MaxSumPath {

	/**
	 * @param args
	 */
	static int max = 0;
	static BinaryTree node = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		int val = getMaxSum(root,0);
		System.out.println(val);
		print(root,node);
	}

	private static boolean print(BinaryTree root, BinaryTree target) {
		// TODO Auto-generated method stub
		if(root== null) return true;
		if(target==root || print(root.left,target) || print(root.right,target)){
			System.out.println(root.data);
			return true;
		}
		return false;
		
	}

	private static int getMaxSum(BinaryTree root, int i) {
		// TODO Auto-generated method stub
		if(root  == null) return 0;
		i+=root.data;
		
		if(root.left == null && root.right==null){
			if(i>max){
				max=i;
				node = root;
			}
		}

		getMaxSum(root.left,i);
		getMaxSum(root.right, i);
		return max;
	}

}
