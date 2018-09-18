package com.LinkedList;

public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> head1 = Node.getInput();
		Node<Integer> head2 = Node.getInput();
		Node<Integer> head3 = Node.getInput();//Invite link 
		Node<Integer> head4 = Node.getInput();
		Node<Integer> head5 = Node.getInput();
		Insert_Delete_Length.display(head1);
		System.out.println();
		//Insert_Delete_Length.display(reverseLL(head1));
		//System.out.println();
		Insert_Delete_Length.display(reverseLL_recursive(head2));
		//System.out.println();
		//Print_reverse(head3);
		//System.out.println();
		Insert_Delete_Length.display(ReverseInGroups(head4, 2));
		System.out.println("sd");
		//Insert_Delete_Length.display(ReverseAlternateGroups(head5,2));
	}

	public static Node<Integer> reverseLL(Node<Integer> head) {
		// TODO Auto-generated method stub
		Node<Integer> current = head;
		Node<Integer> next = null;
		Node<Integer> previous = null;

		while(current !=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static Node<Integer> reverseLL_recursive(Node<Integer> head) {
		if(head == null) return null;
		if(head.next == null ) return head;		
		Node<Integer> next = head.next;
		head.next = null;
		Node<Integer> revhead = reverseLL_recursive(next);
		next.next = head;
		return revhead;
	}
	
	public static void Print_reverse(Node<Integer> head){
		if(head!=null) {
		Print_reverse(head.next);
		System.out.print (head.element+ " ");
		}
	}
	
	public static Node<Integer> ReverseInGroups(Node<Integer> head,int n){
		Node<Integer> current = head;
		Node<Integer> next = null;
		Node<Integer> previous = null;
		int count =0;
		while(current !=null && count <n){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		if(next!=null){
			head.next = ReverseInGroups(next,n);
		}
		
		return previous;
		
	}
	public static Node<Integer> ReverseAlternateGroups(Node<Integer> head,int n){
		Node<Integer> current = head;
		Node<Integer> next = null;
		Node<Integer> previous = null;
		int count =0;
		while(current !=null && count <n){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		if(current!=null ){
			head.next = current;
		}
		
		count = 0;
	    while(count < n-1 && current != null )
	    {
	      current = current.next;
	      count++;
	    }
	    
	    if(current !=  null)
	        current.next = ReverseAlternateGroups(current.next, n); 
	    
		return previous;		
	}
}
