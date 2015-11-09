package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		//level(root);
		int height = Depth.findDepth(root);
		for(int i=0;i<height; i++){
			levelRecursive(root,i,0);
		}
		
	}

	private static void levelRecursive(BinaryTree root, int level,int i) {
		if(root == null) return;
		if(level == i) System.out.println(root.data);
		levelRecursive(root.left,level,i+1);
		levelRecursive(root.right,level,i+1);
	}

	private static void level(BinaryTree root) {
		if(root==null) return;		
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			System.out.print(temp.data + " ");
			if(root.left!=null) queue.add(temp.left);
			if(root.right!=null) queue.add(temp.right);
		}		
	}
	
	

}
