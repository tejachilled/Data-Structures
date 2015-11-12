package com.Interviews;

import java.util.Arrays;

public class TwoSumWIthLimits {
	public static void main(String args[]){
		String num="5,6";
		String num1[]=num.split(",");
		int arr[]=new int[num1.length];
		for(int i = 0;i < num1.length;i++)
		{
			arr[i] = Integer.parseInt(num1[i]);
		}
		Arrays.sort(arr);
		int min=10, max=20, count=0;
		int j=arr.length-1;
		for(int i=0; i<arr.length;){
			int temp=arr[i]+arr[j];
			if(i==j || i>j)
				break;
			else if(temp>=min && temp<=max){
				count++;
				i++;j--;
			}else if(temp>max){
				j--;
			}else if(temp<min){
				i++;
			}
		}
		System.out.println(count);

	}
}
