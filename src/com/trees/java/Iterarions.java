package com.trees.java;
import java.util.Stack;

public class Iterarions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	/* Traverse until the stack is not empty. First store
	 * the right and then the left in the stack 
	 * so that the left is popped first. The popped 
	 * element is the current element in each iteration*/
	public void preOrderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node current;
		stack.push(root);
		while(!stack.isEmpty())
		{
			current = stack.pop();
			System.out.println(current.data);
			if(current.right != null)
			{
				stack.push(current.right);
			}
			if(current.left != null)
			{
				stack.push(current.left);
			}
		}
	}
	
	/* Traverse until the stack is not empty or current element
	 * is not null. */
	public static void iterativeinorder(BSTnode root){
		Stack<BSTnode> s = new Stack<BSTnode>();
		while(root !=null){
			s.push(root);
			root = root.left;
		}
		while(s.size()>0){
			BSTnode node =s.pop();
			System.out.println(node.data);
			if(node.right!=null){
				node = node.right;
				while(node !=null){
					s.push(node);
					node = node.left;
				}
			}
		}
	}
	
	public void postOrderTraversal(Node root) 
	{
		if(root == null)
		{
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		do
	    {
	        // Move to leftmost node
	        while (root!=null)
	        {
	            // Push root's right child and then root to stack.
	            if (root.right!=null)
	                stack.push(root.right);
	            stack.push(root);
	 
	            // Set root as root's left child  
	            stack.push(root.left);
	        }
	 
	        // Pop an item from stack and set it as root    
	        root = stack.pop();
	 
	        // If the popped item has a right child and the right child is not
	        // processed yet, then make sure right child is processed before root
	        if (root.right!=null && stack.peek() == root.right)
	        {
	            TreeNode temp =stack.pop();  // remove right child from stack
	            stack.push(root);  // push root back to stack
	            root = root.right; // change root so that the right 
	                                // child is processed next
	        }
	        else  // Else print root's data and set root as NULL
	        {
	            printf("%d ", root.data);
	            root = null;
	        }
	    } while (!stack.isEmpty());
	}
	
}


