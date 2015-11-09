package com.Arrays;

public class NumberOddOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,2,1,3};
		int temp = 0;
		for(int i :a){
			temp = temp ^ i;
		}
		System.out.println(temp);
	}

}
