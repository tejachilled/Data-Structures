package com.Strings;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		String input = "geeksforgeeks";
		char[] flag = new char[256];
		StringBuffer string = new StringBuffer();
		for(int i =0 ; i<input.length();i++){
			if(flag[input.charAt(i)] == 0){
				flag[input.charAt(i)] ++;
				string.append(input.charAt(i));
			}else{
				flag[input.charAt(i)] ++;
			}
		}
		for(int i =0 ; i<256;i++){
			if(flag[i] >1) System.out.println(Character.toString((char)i));
		}
		
	}

}
