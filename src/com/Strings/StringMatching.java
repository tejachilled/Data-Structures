package com.strings;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="abcabcabc";
		int  len =KMPalgo(input);		
		int n = input.length();
		//System.out.println(n);
		if(n % (n-len)==0) System.out.println("True");
		else System.out.println("false");
		System.out.println(input.substring(0,n-len));
	}

	private static int KMPalgo(String input) {
		// TODO Auto-generated method stub
		char[] p = input.toCharArray();
		int i=1,j=0;
		int m =input.length();
		int[] f = new int[m];
		f[0]=0;
		while(i<m){
			if(p[i]==p[j]){
				f[i]=j+1;
				i++;j++;
			}else if(j>0){
				j = f[j-1];
			}else{
				f[i]=0;i++;
			}
		}
		int max =0;
		for(int k=0;k<f.length;k++){
			System.out.print(f[k]);
			if(f[k]>max) max = f[k];
		}
		//System.out.println(max);
		return max;
	}

}
