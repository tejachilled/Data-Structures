package com.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int target = 10;
		int[] ary = {1,2,5,6,7};
		Arrays.sort(ary);
		int first =0;
		int last = ary.length-1;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int i =0;i<ary.length;i++){
//			map.put(ary[i], 0);
//		}
//		for(int i =0;i<ary.length;i++){
//			Integer j = 10 - ary[i];
//			Object temp =map.get(j);
//			if(temp!=null){
//				System.out.println(ary[i]+","+j);
//			}
//		}
		System.out.println("-------------------");
		
	twoSum(ary,first,last,target);	
	}

	private static void twoSum(int[] ary, int first, int last,int target) {
		// TODO Auto-generated method stub
		while(first<=last){
			if(ary[first]+ary[last]==target){
				System.out.println(ary[first]+" "+ary[last]);
			}
			if(ary[first]+ary[last]<=target){
				first++;
			}else{
				last--;
			}
		}
		
	}
	
	
}
