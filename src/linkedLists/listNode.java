package linkedLists;

public class listNode<T> {
	//constructors
	public listNode() {
		
	}
	public listNode(T dat) {
		data = dat;
		link  = null;
	}
	public listNode(T dat,listNode lnk) {
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
	//function to Return if the node is linked
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
