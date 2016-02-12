package com.Interviews;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MinJumpsToReachEnd {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		try{
			ArrayList<Integer> inp =  new ArrayList<Integer>();
			while(s.hasNext()){
				inp.add(Integer.parseInt(s.next()));
			}
			inp = findHopsHelper(inp);
			if(inp == null || inp.size()==0){
				System.out.print("failure");
			}else{
				
				for(int i: inp){
					System.out.print(i+", ");
				}
				System.out.print("out");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if( s != null)
				s.close();
		}
	}
	
	private static ArrayList<Integer> findHopsHelper(ArrayList<Integer> array) {
		ArrayList<Integer> hops = new ArrayList<Integer>();
		int lReach = 0, curReach = 0, selIndex = 0;
		int i;
		for (i = 0; i < array.size(); i++) {
			if (i > curReach) break;    
			if (i > lReach) {
				lReach = curReach;    
				hops.add(selIndex);
			}
			int sum = i + array.get(i);    
			if (sum > curReach) selIndex = i;
			curReach = Math.max(curReach, sum);
		}
		if ((i > lReach) && (hops.size() > 0) && (hops.get(hops.size() - 1) != selIndex)) {
			hops.add(selIndex);
		}

		if (lReach >= array.size() - 1)    
			return hops;
		else
			return null;
	}

}
