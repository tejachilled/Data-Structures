package com.Arrays;

import java.io.IOException;
import java.util.Arrays;

public class ClosestNumbers {

	public static void main(String[] args) throws IOException {
		System.out.println(closest(12, "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 "));
	}
	static String closest(int len, String s ){
		int[] array=new int[len];
		String[] temp = s.split(" ");
		for(int i = 0; i < len; i++){
			array[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(array);
		StringBuffer result = new StringBuffer();
		int minValue=Integer.MAX_VALUE;
		for(int i=0;i < array.length-1;++i)
		{
			int tempDiff=Math.abs(array[i]-array[i+1]);
			if(tempDiff < minValue){
				minValue=tempDiff;
				result = new StringBuffer();
				result.append(array[i]);
				result.append(" ");
				result.append(array[i+1]);
			}else if(tempDiff == minValue){
				result.append(" ");
				result.append(array[i]);
				result.append(" ");
				result.append(array[i+1]);
			}
		}
		return result.toString();

	}

}
