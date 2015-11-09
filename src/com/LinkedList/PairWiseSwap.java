package com.LinkedList;

public class PairWiseSwap {

	/**
	 * @param args
	 */
	static Node<Integer> swap = null;
	public static void main(String[] args) {
		Node<Integer> head = Node.getInput();
		Insert_Delete_Length.display(head);
		swap = head;
		pairwiseswap(head);
		Insert_Delete_Length.display(swap);
	}

	private static void pairwiseswap(Node<Integer> head) {
		if(head!=null && head.next!= null){
			swap(head,head.next);
			pairwiseswap(head.next.next);
		}			
	}
	private static void swap(Node<Integer> head, Node<Integer> next) {
		int first = head.element;
		int sec  = next.element;
		head.element = sec;
		next.element = first;		
	}

	

}
