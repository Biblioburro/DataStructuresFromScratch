package linkedLists;
//Simple generic container class for a linked list
public class linkedList <T> {
	//default constructor
	public linkedList() {
		head = null;
		tail = null;
	}
	
	//parameterized constructor for creating a LL from a provided head and tail
	public linkedList(listNode<T> h,listNode<T> t) {
		this.head = h;
		this.tail = t;
	}
	//parameterized constructor for creating a LL from a provided head
	public linkedList(listNode<T> h) {
		this.head = h;
		//if statement to check if the node has a tail
		if(this.head.hasLink()) {
			tail = h;
			//do while loop to advance the tail to the proper position
			do {
				tail = tail.getLink();
			}while(tail.getLink()!= null);
		}else {
			tail = h;
		}
		
		
	}
	//constructor to initialize a list from provided data
	public linkedList(T data) {
		head = new listNode<T>(data);
		tail = head;
		
		
	} 
	//Append a node to the end of the list
	public void append(listNode<T> node) {
		//appending to an empty list
		if(tail == null&& head == null) {
			
		}else
		{
		tail.setLink(node);
		tail = tail.getLink();
		}
	}
	//Append a new node generated from the provided data to the end of the list
	public void append(T data ) {
		//appending to an empty list;
		if(tail == null && head == null) {
			head = new listNode<T>(data);
			tail = head;
		//any other state of the list
		}else { 
		tail.setLink(new listNode<T>(data));
		tail = tail.getLink();
		}
	}
	//utility function to print node
	public void printList() {
		listNode<T> temp = head;
		while(temp != null) {
			if(temp.hasLink()) {
			System.out.print(temp.getData()+"->");
			}else {
			System.out.print(temp.getData());
			}
			temp = temp.getLink();
		}
		System.out.println();
	}
	//utility function to get the size of the list
	public int size() {
		//variable to store the size
		int size = 0;
		//if the list is empty
		if(head == null) {
			return 0;
		}
		//traverse through to the end of the list incrementing the size of the 
		//array
		for(listNode<T> cursor = head;cursor != null;cursor = cursor.getLink()) {
			size++;
		}

		return size;
	}
	
listNode<T> head;
listNode<T> tail;

}
