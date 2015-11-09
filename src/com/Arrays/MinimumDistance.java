package com.Arrays;

public class MinimumDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,4,2,3,5,6,5,6,9};
		find(arr,3,6);
	}

	private static void find(int[] arr,int x,int y) {
		// TODO Auto-generated method stub
		int i =0,prev =0,min=Integer.MAX_VALUE;
		for(;i<arr.length;i++){
			if(arr[i] == x || arr[i] == y){
				prev = i; break;
			}
		}
		for(;i<arr.length;i++){
			if(arr[i] == x || arr[i] == y)
			if(arr[i]!= arr[prev] && (i-prev) < min)
			{
				min = i- prev;
				prev = i;
			}else{
				prev = i ;
			}
		}
		System.out.println(min);
	}

}
