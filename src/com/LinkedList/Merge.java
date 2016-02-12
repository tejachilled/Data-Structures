package com.LinkedList;

import java.util.LinkedList;
import java.util.Random;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head = new Node<Integer>();
	        Random random = new Random();
	        int N = 7;
	        head  = Node.getUnsortedInput();
	        System.out.println("List items before sorting :");
	        Insert_Delete_Length.display(head);
	        Node<Integer> slow  = head;
	        Node<Integer> fast  = head;
	        System.out.println();
	        while(fast!=null && fast.next!=null){
	        	fast = fast.next.next;
	        	slow = slow.next;
	        	if(slow==fast) break;
	        }
	        Insert_Delete_Length.display(slow);
	        fast  = head.next;
	        slow  = head;
	        System.out.println();
	        while(fast!=null && fast.next!=null){
	        	fast = fast.next.next;
	        	slow = slow.next;
	        	if(slow==fast) break;
	        }
	        Insert_Delete_Length.display(slow);
	}

}
