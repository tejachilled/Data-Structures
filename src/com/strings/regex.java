package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "My name is Ram.";
		PasswordMath(inp);
	}
	/* 
1. Sentence must start with a Uppercase character (e.g. Noun/ I/ We/ He etc.)
2. Then lowercase character follows.
3. There must be spaces between words.
4. Then the sentence must end with a full stop(.) after a word.
5. Two continuous spaces are not allowed.
6. Two continuous upper case characters are not allowed.
7. However the sentence can end after an upper case character.
	 * */
	private static void PasswordMath(String inp) {
		// TODO Auto-generated method stub
		Pattern pt = Pattern.compile("^([A-Z][a-z]+)");
		Matcher m = pt.matcher(inp);
		if(m.find()){
			System.out.println(m.group(1));
		}else{
			System.out.println("false");
		}
		
	}

}
