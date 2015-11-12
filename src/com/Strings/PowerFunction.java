package com.Strings;

public class PowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = -2;
		System.out.println(power(a,b));
	}

	private static double  power(double  a, double  b) {
		if(b==0) return 1;
		if(b>0){
			return a*power(a,b-1);
		}else{
			System.out.println("a: "+a+" b: "+b);
			return (1/((power(a,-b))));
		}
		
	}

}
