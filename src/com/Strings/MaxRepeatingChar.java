package com.Strings;


import java.util.Arrays;
import java.util.Collections;

public class MaxRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File
		Integer[] inp = new Integer[256];
		String s = "aaabbbcde";
		Arrays.fill(inp, 0);
		for(int i =0;i<s.length();i++){
		inp[s.charAt(i)]++;
		}
//		Arrays.sort(inp, Collections.reverseOrder());
//		for(int i=0;i<inp.length;i++)
//		System.out.println(i+" i : "+inp[i]);
		for(int i =0;i<s.length();i++){
			if(inp[s.charAt(i)]==1){ System.out.println(inp[s.charAt(i)]+ " "+s.charAt(i));	break;}
			
		
			}
	}

}
