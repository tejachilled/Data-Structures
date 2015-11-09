package com.Arrays;

public class RepeatingMissingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,4,5,5,6,2};
		find(arr);
	}

	private static void find(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i <arr.length;i++){
			if(arr[Math.abs(arr[i])-1] > 0){
				arr[Math.abs(arr[i])-1] = - arr[Math.abs(arr[i])-1];
			}else{
				System.out.println("repeating number is "+Math.abs(arr[i]) );
			}
		}
		
		for(int j=0 ;j<arr.length;j++){
			if(arr[j]> 0 ) System.out.println("Missing number : "+(j+1));
		}
	}

}
