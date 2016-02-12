package com.Strings;

import java.util.ArrayList;

public class ReverseWordbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "How are you";
		String inp1 = "How are you";
		System.out.println(reverse(inp));
		//reverse1(inp1.toCharArray());
		System.out.println(getReverse2(inp));
	}
	public static String getReverse2(String s){

		if(s.length()==1){

			return s;

		}

		return getReverse2(s.substring(1))+s.charAt(0);

	}

	private static void reverse1(char[] c) {
		reverseT(c,0,c.length-1);

		int wordStart=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				reverseT(c,wordStart,i-1);
				wordStart=i+1;
			}
			else if(i==c.length-1)
			{
				reverseT(c,wordStart,i);
			}
		}
		System.out.println(new String(c));
	}

	private static void reverseT(char[] c, int i, int j) {

		while(i<=j){
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;j--;
		}

		return;
	}
	private static String reverse(String inp) {
		ArrayList<String> al = new ArrayList<String>();
		getWords(inp,al);
		al.trimToSize();
		StringBuffer sb = new StringBuffer();
		for(int i = al.size()-1;i>=0;i--){
			sb.append(al.get(i)); sb.append(" ");
		}
		return sb.toString();
	}

	private static ArrayList<String> getWords(String inp,ArrayList<String> al) {
		int index = inp.indexOf(" ");
		al.add(inp.substring(0,index));
		inp = inp.substring(index+1,inp.length());
		if(inp.indexOf(" ")==-1){
			al.add(inp.substring(0));
			return al;
		}
		return getWords(inp,al);

	}

}
