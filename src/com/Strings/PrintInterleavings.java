package com.Strings;

public class PrintInterleavings {

	public static void main(String[] args) {
		char[] s1 = {'A','B'};
		char[] s2 = {'C','D'};
		char[] s3 = new char[s1.length+s2.length];
		print(s1,0,s2,0,s3,0);
	}

	private static void print(char[] s1, int i, char[] s2, int j, char[] s3, int k) {
		// TODO Auto-generated method stub
	//	System.out.println(i+ " "+s1.length+" "+ j+ " "+s2.length+ " "+k+  " "+s3.length);
		if(i==s1.length && j == s2.length){
			for(int a=0;a<s3.length;a++){
				System.out.print(s3[a]);
			}
			System.out.println();
		}
		if(i<s1.length){
		//	System.out.println("cmg");
			s3[k]  = s1[i];
			//System.out.println(s3[k]);
			print(s1,i+1,s2,j,s3,k+1);
		}
		if(j<s2.length){
		//	System.out.println("cmg1");
			s3[k]  = s2[j];
			//System.out.println(s3[k]);
			print(s1,i,s2,j+1,s3,k+1);
		}
	}

}
