package com.LinkedList;

public class EvenOddSegregate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> list = Node.getEvenOdds();
		Insert_Delete_Length.display(list);
		Insert_Delete_Length.display(Segregate(list));
		Insert_Delete_Length.display(Segregate2(list));
	}

	private static Node<Integer> Segregate(Node<Integer> list) {
		// TODO Auto-generated method stub
		Node<Integer> even = null;
		Node<Integer> odd = null;
		Node<Integer> head = list;
		while(head!=null){
			if(head.element%2==0){
				even = Insert_Delete_Length.InsertAtEnding(even, head.element);
			}else{
				odd =Insert_Delete_Length.InsertAtEnding(odd, head.element);
			}
			head = head.next;
		}
		list = even;
		while(even.next!=null){
			even = even.next;
		}
		even.next= odd;
		return list;
	}
	private static Node<Integer> Segregate2(Node<Integer> list) {
		// TODO Auto-generated method stub
		Node<Integer> curr = list,start = list;
		Node<Integer> back = list;
		while(back.next!=null){
			back = back.next;
		}
		Node<Integer> temp = null,prev=null,next = null,newBack = back;
		
		while(curr!=null && curr.element%2!=0 && curr!=back){
			//System.out.println("curr " +curr.element + " back "+back.element);
			newBack.next = curr;
			curr = curr.next;
			newBack.next.next = null;
			newBack = newBack.next;	
		}		
		if(curr.element %2==0){
			list = curr;
			while(curr!=back ){
				if(curr.element%2==0){
					prev = curr;
					curr = curr.next;
				}else{
					prev.next= curr.next;
					curr.next = null;
					newBack.next = curr;
					newBack = newBack.next;
					curr =prev.next;					
				}
			}
		}else{
			prev = curr;
		}
		
		//Insert_Delete_Length.display(back);

		return list;
	}

}
