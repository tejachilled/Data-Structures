package com.LinkedList;

public class Insert_Delete_Length {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> finalNode = new Node<Integer>();
		Node<Integer> one = new Node<Integer>(1);
		Node<Integer> two = new Node<Integer>(2);
		one.next = two;
		finalNode = InsertAtStarting(one,3);
		//display(finalNode);
		finalNode = InsertAtEnding(one,3);
		//display(finalNode);
		//System.out.println(Length_recursive(finalNode));
		finalNode = InsertAfter(finalNode,1,67);
		//display(finalNode);
		Node<Integer> head = Node.getSortedInput();
		display(head);
		Insert_Delete_Length.display(DeleteAlternateNodes(head));
		head = Node.getGreaterValues();
		display(head);
		Insert_Delete_Length.display(DeleteNodeGreaterValueOnRt(head));
		head = Node.getUnsortedInput();
	//	display(head);
	//	Insert_Delete_Length.display(DeleteMNodesAfterNNodes(head,2,2));
	}

	private static Node<Integer> DeleteMNodesAfterNNodes(Node<Integer> head,int m , int n) {
		// TODO Auto-generated method stub
		Node<Integer> node = head, temp =null;
		int m1 = m ,n1=n;
		while(node!=null ){
			for(int i=1;i<n && node!=null;i++){
				node = node.next;
			}
			if(node == null){
				break;
			}
			temp = node.next;
			for(int j=0; j<m && temp!=null;j++){
				temp = temp.next;
			}
			node.next = temp;
			node = temp;
		}
		return head;
	}

	public static Node<Integer> InsertAfter(Node<Integer> node, int target,
			int data) {
		// TODO Auto-generated method stub
		Node<Integer> finalNode = node;
		while(node!= null){
			if(node.element == target ){
				Node<Integer> dummy = node.next;
				node.next = new Node<Integer>(data);
				node = node.next;
				node.next = dummy;
			}else{
				node = node.next;
			}
		}
		return finalNode;
	}

	public static Node<Integer> InsertAtEnding(Node<Integer> node, int data) {
		// TODO Auto-generated method stub
		Node<Integer> dummy = node;
		if(node==null){
			return new Node<Integer>(data);
		}
		while(node!= null && node.next!= null){
			node = node.next;
		}
		node.next = new Node<Integer>(data);
		return dummy;
	}

	public static void display(Node<Integer> finalNode) {
		// TODO Auto-generated method stub
		while(finalNode!= null){
			System.out.print(finalNode.element+ " ");
			finalNode = finalNode.next;
		}
		System.out.println();
	}

	public static Node<Integer> InsertAtStarting(Node<Integer> node, Integer data) {
		// TODO Auto-generated method stub
		if(node!=null){
			Node<Integer> dummy = new Node<Integer>(data);
			dummy.next = node;
			node = dummy;
		}else{
			node = new Node<Integer>(data);
		}
		return node;
	}
	
	public static int Length_recursive(Node<Integer> node){
		
		if(node== null){
			return 0;
		}
		return 1 + Length_recursive(node =node.next);	
		
	}
	
	public static Node<Integer> DeleteAlternateNodes(Node<Integer> node){
		Node<Integer> current = node;
		Node<Integer> next = node.next;
		while(current!= null && next != null){
			current.next = next.next;
			current=current.next;
			if(current != null){
				next =	 current.next;
			}
		}
		return node;
	}
	
	public static Node<Integer> DeleteNodeGreaterValueOnRt(Node<Integer> head){
		Node<Integer> node = null;
		node = Reverse.reverseLL(head);
		node = IncreadingOrder(node);
		node = Reverse.reverseLL(node);		
		return node;
	}

	private static Node<Integer> IncreadingOrder(Node<Integer> node) {
		Node<Integer> head = node;
		while(head!= null && head.next!=null){
			if(head.element >head.next.element){
				head.next=head.next.next;
			}else{
				head=head.next;
			}	
		}
		return node;
	}
	

}
