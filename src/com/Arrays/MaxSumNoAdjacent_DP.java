package com.Arrays;

public class MaxSumNoAdjacent_DP {


	public static void main(String[] args) {
		int a[] = {3,2,7,10};
		max(a);
	}

	private static void max(int[] a) {
		// TODO Auto-generated method stub
		int t[] = new int[a.length];
		t[0] = a[0];
		t[1] = max(a[0],a[1]);
		for(int i=2;i<a.length;i++){
			t[i] = max(a[i]+t[i-2],t[i-1]);
		}
		System.out.println(t[a.length-1]);
	}

	private static int max(int i, int j) {
		return (i>j?i:j);
	}

}
