package com.Strings;

import java.math.BigInteger;
import java.util.Arrays;

public class RGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "101111010110011011100100";
		int red = Integer.parseInt(input.substring(0,8),2);
		int green = Integer.parseInt(input.substring(8,16),2);
		int blue = Integer.parseInt(input.substring(16,24),2);
		int color = 0;
		double[] arr =new  double[5];
		double black =   Math.sqrt(red*red + blue*blue + green *green);
		arr[0] = black;
		double white = Math.sqrt((255-red)*(255-red) + (255-blue)*(255-blue) + (255-green)*(255-green));
		arr[1] = white;
		double redArr = Math.sqrt((255-red)*(255-red) + (blue)*(blue) + (green)*(green));
		arr[2] = redArr;
		double greenArr = Math.sqrt((255-green)*(255-green) + (blue)*(blue) + (red)*(red));
		arr[3] = greenArr;
		double blueArr = Math.sqrt((255-blue)*(255-blue) + (green)*(green) + (red)*(red));
		arr[4] = blueArr;
		//Arrays.sort(arr);
		System.out.println(arr[0]);
		for(double s: arr){
			System.out.println(s);
		}
	}

}
