package com.Strings;

public class SpacesInpossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abc";
		char[] inp = input.toCharArray();
		char[] buf = new char[2*inp.length];
		buf[0] = inp[0];
		spaces(inp,buf,1,1,input.length());
	}
	
	public static void spaces(char[] inp,char[] buf,int i,int j,int end ){
		if(i==end){
			for(int k = 0;k<buf.length;k++){
				System.out.print(buf[k]);
			}
			System.out.println();
			return;
		}
		
		buf[j] =inp[i];
		spaces(inp,buf,i+1,j+1,end);
		
		buf[j] =' ';
		buf[j+1] = inp[i];
		spaces(inp,buf,i+1,j+2,end);
				
	}

}
