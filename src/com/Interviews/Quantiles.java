package com.Interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quantiles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			int q = s.nextInt();
			int res =q-1;
			int num = s.nextInt();
			ArrayList<Integer> inp =  new ArrayList<Integer>();
			while(num > 0){
				num--;
				int first = s.nextInt();
				int freq = s.nextInt();
				while(freq>0){
					freq--;
					inp.add(first);
				}
			}
			Collections.sort(inp);
			int count = 1;
			while(res > 0){
				res--;
				int finRes = (int) inp.size()/q * (count);
				System.out.println(inp.get(finRes-1));
                count++;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if( s != null)
				s.close();
		}
	}

}
