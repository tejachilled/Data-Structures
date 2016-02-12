package com.binarytree;

public class PrintPostFromInOrdPreOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inord[] = {4,2,5,1,6,3,7};
		int preord[] = {1,2,4,5,3,6,7};

		printPostOrd(inord,preord,0,inord.length);
	}
	static int preIndex = 0;
	private static void printPostOrd(int[] inord, int[] preord,int low,  int high) {
		if(low < high && preIndex<inord.length) {
			int index = search(inord,preord[preIndex],low,high);
			if(index != -1){
				int cur = preIndex;
				preIndex++;
				printPostOrd(inord,preord,low,index);
				printPostOrd(inord, preord,index,high);
				System.out.print(preord[cur]+" ");
			}
		}
	}

	private static int search(int[] inord,int preIndex, int low, int high) {
		int i= -1;

		for( i = low; i<high;i++){
			//System.out.print(i+ " ");
			if(inord[i]==preIndex) return i;
		}
		return -1;
	}


}
