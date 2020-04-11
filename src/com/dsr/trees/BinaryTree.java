package com.dsr.trees;

public class BinaryTree {
	 // Root of Binary Tree 
    Node root; 
  
    // Constructors 
    BinaryTree(int key) 
    { 
        root = new Node(key); 
    } 
  
    BinaryTree() 
    { 
        root = null; 
    }  
    
    /* Given a binary tree, print its nodes according to the 
    "bottom-up" postorder traversal. */
  void printPostorder(Node node) 
  { 
      if (node == null) 
          return; 

      // first recur on left subtree 
      printPostorder(node.left); 

      // then recur on right subtree 
      printPostorder(node.right); 

      // now deal with the node 
      System.out.print(node.key + " "); 
  } 

  /* Given a binary tree, print its nodes in inorder*/
  static void printInorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first recur on left child */
      printInorder(node.left); 

      /* then print the data of node */
      System.out.print(node.key + " "); 

      /* now recur on right child */
      printInorder(node.right); 
  } 

  /* Given a binary tree, print its nodes in preorder*/
  static void printPreorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first print data of node */
      System.out.print(node.key + " "); 

      /* then recur on left sutree */
      printPreorder(node.left); 

      /* now recur on right subtree */
      printPreorder(node.right); 
  } 
    
    public static void main(String[] args) {
    	BinaryTree tree = new BinaryTree(); 
    	  
    	tree.root = new Node(10); 
    	tree.root.left = new Node(11); 
    	tree.root.left.left = new Node(7); 
    	tree.root.right = new Node(9); 
    	tree.root.right.left = new Node(15); 
    	tree.root.right.right = new Node(8); 
    } 
    
	
  
}
