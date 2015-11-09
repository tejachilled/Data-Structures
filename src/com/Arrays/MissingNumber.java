package com.Arrays;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,6};
		int j=0,x1=0;
		for(int i=1;i<=a.length;i++,j++){
			x1 =x1^i^a[j];
		}
		x1 = x1^a.length+1;
		System.out.println(x1);
	}

}
