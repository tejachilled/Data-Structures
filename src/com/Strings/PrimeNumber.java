package com.Strings;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			if(isPrime(i)){
			 System.out.println(i);
			}
		}
		int i = 2;
		i = i<<2;
		//System.out.println(i);
		System.out.println(7&15);
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n%2==0) return false;
		for(int i=3 ; i*i<n;i=i+2){
			if(n%i==0) return false;
		}
		return true;
	}

}
