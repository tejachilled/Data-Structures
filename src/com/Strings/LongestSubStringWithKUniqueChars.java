package com.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithKUniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  = "aabbccddddddddd";
		print(input ,3);
		getlongestSubstring(input,3);
	}

	private static void print(String input, int k) {
		// TODO Auto-generated method stub
		char[] all = new char[256];
		int maxLen = 0,start=0,end = 0,len=0,unique=0;
		for(int i = 0 ;i<input.length();i++){
			
			if(all[input.charAt(i)]==0){
				all[input.charAt(i)] ++;
				unique++;
			}else{
				all[input.charAt(i)]++;
			}
			len++;
			//System.out.println(input.charAt(i)+ " len: "+len + " unique: "+unique);
			if(unique== k){
				int j = i;				
				//System.out.println(input.charAt(j));
				while(j<input.length() && all[input.charAt(j)]>0){
						len++;j++;
				}
				if(maxLen <= (len-1)){
					maxLen = len-1;					
					end  =(j>i?j:i);
					len =1;
				}
				all = new char[256];
				all[input.charAt(i)] ++;
				unique =1;
			}
		}
		System.out.println(input.substring(end - maxLen,end));
	}
	
	private static void getlongestSubstring(String input, int k) {
		
		HashMap<Character,Integer> map = new HashMap();
		int start = 0,max = 0;;
		for(int i=0 ; i<input.length(); i++) {
			if(map.get(input.charAt(i)) != null) {
				map.put(input.charAt(i), 1);
			}else {
				map.put(input.charAt(i), 1);
			}
			
			if(map.size() > k) {  
				max = Math.max(max, i-start);
				if(map.get(input.charAt(start)) == 1 ) {
					map.remove(input.charAt(start));
				}else {
					map.put(input.charAt(start), map.get(input.charAt(start))-1);
				}
				start++;
			}
			
		}
		System.out.println(Math.max(max, input.length()-start)+"   "+ map);
	}

}
