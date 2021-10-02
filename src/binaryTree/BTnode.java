package binaryTree;
	//simple node class for representing a Binary tree
	//assumes that T is a data type that has implemented
	//comparable
public class BTnode <T> {
	//default constructor
	BTnode(){
		data = null;
	}
	//constructor to initialize
	BTnode(T dat){
		data = dat;
		left = null;
		right = null;
	}
	//constructor for data and children
	//pass null for empty child
	BTnode(T dat , BTnode<T> l,BTnode<T> r){
		data = dat;
		right = r;
		left = l;
	}
	//Mutator methods
	public void setData(T dat) {
		data = dat;
	}
	public void setLeftChild(BTnode<T> lnode) {
		left = lnode;
	}
	public void setRightChild(BTnode<T> rnode) {
		right = rnode;
	}
	public BTnode<T> getLeftChild(){
		return left;
	}
	public BTnode<T> getRightChild(){
		return right;
	}
	private T data;
	private BTnode<T> left;
	private BTnode<T> right;
	
}
