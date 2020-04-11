package com.dsr.trees;

public class BinaryTreeFromArray {
	BinaryTree tree = new BinaryTree();
	public void createTree(int[] parent, int n) {

		Node[] nodes = new Node[n];
		Node temp=null;
		

		for (int i = 0; i < n; i++) {
			nodes[i]=null;
		}
		
		
		for (int i = 0; i < n; i++) {
			 
			 
			createNodes(parent, i, nodes);

		}

	}
	
	
	public void createNodes(int parent[], int i, Node[] created)
	{
		created[i]=new Node(i);
		
		if(parent[i] ==  -1)
		{
			 tree.root=created[i];
			 return ;
			
		}
		
		if(created[parent[i]] == null)
		{
			createNodes(parent, parent[i], created);
		}
		
		Node p=created[parent[i]];
		
		if(p.left == null)
		{
			p.left=created[i];
		}else {
			p.right=created[i];
		}
		
	}

	public static void main(String[] args) {
		BinaryTreeFromArray tree = new BinaryTreeFromArray();
		int parent[] = new int[] { -1, 0, 0, 1, 1, 3, 5 };
		int n = parent.length;
		
		tree.createTree(parent, n);
		
		BinaryTree.printInorder(tree.tree.root);
	}

}
