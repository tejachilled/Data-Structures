package com.Arrays;

public class MinimunJumpstoReachEnd_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		minimunJumps(arr);
	}

	private static void minimunJumps(int[] arr) {

		int[] jump = new int[arr.length];
		jump[0] = 0;
		for(int i=1;i<arr.length;i++){
			jump[i] = Integer.MAX_VALUE;			
			for(int j=0;j<i;j++){
				if(i<=j+arr[j]){
					jump[i] = min(jump[i],jump[j]+1);
				}
			}			
		}
		System.out.println(jump[arr.length-1]);

	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return (i<j?i:j);
	}

}
