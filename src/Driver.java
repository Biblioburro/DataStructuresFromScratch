import linkedLists.linkedList;
import binaryTree.*;
public class Driver {
 
	public static void main(String[] args) {
	LinkedListTest();
		
		
	}
	public static void LinkedListTest() {
		System.out.println("Initializing a linked list with random integers \nExpected Size : 10");
		//Declare and intialize a linkedList of integer types
		linkedList<Long> L1 = new linkedList<Long>();
		//populate the linked list with integers
		for(Integer i =1;i<=10;i++) {
			L1.append(Math.round(((100)*Math.random())));
		}
		L1.printList();
		System.out.print("Actual Size of linked List: ");
		System.out.println(L1.size());
	}
	
	
}
