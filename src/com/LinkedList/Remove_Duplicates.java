package com.LinkedList;

import java.util.Hashtable;

public class Remove_Duplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = Node.getSortedInput();
		Insert_Delete_Length.display(head1);
		Insert_Delete_Length.display(RemoveDupsSorted(head1));
		head1 = Node.getUnsortedInput();
		Insert_Delete_Length.display(RemoveDupsUnSorted(head1));
		head1 = Node.getUnsortedInput();
		Insert_Delete_Length.display(RemoveGivenElement(head1,1));
	}

	private static Node<Integer> RemoveGivenElement(Node<Integer> head1, int i) {
		Node<Integer>  tmp = head1, prev = null;
		while(tmp !=null){
			if(tmp.element == i){
				if(tmp ==head1) head1 = head1.next;
				else{
					prev.next = tmp.next;
				}
			}else{
				prev = tmp;
			}
			tmp = tmp.next;
		}
		
		return head1;
	}

	private static Node<Integer> RemoveDupsSorted(Node<Integer> head) {
		// TODO Auto-generated method stub
		Node<Integer> list = head;
		while(list!=null && list.next!=null){
			if(list.element==list.next.element){
			//System.out.println("came");
				Node<Integer> dummy = list.next.next;
				list.next = dummy;
			}else{
			list = list.next;
			}			
		}		
		return head;
	}
	
	private static Node<Integer> RemoveDupsUnSorted(Node<Integer> list) {
		Hashtable<Integer, Boolean> hashTable = new Hashtable<Integer, Boolean>();
		Node<Integer> previous = null;
		Node<Integer> head = list;
		while(list!=null ){
			if(hashTable.get(list.element)== null){
				hashTable.put(list.element, true);
				previous = list;
			}else{
				previous.next = list.next;
			}
			list = list.next;
		}
		return head;
	}

}
