package com.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MediumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,10,12,2};
		Queue<Integer> min = new PriorityQueue<Integer>();
		Queue<Integer> max = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		
		addNumbers(max,min,1);
		addNumbers(max,min,5);
		addNumbers(max,min,10);
		addNumbers(max,min,12);
		addNumbers(max,min,2);
		findMed(max,min);
	}

	private static void findMed(Queue<Integer> max, Queue<Integer> min) {
		System.out.println(max.poll());
		
	}

	private static void addNumbers(Queue<Integer> max, Queue<Integer> min, int i) {
		if(max.size()==0 && min.size()==0){
			max.add(i);
		}else{
			if(max.size()==min.size()){
				if(max.peek()>i || (max.peek()<i && i< min.peek())){
					max.offer(i);
				}else{
					max.offer(min.poll());
					min.offer(i);
				}
			}else{
				if(max.peek()<i){
					min.offer(i);
				}else{
					min.offer(max.poll());
					max.offer(i);
				}
			}
		}
		
	}

}
