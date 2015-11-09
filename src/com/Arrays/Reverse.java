package com.Arrays;

public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		reverse(a);
	}

	private static void reverse(int[] a) {
		// TODO Auto-generated method stub
		int start=0,end =a.length-1;
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;end--;			
		}
		for(int i :a){
			System.out.println(i);
		}
	}

}
