package com.LinkedList;

public class ElementPositions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> three = new Node<Integer>(3,four);
		Node<Integer> two = new Node<Integer>(2,three);
		Node<Integer> one = new Node<Integer>(1, two);
		Insert_Delete_Length.display(one);
		middleElement(one);
		NthNodeFromEnd(one,3);
	}

	public static void NthNodeFromEnd(Node<Integer> head, int index) {
		// TODO Auto-generated method stub
		Node<Integer> dummy = head;
		String message = String.format("%sth node from end of the node is : ", index);
		while(index >0){
			index--;
			dummy = dummy.next;
		}
		while (dummy!=null){
			dummy = dummy.next;
			head = head.next;
		}
		
		System.out.println(message + " "+head.element);
	}

	public static void middleElement(Node<Integer> head) {
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		while(fast != null && fast.next!= null){
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("middle element is : "+slow.element);
	}
	

}
