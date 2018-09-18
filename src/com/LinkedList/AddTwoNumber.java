package com.LinkedList;

public class AddTwoNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = Node.getNumber563();
		Node<Integer> n2 = Node.getNumber842();
		Insert_Delete_Length.display(n1);
		Insert_Delete_Length.display(n2);
		Insert_Delete_Length.display(AddTwoNumbers(n1,n2));
	}

	private static Node<Integer> AddTwoNumbers(Node<Integer> n1,
			Node<Integer> n2) {
		int carry =0,sum=0,first=0,second=0;
		 Node<Integer> temp = null,res = null,prev=null;
		while(n1!=null || n2!=null){
			first = (n1!=null)?n1.element:0;
			second = (n2!=null)?n2.element:0;
			sum  =carry+ first+second;
			carry = (sum >10)? 1:0;
			sum = sum%10;
			temp = new Node<Integer>(sum);
			if(res == null){
				res = temp;
			}else{
				prev.next = temp;
			}
			prev = temp;
			if(n1!=null)
			n1=n1.next;
			if(n2!=null)
			n2=n2.next;
		}
		//if(carry>0)temp.next = new Node<Integer>(carry);
		return res;
	}
}
