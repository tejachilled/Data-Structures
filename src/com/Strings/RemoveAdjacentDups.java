package com.Strings;

public class RemoveAdjacentDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "acaaabbbacdddd";
		remove(new StringBuffer(in),0);
	}

	private static void remove(StringBuffer in, int i) {
		//System.out.println("inp : "+in);
		if(i+1<in.length()){
			if(in.charAt(i)==in.charAt(i+1)){
				int k=i;
				//System.out.println("i: "+i);
				while((k+1)<in.length() && in.charAt(k)==in.charAt(k+1)) {
					k++;
				}
				in = in.delete(i, k+1);
				if(i==0)remove(in,i);
				else
				remove(in,i-1);
			}else{
				remove(in,i+1);
			}
		}else{
			System.out.println(in);
		}
		
	}

}
