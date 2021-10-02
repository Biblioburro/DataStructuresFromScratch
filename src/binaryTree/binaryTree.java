package binaryTree;

public class binaryTree <T> {
	//default constructor to create an empty tree
	public binaryTree() {
		root = null;
	}
	//construct a tree from an existing root
	public binaryTree(BTnode<T> rt) {
		root = rt;
	}
	
	
	//mutator methods
	public void setRoot(BTnode<T> newRoot) {
		root = newRoot;
	}
	//insert a node into the tree
	public void setLeftChild(BTnode<T> newNode) {
		root.setLeftChild(newNode);
		}
	//insert a node as the left child of 
	public void setRightChild(BTnode<T> newNode) {
					root.setLeftChild(newNode);
		}
	//accessor methods
	public BTnode<T> getRoot(){
		return root;
	}
	public BTnode<T> getLeftChild(){
		return root.getLeftChild();
	}
	//
	private BTnode<T> root;
	private int depth = 0;
	
}
