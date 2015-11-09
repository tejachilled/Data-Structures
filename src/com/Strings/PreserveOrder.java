package com.strings;

public class PreserveOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "XYX";
		String two = "XXZ";
		String three = "XXXZYX";
		Order(one,two,three);
	}

	private static void Order(String one, String two, String three) {
		// TODO Auto-generated method stub
		
		int i=0,j=0,k=0;
		while(i<one.length() || j<two.length() || k<three.length()){
			
			if(i <one.length() && one.charAt(i)==three.charAt(k)){
				i++;k++;
			}else if(j< two.length() && two.charAt(j)==three.charAt(k)){
				j++;k++;
			}else{
				System.out.println("Not Possi"); break;
			}
		}
		System.out.println("I: "+i+" j: "+j+" k: "+k);
	}

}
