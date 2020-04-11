package com.dsr.trees;

import java.util.LinkedList;

public class InsertElementTree {
	BinaryTree tree;
	
	public void setupTestDate()
	{
		tree= new BinaryTree(); 
	  	  
		tree.root = new Node(10); 
    	tree.root.left = new Node(11); 
    	tree.root.left.left = new Node(7); 
    	tree.root.right = new Node(9); 
    	tree.root.right.left = new Node(15); 
    	tree.root.right.right = new Node(8); 
	}
	
	public void addElement(int i)
	{
		LinkedList<Node> queue=new LinkedList<Node>();
		Node node=tree.root;
		queue.add(tree.root);
		while(queue.size()!=0) {
			Node key =queue.poll();
			  {
				if(key.left == null )
				{
					key.left=new Node(i);
					break;
				}else if(key.left!=null)
					queue.add(key.left);
					
					if(key.right == null) {
					key.right=new Node(i);
					break;
				} else if(key.right!=null)
					queue.add(key.right);
			} 
				
					
		}
		
	}
	 
	
	
	public static void main(String[] args) {
		
		
		InsertElementTree t=new InsertElementTree();
		t.setupTestDate();
		System.out.print ("Before Adding :: ");
		BinaryTree.printInorder(t.tree.root);
	
		
		
		 
		t.addElement(12);
		
		System.out.println("\nAfter Add");
		BinaryTree.printInorder(t.tree.root);
	}

}
