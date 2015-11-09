package com.LinkedList;

public class Rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.getInput();
		Insert_Delete_Length.display(head);
		Insert_Delete_Length.display(rotate(head,2));
	}

	private static Node<Integer> rotate(Node<Integer> head,int k) {
		// TODO Auto-generated method stub
		Node<Integer> node = head;
		while(node!=null && k>1){
			k--;
			node =node.next;
		}
		Node<Integer> temp = node.next;
		node.next= null;
		Node<Integer> dummy = temp;
		while(temp.next!=null){
			temp= temp.next;
		}
		temp.next = head;
		
		return dummy;
	}

}
