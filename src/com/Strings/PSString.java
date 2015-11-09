package com.Strings;

public class PSString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LPSStrings("fhyg12344321tryittiyrt");
	}

	private static void LPSStrings(String in) {
		// TODO Auto-generated method stub
		int max = 1;
		for(int i=0;i<in.length()-1;i++){
			String temp1 = getPal(in,i,i);
			if(temp1.length()>max){
				max = temp1.length();
				System.out.println(temp1);
			}
			String temp2 = getPal(in,i,i+1);
			if(temp2.length()>max){
				max = temp2.length();
				System.out.println(temp2);
			}
		}
	}

	private static String getPal(String in, int start, int end) {
		// TODO Auto-generated method stub
		while(start>=0 && end<in.length() ){
			if(in.charAt(start)==in.charAt(end)){
				start--;end++;
			}else{
				break;
			}
		}
		return in.substring(start+1,end);

	}
	
}