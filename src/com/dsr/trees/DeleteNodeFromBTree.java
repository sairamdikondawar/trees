package com.dsr.trees;

import java.util.LinkedList;

public class DeleteNodeFromBTree {
BinaryTree tree;
	
	public void setupTestDate()
	{
		tree= new BinaryTree(); 
	  	  
		tree.root = new Node(13); 
    	tree.root.left = new Node(12); 
    	tree.root.left.left = new Node(4); 
    	tree.root.left.right = new Node(19); 
    	tree.root.right = new Node(10); 
    	tree.root.right.left = new Node(16); 
    	tree.root.right.right = new Node(9); 
	}
	  
	public void deleteNode(int i)
	{
		LinkedList<Node> queue=new LinkedList<Node>();
		Node temp=null;
		if(tree.root.key == i && tree.root.left == null && tree.root.right == null)
		{
			tree.root=null;
			System.out.print("\nDeleting Root node if there are no childs");
			return;
		} 
		queue.add(tree.root);
		while(queue.size()!=0) {
			Node key =queue.poll();
			  { 
				if(key.left != null )
				{
					temp=key.left;
//					System.out.println(" Left Key :: "+key.key);
					queue.add(key.left); 
				} 
					
					
			 if(key.right != null) {
					temp=key.right;
					 
//					System.out.println(" Right Key :: "+key.key);
					queue.add(key.right);
				} 
					
			} 
				
					
		}
		 
		this.deleteDepestNode(temp,i);
		 
		
		
	}
	
	public void deleteDepestNode(Node tempNode, int deleteInt)
	{
		LinkedList<Node> queue=new LinkedList<Node>();
		
		
		
		queue.add(tree.root);
		
		while(queue.size()!=0) {
			Node key =queue.poll();
			  
				  
				  
				if(key.left != null && key.left.key==tempNode.key )
				{
					key.left =null;
					 break;
				}else if(key.left!=null)
					queue.add(key.left);
					
			 if(key.right != null && key.right.key==tempNode.key) {
				 key.right=null;
					 break;
				} else if(key.right!=null)
					queue.add(key.right);
			 
			 if(key.key  == deleteInt && key.key!= tempNode.key) {
				  key.key=tempNode.key;
			  }	
					
		}
		 
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		DeleteNodeFromBTree t=new DeleteNodeFromBTree();
		t.setupTestDate();
		System.out.print ("Before Deleting :: ");
		BinaryTree.printInorder(t.tree.root); 
		 
		t.deleteNode(13);
		
		System.out.println("\nAfter Deleting");
		BinaryTree.printInorder(t.tree.root);
	}
}
