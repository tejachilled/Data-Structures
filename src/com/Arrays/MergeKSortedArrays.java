package com.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	static class SortedArray implements Comparable<SortedArray>{
		int[] arr;
		int index;
		SortedArray(int[] arr,int index){
			this.arr = arr;
			this.index = index;
		}
		public int compareTo(SortedArray o) {
			if (this.arr[this.index] > o.arr[o.index]) {
				return 1;
			} else if (this.arr[this.index] < o.arr[o.index]) {
				return -1;
			} else {
				return 0;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = { 0, 9, 10, 11 };
		merge(new int[][]{arr1,arr2,arr3});

	}

	private static void merge(int[][] arrList) {
		PriorityQueue<SortedArray> queue = new PriorityQueue<SortedArray>();
	
		int size = 0;
		for(int[] a : arrList){
			queue.add(new SortedArray(a,0));
			size += a.length;
		}

		int len = 0;
		int res[] = new int[size];
		while(!queue.isEmpty()){
			SortedArray temp = queue.poll();
			res[len++] = temp.arr[temp.index];
			if(temp.index < temp.arr.length-1){
				queue.add(new SortedArray(temp.arr,temp.index+1));
			}
		}
		for(int a: res){
			System.out.print(a + " ");
		}
		
		
	}

}
