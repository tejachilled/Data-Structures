package com.Interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Twitter 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int noOfTestcases = Integer.parseInt(br.readLine());
			
			String str = br.readLine();                                 //scanner.next();
			
			String [] splittedString = str.split(" ");
			
			List<Integer> list = new ArrayList<Integer>(noOfTestcases);
			
			for (int i = 0; i < splittedString.length; i++) 
			{
				list.add(Integer.parseInt(splittedString[i]));
			}
			cutSticksLogic(list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if( br != null)
				br.close();
		}
	}
 
	private static void cutSticksLogic(List<Integer> list) 
	{
		List<Integer> newList = new ArrayList<Integer>();
		do
		{
			Collections.sort(list);
			
			for ( int i = list.size()-1; i >=0; i-- ) 
			{
				newList.add(list.get(i)-list.get(0));
			}
			System.out.println(newList.size());
			
			for(int j=0 ; j<newList.size() ; j++)
			{
				if(newList.get(j)<=0)
				{
					newList.remove(j);
					j--;
				}
			}
			list.removeAll(list);
			list.addAll(newList);
			newList.removeAll(newList);
		}
		while(list.size()>0);
	}
}