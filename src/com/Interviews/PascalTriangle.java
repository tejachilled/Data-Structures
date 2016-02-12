package com.Interviews;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generatePascal(7);
	}

	private static void generatePascal(int n) {
		
		for(int i=0;i<n;i++){
			for(int j = 0;j<=i;j++){
				System.out.print(nCk(i,j)+" ");
			}
			System.out.println();
		}
	}

	private static int nCk(int i, int j) {
		int num = fact(i);
		int den = fact(i-j) *fact(j);
		//System.out.println("i: "+i+" j: "+j+" res: "+(num/den));
		return (num/den);
	}
	
	static int fNum[] = new int[7];
	
	private static int fact(int n){
		if(n ==1 || n==0) return 1;
		else{
			fNum[n] = n * fact(n-1);
			return fNum[n];
		}
	}

}
