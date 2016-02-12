package com.Interviews;

import java.io.*;
public class validflag {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int noOfTestcases = Integer.parseInt(br.readLine());
			System.out.println(noOfTestcases);
			while(noOfTestcases >0){
				noOfTestcases--;
				String str = br.readLine();                                 //scanner.next();
				String [] splittedString = str.split(" ");
				int row = Integer.parseInt(splittedString[0]);
				int column = Integer.parseInt(splittedString[1]);
				
				String prefirst = "";
				boolean flag = true;
				for(int i=0 ; i<row;i++){					
						String first =br.readLine();						
						if(first.length()==column && checkAllSame(first)){
							if(prefirst!="" && prefirst.equals(first)){								
								flag = false;
							}
							prefirst = first;
						}else{
							flag = false;
						}					
				}
				if(flag){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				
			}

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

	private static boolean checkAllSame(String first) {
		
		for(int i=1;i<first.length();i++){
			if(first.charAt(i)!=first.charAt(0)){
				return false;
			}
		}
		return true;
	}
}