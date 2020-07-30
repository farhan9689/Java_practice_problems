package linkedList2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		Methods m=new Methods();
		while(true){
		System.out.println("---welcome---");
		System.out.println("select option with there number");
		System.out.println("1.add iteem to the list at start");
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
				m.insertFirst(val);
				break;
			case 2:
				System.out.println("enter the element");
				val=sc.nextInt();
				m.insertLast(val);
				break;
			case 3:
				System.out.println("enter position");
				pos= sc.nextInt();
				System.out.println("insert value to insert");
				val = sc.nextInt();
				m.insertAnywhere(val, pos);
				break;
			case 4:
				m.deleteFirst();
				break;
			case 5:
				m.deleteLast();
				break;
			case 6:
				System.out.println("Enter position ");
				pos = sc.nextInt();
				m.deleteAny(pos);
				break;
			case 7: 
				m.showList();
				break;
			case 8:
				System.out.println(m.listSize());
				break;
			case 9:
				flag = false;
				break;
			default: System.out.println("envalid choice");
			}
	
		}
	}

}
