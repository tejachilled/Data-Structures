package com.LinkedList;

public class LoopDetector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.getLoppedInput();
		DetectLoop(head);
		
	}

	private static void DetectLoop(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast!=null && fast.next != null){
			fast= fast.next.next;
			slow = slow.next;
			if(slow == fast) break;
		}
		slow = head;
		Node<Integer> prev = null;
		while(slow != fast){
			slow = slow.next;	
			prev = fast;
			fast = fast.next;
		}
		System.out.println(prev.element);
	}
	
	

}
