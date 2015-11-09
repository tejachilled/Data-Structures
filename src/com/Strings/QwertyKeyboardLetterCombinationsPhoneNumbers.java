package com.Strings;

import java.util.ArrayList;

public class QwertyKeyboardLetterCombinationsPhoneNumbers {
	private static final char[][] map={
			{},{},{'a','b','c'},
			{'d','e','f'},{'g','h','i'},{'j','k','l'},
			{'m','n','o'}, {'p','q','s','r'}, {'t','u','v'},
			{'w','x','y','z'}     
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();		
		combine(new StringBuffer(),list,0,"234");
		for(String ls : list){
			System.out.println(ls);
		}
	}
	private static void combine(StringBuffer sb, ArrayList<String> res, int index, String dig) {
		if(index==dig.length()){
			res.add(sb.toString());
		}else{
			int i  = dig.charAt(index)-'0';
			for(int j = 0 ;j< map[i].length;j++){
				sb.append(map[i][j]);
				combine(sb,res,index+1,dig);
				sb.deleteCharAt(sb.length()-1);
			}		
		}



	}

}
