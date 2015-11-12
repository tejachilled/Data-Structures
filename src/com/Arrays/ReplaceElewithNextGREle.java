package com.Arrays;

import java.util.Stack;

public class ReplaceElewithNextGREle {

	public static void main(String[] args) {
		
		int a[] = {7, 5, 6, 3, 4, 1, 2, 9, 11 };
		replace(a);
	}

	private static void replace(int[] a) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(a[0]);
		for(int i=1;i<a.length;i++){
			int next = a[i];
			if(!s.isEmpty()){
				int cur = s.pop();
				while(cur<next){
					System.out.println(cur+"-->"+next);
					if(s.isEmpty()) break;
						cur = s.pop();
				}
				if(cur>= next) s.push(cur);
			}
			s.push(next);
		}
		while(!s.isEmpty()){
			System.out.println(s.pop()+"-->"+" -1");
		}
	}

}
