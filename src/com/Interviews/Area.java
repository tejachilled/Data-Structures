package com.Interviews;

import java.util.Arrays;
import java.util.Stack;



public class Area {

	public static void main(String args[]){
		char arr[][]=new char [2][3];
		for(char [] t:arr)
			Arrays.fill(t, '1');

		String water="0,0|0,1|1,0|1,1";
		String num1[]=water.split("\\|");
		for(int i=0; i<num1.length; i++){
			String temp[]=num1[i].split(",");
			int b=Integer.parseInt(temp[0].trim());
			int a=Integer.parseInt(temp[1].trim());
			arr[a][b]='0';
		}


		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[0].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}


		int count=0;
		int area=0; 
		for(int i=0; i<arr.length;i++)
			for(int j=0; j<arr[0].length;j++){
				if(arr[i][j]=='0'){
					count=0;
					break;
				}
				else if(j==arr[0].length-1){
					count=count+arr[0].length;
				}

				if(count>area){
					area = count;
				}
			}
		count=0;
		for(int j=0; j<arr[0].length;j++){
			for(int i=0; i<arr.length;i++){
				if(arr[i][j]=='0'){
					count=0;
					break;
				}
				else if(i==arr.length-1){
					count=count+arr.length;
				}
				if(count>area){
					area = count;
				}
			}
		}
		System.out.println(area);
		System.out.println(maximalRectangle(arr));

	}
	public static int maximalRectangle(char[][] matrix) {
        if (matrix==null ||matrix.length==0){
            return 0;
        }
        
        int[][] heights=new int[matrix.length][matrix[0].length];
        
        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[0].length; col++){
                if (row==0){
                    heights[row][col]=matrix[row][col]=='0'?0:1;
                }
                else{
                    heights[row][col]=matrix[row][col]=='0'?0:heights[row-1][col]+1;
                }
            }
        }
        
        int max=0;
        
        for (int row=0; row<heights.length; row++){
          // update max with maxArea of each row
            max=Math.max(max, maxArea(heights[row]));
        }
        
        return max;
    }
    // calculate maxArea for each row
    private static int maxArea(int[] heights){
        if (heights==null||heights.length==0){
            return 0;
        }
        
        Stack<Integer> stack=new Stack<Integer>();
        int max=0;
        
        int i=0;
        while(i<heights.length){
            if (stack.isEmpty()||heights[stack.peek()]<=heights[i]){
                stack.push(i);
                i++;
            }
            else{
                int height=heights[stack.pop()];
                
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                
                max=Math.max(max, height*width);
            }
            
        }
        while(!stack.isEmpty()){
            int height=heights[stack.pop()];
            
            int width=stack.isEmpty()?i:i-stack.peek()-1;
            max=Math.max(max, height*width);
        }
        
        return max;
        
    }

}
