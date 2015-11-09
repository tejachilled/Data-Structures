package com.binarytree;


public class InorderSuccessor {

	/**
	 * @param args
	 */
	static class Node{
		int data;
		Node left;
		Node right;
		Node next;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			this.next = null;
		}
	}
	static Node temp = null;
	public static void main(String[] args) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		
		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		
		three.left = six;
		three.right= seven;
		
		six.left = eight;
		eight.right = nine;
		
		Node display = one;
		
		inOrderSuccessor(one);
		System.out.println(display.left.next.data);
		
		/**
		 * Constructing parent for nodes
		 * 
		 * 			1
		 * 		2		3
		 * 4		5 6		7
		 * 			  /		
		 * 			  8
		 * 				\
		 * 				9
		 */
		
		two.next = one;
		four.next = two;
		five.next = two;
		three.next = one;
		six.next = three;
		seven.next = three;
		eight.next = six;
		nine.next = eight;
		System.out.println(inOrderSuccessorIterative(six));
		System.out.println(inOrderSuccessorIterative(five));
		//System.out.println(inOrderSuccessor());
		
	}
	private static int inOrderSuccessorIterative(Node node) {
		if(node == null) return 0;
		
		if(node.right!=null){
			node = node.right;
			while(node.left!=null){
				node = node.left;
			}
			return node.data;
		}else{
			while(node.next!=null && node == node.next.right){
				node = node.next;
			}
			return node.next.data;
		}
		
		
		//return null;		
		
	}
	private static void inOrderSuccessor(Node root) {
		// TODO Auto-generated method stub
		if(root == null) return;
		inOrderSuccessor(root.right);
		root.next = temp;
		temp = root;
		System.out.print(root.data);
		inOrderSuccessor(root.left);
	}
	
	
	

}
