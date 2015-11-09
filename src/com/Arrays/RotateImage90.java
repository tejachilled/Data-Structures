package com.Arrays;

public class RotateImage90 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(arr);
	}

	private static void rotate(int[][] arr) {
		// TODO Auto-generated method stub
		int m = arr.length;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<arr.length/2;i++){
			for(int j=0;j<arr.length/2;j++){
				int temp= arr[i][j];
				arr[i][j] = arr[m-1-j][i];
				arr[m-1-j][i] = arr[m-1-i][m-1-j];
				arr[m-1-i][m-1-j] = arr[j][m-1-i];
				arr[j][m-1-i] = temp;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
