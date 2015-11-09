package com.Strings;

public class PossibleStringsWithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "ABCDE";
		char[] buff = new char[2*inp.length()];
		buff[0] = inp.charAt(0);
		print(inp.toCharArray(),1,buff,1,inp.length());
	}

	private static void print(char inp[], int i, char[] buf, int j, int len) {
		// TODO Auto-generated method stub
		if(i==len){			
			buf[j]='\0';
			String temp  = new String(buf);
			System.out.println(j+" j "+temp);
			return;
		}
		buf[j] = inp[i];
		print(inp,i+1,buf,j+1,len);
		
		buf[j] = ' ';
		buf[j+1] = inp[i];
		print(inp,i+1,buf,j+2,len);
		
	}

}
