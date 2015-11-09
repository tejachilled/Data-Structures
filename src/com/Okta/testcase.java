package com.Okta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "zoggax";
		Pattern pt = Pattern.compile("(?=.*[aeiou])(?!.*[aeiou]{3})(?!.*[a-z&&[^aeiou]]{3})(?!.*([a-z&&[^eo]])\\1).*");
		String regex = "(?=.*[aeiou])(?!.*[aeiou]{3})(?!.*[a-z&&[^aeiou]]{3})(?!.*([a-z&&[^eo]])\\1).*";
		Matcher m = pt.matcher(inp);
		
		System.out.println(inp.matches(regex));
		
		if(m.find()) System.out.println(m.find(0));
		else System.out.println("false");
	}

}
