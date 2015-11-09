package com.trees.java;

public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public class Solution {
		11     public TreeNode buildTree(int[] preorder, int[] inorder) {
		12         // Start typing your Java solution below
		13         // DO NOT write main() function
		14         int preLength = preorder.length;
		15         int inLength = inorder.length;
		16         return buildTree(preorder, 0, preLength-1, inorder, 0, inLength-1);
		17     }
		18    
		19     public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
		20         if(inStart > inEnd){
		21             return null;
		22         }
		23         int rootVal = pre[preStart];
		24         int rootIndex = 0;
		25        
		26         for(int i = inStart; i <= inEnd; i++){
		27             if(in[i] == rootVal){
		28                 rootIndex = i;
		29                 break;
		30             }
		31         }
		32        
		33         int len = rootIndex - inStart;
		34         TreeNode root = new TreeNode(rootVal);
		35         root.left = buildTree(pre, preStart+1, preStart+len, in, inStart, rootIndex-1);
		36         root.right = buildTree(pre, preStart+len+1, preEnd, in, rootIndex+1, inEnd);
		37        
		38         return root;
		39     }
		}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inStart = 0;
        int inEnd = inorder.length-1;
        int postStart =0;
        int postEnd = postorder.length-1;
 
        return buildTree(inorder, inStart, inEnd, postorder, postStart, postEnd);
    }
 
    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, 
                            int[] postorder, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd)
            return null;
 
        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);
 
        int k=0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==rootValue){
                k = i;
                break;
            }
        }
        root.left = buildTree(inorder, inStart, k-1, postorder, postStart, postStart+k-(inStart+1));
        // Becuase k is not the length, it it need to -(inStart+1) to get the length
        root.right = buildTree(inorder, k+1, inEnd, postorder, postStart+k-inStart, postEnd-1);
        // postStart+k-inStart = postStart+k-(inStart+1) +1
 
        return root;
    }
}
