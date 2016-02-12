package com.Interviews;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SImleWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"at","so","chat","ever","sales","wh","what","snap","snapchat","salesperson","per","person","whatsoever"};
		//find(list);
		simpleWords(list);

	}

	static String[] simpleWords(String[] list) {
		Set<String> inp = new HashSet<String>();
		ArrayList<String> res = new ArrayList<String>(); 
		for(String i:list){
			inp.add(i);
		}
		for(String i: list){
			Set<String> tmp = new HashSet<String>();
			tmp.addAll(inp);
			tmp.remove(i);
			if(!wordBreak(i,tmp)){
				res.add(i);
			}else{
				inp.remove(i);
			}
		}
		String[] finRes = new String[res.size()];
		int count = 0;
		for(String j : res){
			finRes[count++] = j;
		}
		System.out.println(res);
		return finRes;
	}
	public static boolean wordBreak(String s, Set<String> wordDict){
        int length = s.length();
        boolean[] valid = new boolean[length];
        for (int i = 0; i < length; i ++ ){
            String word = s.substring(0, i + 1);
            if (wordDict.contains(word))
                valid[i] = true;
            else{
                valid[i] = false;
                for (int j = 0; j < i; j ++){
                    if (valid[j] && wordDict.contains(s.substring(j + 1, i + 1))){
                        valid[i] = true;    
                        break;
                    }
                }
            }//else
        }//for
        return valid[s.length() - 1 ];
    }//wordBreak
	
	
	public static boolean wordBreakFin(String s, Set<String> dict) {
	    int length = s.length();
	    boolean[] table = new boolean[length + 1];
	    table[0] = true;

	    for (int i = 1; i <= length; i++) {
	      table[i] = isInDictionary(s, dict, table, i);
	    }

	    return table[length];
	  }

	  private static boolean isInDictionary(String s, Set<String> dict, boolean[] table, int i) {
	    for (int j = i; j >= 0; j--) {
	      if (table[j] && dict.contains(s.substring(j, i))) return true;
	    }
	    return false;
	  }

	
}
