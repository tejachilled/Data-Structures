package com.Arrays;

public class MinMaxLessOperations {

	/**
	 * time complexity 3(n-1) for odd
	 * 3(n-2)/2 -1 for even
	 */
	static class Element{
		public static int min;
		static int max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1000,11,446,1,330,3000};
		Element ele = new Element();
		int j = 0;
		if(a.length%2==0){
			if(a[0]>a[1]){
				ele.min = a[1];
				ele.max = a[0];
			}else{
				ele.min = a[0];
				ele.max = a[1];
			}
			j = 2;
		}else{
			ele.min = a[0];
			ele.max = a[0];
			j=1;
		}

		for(;j<a.length-1;j++){
			if(a[j] > a[j+1]){
				ele.max = (ele.max >a[j]? ele.max:a[j]);
				ele.min = (ele.min < a[j+1]? ele.min:a[j+1]);
			}else{
				ele.max = (ele.max >a[j+1]? ele.max:a[j+1]);
				ele.min = (ele.min < a[j]? ele.min:a[j]);
			}
		}
		System.out.println(ele.max);
		System.out.println(ele.min);
	}

}
