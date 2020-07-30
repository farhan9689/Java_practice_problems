package manualLinkedList;

import java.util.Scanner;

import linkedlist.LinkedList;

public class Test {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;
		while(flag){
		System.out.println("\n1.add iteem to the list at start");
		System.out.println("2.add iteem to the list at last");
		System.out.println("3.add iteem to the list at pos");
		System.out.println("4.delete first item ");
		System.out.println("5. delete last item");
		System.out.println("6.delete item from given position");
		System.out.println("7. view list");
		System.out.println("8. get list size");
		System.out.println("9. exit ");
		System.out.println("Enter your choice");
		 int pos, val;
		int choice =sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("enter the element");
			val=sc.nextInt();
			list.insertAtFirst(val);
			break;
		case 2:
			System.out.println("enter the element");
			val=sc.nextInt();
			list.insertAtLast(val);
			break;
		case 3:
			System.out.println("enter position");
			pos= sc.nextInt();
			System.out.println("insert value to insert");
			val = sc.nextInt();
			list.insertAtPos(val, pos);
			break;
		case 4:
			list.deleteFirst();
			break;
		case 5:
			list.deleteLast();
			break;
		case 6:
			System.out.println("Enter position ");
			pos = sc.nextInt();
			list.deleteAtPosition(pos);
			break;
		case 7: 
			list.viewList();
			break;
		case 8:
			System.out.println(list.getListSize());
			break;
		case 9:
			flag = false;
			break;
		default: System.out.println("envalid choice");
		}
		}//while
	}

}
