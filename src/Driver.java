import linkedLists.linkedList;
import binaryTree.*;
import java.util.Scanner;
public class Driver {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
	
	int userChoice = 0;	
	
	//do while loop to handle user input
	do {
		printMenu();
		userChoice = scan.nextInt();
		switch(userChoice) {
		case 1:
			linkedListTest();
			break;
		case 2:
			binaryTreeTest();
			break;
		default:
		}
		
	}while(userChoice >0);
	System.out.println("Program exited successfully");
	scan.close();
	}
	//method to print the menu options
	public static void printMenu() {
		System.out.println("Enter the corresponding number\nfor the option you would like\n(enter a negative value to exit)");
		System.out.println("1: linked list test");
		System.out.println("2: binary tree testing\n");
	}
	//method to handle linked list testing
	public static void linkedListTest() {
		System.out.println("Initializing a linked list with random integers(long) \nExpected Size : 10");
		//Declare and intialize a linkedList of integer types
		linkedList<Long> L1 = new linkedList<Long>();
		//populate the linked list with integers
		for(Integer i =1;i<=10;i++) {
			L1.append(Math.round(((100)*Math.random())));
		}
		L1.printList();
		System.out.print("Actual Size of linked List: ");
		System.out.println(L1.size());
		System.out.println();
	}
	//method to handle binary tree testing
	public static void binaryTreeTest() {
		System.out.println("binarytreeTest");
		System.out.println();
	}
	
}
