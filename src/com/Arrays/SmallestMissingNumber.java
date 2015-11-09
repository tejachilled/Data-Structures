package com.Arrays;

public class SmallestMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,4,6};
		System.out.println(search(arr, 0 ,arr.length-1));;
	}

	private static int search(int[] arr, int low, int high) {
		if(low != arr[low]) return low;
		int mid = (low + high)/2;
		if(mid < arr[mid])
			return search(arr,0,mid);
		else
			return search(arr,mid+1,high);
		
		
	}

}
