package com.Arrays;

public class ReplaceZeroWith1TogetLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,1,1,0,1,0,1,1,1,0,1,1,1};
        System.out.println(replaceIndex(array)); 
	}

	private static int replaceIndex(int[] array) {
		// TODO Auto-generated method stub
		int begin =0,replace=-1,maxReplace =-1;
		int maxLen = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]==0){
				if(replace==-1){
					replace = i; continue;
				}
				int len = i - begin;
				if(len>maxLen){
					maxLen = len;	maxReplace = replace;				
				}
				begin = replace+1;
				replace = i;
			}
		}
		return maxReplace;
	}

}
