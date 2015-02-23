package com.strings;

import java.util.ArrayList;

public class Longestsubswithoutrepchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ABDEFGABEF";
		//subStringNonrepchars(input);
		rotation("abcd","dabc");
	}
	
	private static boolean rotation(String in, String out) {
		// TODO Auto-generated method stub
		StringBuilder sb  = new StringBuilder(in+in);
		System.out.println(sb.toString());
		
		
		System.out.println((in+in).contains(out));
		return in.contentEquals(out);
	}

	

	private static void subStringNonrepchars(String input) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String s ="";
		
		int j=0,max=0,len=0;
		boolean[] flag = new boolean[256];
		for(int i=0;i<input.length();i++){
			if(!flag[input.charAt(i)]){
				System.out.println("char: "+input.charAt(i)+" bool: "+!flag[input.charAt(i)]);
				len++;
			}else{
				//System.out.println("coming to else");
					if(len>max){
						max= len;len=1;
						System.out.println(j+" j "+max +" :max substring: "+input.substring(j,max));
						j = i;
					}
				System.out.println("max len is: "+max+" j: "+j);
			}
			flag[input.charAt(i)] = true;

		}
		if(len>max)max=len;
		
		

	}

}
