package com.Strings;

public class RemoveBandAC {

	public static void main(String[] args) {
		String s1 = "ababaac";
		remove(s1.toCharArray());

	}

	private static void remove(char[] s1) {
		
		int val = -1,j=0;
		char[] s2 = new char[s1.length];
		for(int i=0;i<s1.length;i++){
			if(val==-1 && s1[i]!='a' && s1[i]!='b' ){
				s2[j]=s1[i];
				j++;
			}else if(val==0 && s1[i]!='c'){
				s2[j]='a';j++;
				if(val==-1 && s1[i]!='a' && s1[i]!='b' ){
					s2[j]=s1[i];
					j++;
				}				
			}
			val = (s1[i]=='a'?0:-1);
		}
		if(val==0){
			s2[j]='a';j++;
		}
		System.out.println(new String(s2));
		
	}

}
