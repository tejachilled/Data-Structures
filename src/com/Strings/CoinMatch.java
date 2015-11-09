package com.strings;

import java.util.ArrayList;
import java.util.HashSet;

public class CoinMatch {
	static HashSet<Integer> result = new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(11);
		list.add(1);
		int input =34;

		int count =0;
		for(Integer i : list){
			//System.out.println(input%i);
			if(input%i==0 && i!=1){
				count = input/i;
				System.out.println(input/i); break;
			}
		}
		if(count==0){
			Integer coin = MinCoins(input,list,count);
			//System.out.println("coin: "+Not possible);
		}
	}

	private static Integer MinCoins(int input, ArrayList<Integer> list,Integer count) {
		// TODO Auto-generated method stub
		if(input==0) System.out.println(count);
		//System.out.println("coming");
		for(Integer i : list){
			if(input>=i){				
				int div = input/i;
				count += div;
				input= input%i;				
			}
		}
		System.out.println("count: "+count);
		return count;
	}


}
