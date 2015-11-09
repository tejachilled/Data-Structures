package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		spiral(root);
		int height = Depth.findDepth(root);
		boolean flag = true;
		System.out.println();
		for(int i=0;i<height; i++){			
			spiralRecursive(root,i,flag);
			flag = !flag;
		}
		
	}

	private static void spiralRecursive(BinaryTree root, int i, boolean flag) {
		if(root == null) return;
		if(i==0)System.out.print(root.data+ " ");
		if(flag){
			spiralRecursive(root.left,i-1,flag);spiralRecursive(root.right,i-1,flag);
		}else{
			spiralRecursive(root.right,i-1,flag);spiralRecursive(root.left,i-1,flag);
		}
	}

	private static void spiral(BinaryTree root) {
		Stack<BinaryTree> s1 = new Stack<BinaryTree>();
		Stack<BinaryTree> s2 = new Stack<BinaryTree>();
		s1.push(root);
		BinaryTree temp = null;
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				temp = s1.pop();
				System.out.print(temp.data+" ");
				if(temp.left!=null)s2.add(temp.left);
				if(temp.right!=null)s2.add(temp.right);
			}
			while(!s2.isEmpty()){
				temp = s2.pop();
				System.out.print(temp.data+" ");
				if(temp.right!=null)s1.add(temp.right);
				if(temp.left!=null)s1.add(temp.left);
			}
		}
	}

}
