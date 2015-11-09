package com.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,5}, b[] = {2,4,5,7,9};

		int c[] = new int[a.length+b.length];
		int aCount=0,bCount=0;


		int k = 0;
		while (aCount < a.length && bCount < b.length)
		{
			if (a[aCount] < b[bCount])       
				c[k++] = a[aCount++];

			else        
				c[k++] = b[bCount++];               
		}

		while (aCount < a.length)  
			c[k++] = a[aCount++];


		while (bCount < b.length)    
			c[k++] = b[bCount++];


		for(int i : c){
			System.out.print(i);
		}
	}
}
