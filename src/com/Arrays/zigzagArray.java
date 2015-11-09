package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zigzagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {5,2,7,8,-2,25,25};
		arr = get(arr);
	}
	static int[] get(int[] arr){
		List<Integer> asc = new ArrayList<Integer>(arr.length);
		List<Integer> dsc = new ArrayList<Integer>(arr.length);
		for(int i : arr){
			asc.add(i);
			dsc.add(i);
		}
		Collections.sort(asc);
		Collections.sort(dsc,Collections.reverseOrder());
		int counter = 0;
		for(int i = 0 ;i<arr.length;i++){
			arr[i] = dsc.get(counter); 
			i++;
			if(i<arr.length)
			arr[i] = asc.get(counter++); 
		}
		return arr;
	}

}
