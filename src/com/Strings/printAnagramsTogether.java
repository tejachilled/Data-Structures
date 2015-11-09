package com.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class printAnagramsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordArr[] = {"cat", "dog", "tac", "god", "act", "gdo"};
		print(wordArr);
	}

	private static void print(String[] wordArr){
		String[] dup = sort(wordArr);
		HashMap<String, String> map = new HashMap<String, String>();
		int i=0;
		for(String s:dup){
			if(map.get(s)!=null){
				map.put(s, map.get(s)+","+wordArr[i]);
			}else{
				map.put(s,wordArr[i]);
			}
			i++;
		}
		for(String s:map.keySet()){
			System.out.println(map.get(s));
		}
		
	}

	private static String[] sort(String[] wordArr) {
		// TODO Auto-generated method stub
		String[] sap = new String[wordArr.length];
		int i = 0;
		for(String s : wordArr){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);			
			sap[i] = new String(temp);
			i++;
		}
		return sap;
	}

}
