package com.LinkedList;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.getPalindromeInput();
		checkPlaindrome(head);
	}

	private static void checkPlaindrome(Node<Integer> head) {
		// TODO Auto-generated method stub
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast != null && fast.next !=null ){
			fast = fast.next.next;
			slow = slow.next;
		}
		//System.out.println(fast.element);
		fast = slow.next;
		slow = Reverse.reverseLL(fast);
		fast= head;
		while( slow != null){
			if(fast.element != slow.element){
				System.out.println(fast.element +" Not a Palindrome "+ slow.element);
				break;
			}
			slow = slow.next;
			fast = fast.next;
			
		}
		System.out.println("Palindrome");
		
	}

}
