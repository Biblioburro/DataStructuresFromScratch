package linkedLists;

public class listNode<T> {
	//constructors
	public listNode() {
		data = null;
	}
	//parameterized constructor for initializing a node with no link and provided data
	public listNode(T dat) {
		data = dat;
		link  = null;
	}
	//parameterized constructor for 
	public listNode(T dat,listNode<T> lnk) {
		data = dat;
	 link = lnk;
		
	}
	//mutator functions
	public void setData(T dat) {
		data = dat;
	}
	public void setLink(listNode<T> lnk) {
		link = lnk;
	}
	//accessor functions
	public T getData() {
		return data;
	}
	public listNode<T> getLink(){
		return link;
	}
	//function to return if the node has a link
	public boolean hasLink() {
		if(link != null) {
			return true;
		}else {
			return false;
		}
		
	}
//data values
	T data;
	listNode<T> link;
}
