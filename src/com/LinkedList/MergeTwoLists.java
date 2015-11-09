package com.LinkedList;

public class MergeTwoLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = Node.getNumber563();
		Node<Integer> n2 = Node.getNumber842();
		Insert_Delete_Length.display(n1);
		Insert_Delete_Length.display(n2);
		Insert_Delete_Length.display(AlternateMerger(n1,n2));
	}

	private static Node<Integer> AlternateMerger(Node<Integer> n1, Node<Integer> n2) {
		Node<Integer> curr1=n1,curr2=n2,next1=null,next2=null;
		while(curr1!=null && curr2!=null){
			next1= curr1.next; 
			next2 = curr2.next;
			
			curr1.next = curr2;
			curr2.next = next1;
			
			curr1 = next1;
			curr2 = next2;
		}
		return n1;
	}

}
