package com.Arrays;

import java.util.ArrayList;

public class MinimunJumpstoReachEnd_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int arr1[] = {5,6,0,4,2,4,1,0,0,4};
		minimunJumps(arr1);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a : arr){
			list.add(a);
		}
		System.out.println(findHopsHelper(list));
		
		
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
	
	private static ArrayList<String> findHopsHelper(ArrayList<Integer> array) {
		ArrayList<String> hops = new ArrayList<String>();
		int lReach = 0, curReach = 0, selIndex = 0;
		int i;
		//  {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		for (i = 0; i < array.size(); i++) {
			if (i > curReach) break;    // if the index is beyond current reach then just break out
			if (i > lReach) {
				lReach = curReach;    // update last reach
				hops.add(String.valueOf(selIndex));
			}
			int sum = i + array.get(i);    // update current reach
			if (sum > curReach) selIndex = i;
			curReach = Math.max(curReach, sum);
		}
		if ((i > lReach) && (hops.size() > 0) && (Integer.parseInt(hops.get(hops.size() - 1)) != selIndex)) {
			// if i was beyond last reach and hops are present then add the last selected index
			hops.add(String.valueOf(selIndex));
		}

		if (lReach >= array.size() - 1)    // if last reachable index was greater than or equal to last index of array
			// then return the hop indices as hopping is possible
			return hops;
		else
			return null;
	}

}
